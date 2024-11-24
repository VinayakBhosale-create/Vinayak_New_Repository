package API_demo;

import org.testng.annotations.Test;

import io.restassured.RestAssured;
import io.restassured.response.Response;

public class Test01_Get
{
	
	@Test
	public void Test01() 
	{
		Response response = RestAssured.get("\r\n"
				+ "https://gorest.co.in/public/v2/users");
		System.out.println(response.asString());
		System.out.println(response.getBody().asString());
		System.out.println(response.getStatusCode());
		System.out.println(response.getTime());
		System.out.println(response.getHeader("content-type"));
		System.out.println(response.getStatusLine());
	}

}
