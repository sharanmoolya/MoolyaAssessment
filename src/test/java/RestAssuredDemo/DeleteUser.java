package RestAssuredDemo;

import io.restassured.RestAssured;
import org.testng.annotations.Test;
import  static io.restassured.RestAssured.*;

public class DeleteUser {
    @Test
    public void deleteUser(){
        RestAssured.baseURI="https://reqres.in";
        given().when().delete("/api/users/2").then().assertThat().statusCode(204).extract().response().asString();
        //System.out.println(res);
    }
}
