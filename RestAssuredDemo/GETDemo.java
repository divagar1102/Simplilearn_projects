package in.amazon.RestAssuredDemo;
import org.testng.annotations.Test;
import io.restassured.RestAssured;
public class GETDemo {
@Test
public void getServerResponse() {
	RestAssured
	     .when()
	          .get("https://reqres.in/api/users?page=2")
	     .then()
	          .assertThat()
	          .statusCode(200)
	          .log().all();
}
}
