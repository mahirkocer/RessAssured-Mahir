package com.cydeo.day01;

import io.restassured.RestAssured;
import io.restassured.response.Response;
import org.junit.jupiter.api.Test;

public class SımpleGetRequest {
    String url = "http://54.197.84.147:8000/api/spartans";

    @Test
    public void tst1(){
        Response response = RestAssured.get(url);

        System.out.println("response.statusCode() = " + response.statusCode());
    }
}
