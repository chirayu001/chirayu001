package Functonaltesting;
import static io.restassured.RestAssured.*;
import static io.restassured.matcher.RestAssuredMatchers.*;

import org.testng.annotations.Test;

import io.restassured.RestAssured;
import io.restassured.response.Response;


public class GetRequest {
	
     @Test
     public void getRequest() {
    	
    	RestAssured.baseURI="https://reqres.in/api/users?page=2";
     Response response=RestAssured.given().param("page", "2").when().get();
     System.out.println("Status code is:" +response.statusCode());
     System.out.println("getbody:"+response.getBody().asString());
     System.out.println(response.prettyPrint());
             
          
     
     
     
     
     
     }
}
