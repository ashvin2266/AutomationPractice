package com.stepDefination.apiUtils;

import com.google.gson.JsonObject;
import com.jayway.restassured.response.Response;
import com.jayway.restassured.response.ValidatableResponse;
import org.json.simple.JSONObject;
import org.json.simple.parser.JSONParser;
import org.json.simple.parser.ParseException;


import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

import static com.jayway.restassured.RestAssured.given;

public class services {
    Response response;

    public Response getServices(String city,String headers) {

          response = given().log().all().
                       when().
                  header("Content-Type","application/json").
                 get("https://www.premierinn.com/services/en/mobileHotelLocator/suggestions/"+ city).
                then().log().all().extract().response();
         return response;
    }

        public Response postServices(String jsonFile) throws IOException, ParseException {
//        READ THE JSONFILE
            String path = System.getProperty("user.dir");

            String file = path + "/src/test/java/com/testData/" + jsonFile;
                    JSONParser jsonParser = new JSONParser();
         JSONObject  jsonObject = (JSONObject)jsonParser.parse(new FileReader(file));
            response = given().log().all().
                  when().
                  body(jsonObject).
                  post(" https://www.premierinn.com/whitbread-services-unsecured/booking/availabilities").
                  then().log().all().extract().response();
            System.out.println(response);

        return response;

    }







}








