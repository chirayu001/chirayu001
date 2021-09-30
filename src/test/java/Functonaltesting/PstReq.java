package Functonaltesting;
import org.testng.annotations.Test;

import io.restassured.RestAssured;
import io.restassured.response.Response;
public class PstReq {
	@Test
  public void PostReq() {
	  RestAssured.baseURI="https://reqres.in/api/users";
	  String json="{\r\n"
	  		+ "    \"name\": \"morpheus\",\r\n"
	  		+ "    \"job\": \"leader\"\r\n"
	  		+ "}";
	 RestAssured.given().body(json).post().then().log().all().assertThat().statusCode(201);
	  
	  
  }
}
