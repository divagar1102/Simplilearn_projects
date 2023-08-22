package in.amazon.RestAssuredDemo;

import java.util.HashMap;

import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import io.restassured.RestAssured;

public class RestAssuredRequest extends TestBase {
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
	HashMap<String, String> map = new HashMap<String, String>();
	@BeforeMethod
	public void createPayLoad() {
		map.put("name","morpheus" );
		map.put("job", "painter");
		RestAssured.baseURI = "https://reqres.in/";
		RestAssured.basePath = "/api/users";
		logger.info("Payload Created");
	}
	@Test
	public void createResource() {
		RestAssured
		       .given()
		             .contentType("application/json")
		             .body(map)
		       .when()
		             .post()
		       .then()
		             .statusCode(201)
		             .log().all();
		logger.info("Resource Created Successfully");
}
	
}
