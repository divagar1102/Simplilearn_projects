package com.simplilearn.RestAssuredSportyShoes;

import java.util.HashMap;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import io.restassured.RestAssured;

public class POSTFunction {
	HashMap<String, String> map = new HashMap<String, String>();
	@BeforeMethod
	public void createPayLoad() {
		map.put("name","Elegant Leather Running Loafers " );
		map.put("category", "Sports");
		RestAssured.baseURI = "http://localhost:9010/add-shoe";
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
		        
	}
}

