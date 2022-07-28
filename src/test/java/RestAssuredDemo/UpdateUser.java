package RestAssuredDemo;

import io.restassured.RestAssured;
import io.restassured.path.json.JsonPath;
import org.testng.annotations.Test;

import java.util.HashMap;

import static io.restassured.RestAssured.*;


public class UpdateUser {
    @Test
    public void updateUserdetails(){
        RestAssured.baseURI="https://reqres.in";
        HashMap<String,String> user=new HashMap<String,String>();
        user.put("name","morpheus");
        user.put("job","leader");
       String res= given().header("Content-type","application/json").body(user).
               when().put("/api/users/2").
               then().assertThat().statusCode(200).
               extract().response().asString();
        System.out.println(res);
        JsonPath jp=new JsonPath(res);
       String name= jp.getString("name");
       String job= jp.getString("job");
        System.out.println("name="+name);
        System.out.println("job="+job);

    }
}
