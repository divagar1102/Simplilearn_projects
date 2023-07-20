package project1;
	import java.sql.*;
	public class Ecommerce {
		    public static void main(String[] args) {
		        String url = "jdbc:mysql://localhost:3306/ecommerce"; 
		        String user = "root"; 
		        String password = "Aspirine1102#"; 

		        String product_type = "Commercial"; 

		        try (Connection connection = DriverManager.getConnection(url, user, password)) {
		            String query = "SELECT COUNT(*) AS productCount FROM products WHERE product_type = ?";
		            try (PreparedStatement preparedStatement = connection.prepareStatement(query)) {
		                preparedStatement.setString(1, product_type);

		                try (ResultSet resultSet = preparedStatement.executeQuery()) {
		                    if (resultSet.next()) {
		                        int count = resultSet.getInt("productCount");
		                        System.out.println("Total product " + product_type + ": " + count);
		                    } else {
		                        System.out.println("No products available '" + product_type );
		                    }
		                }
		            }
		        } catch (SQLException e) {
		            e.printStackTrace();
		        }
		    }
		}

