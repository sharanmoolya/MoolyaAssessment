package RestAssuredDemo;

import io.restassured.RestAssured;
import org.testng.annotations.Test;
import static io.restassured.RestAssured.*;
import static org.hamcrest.Matchers.*;
public class GetRequest {
    @Test
    public void getUserdetails(){
        RestAssured.baseURI="https://reqres.in";
        String details=given().when().get("/api/users/2").then().assertThat().statusCode(200).extract().response().asString();
        System.out.println(details);
    }
}
