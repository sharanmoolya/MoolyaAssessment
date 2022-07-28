package RestAssuredDemo;

import io.restassured.RestAssured;
import io.restassured.path.json.JsonPath;
import org.testng.Assert;
import org.testng.annotations.Test;

import java.util.HashMap;

import static io.restassured.RestAssured.*;
import static org.hamcrest.Matchers.*;

public class PostRequest {
    @Test
    public void addNewUser(){
        RestAssured.baseURI="https://reqres.in";
        HashMap<String,String> user=new HashMap<String,String>();
        user.put("name","morpheus");
        user.put("job","leader");
        String res=given().header("Content-Type","application/json").body(user).when().post("/api/users").
                then().body("name",equalTo("morpheus")).
                body("job",equalTo("leader")).
                assertThat().statusCode(201).extract().response().asString();
        System.out.println(res);
        JsonPath jp=new JsonPath(res);
       String name= jp.getString("name");
        System.out.println(name);
        //Assert.assertEquals(name,"morpheus");

    }



}
