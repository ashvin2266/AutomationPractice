package com.stepDefination.web_sd;

import com.jayway.jsonpath.JsonPath;
import com.jayway.restassured.RestAssured;
import com.jayway.restassured.response.Response;
import com.stepDefination.apiUtils.services;
import cucumber.api.PendingException;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import org.json.simple.parser.ParseException;
import org.junit.Assert;

import java.io.IOException;

import static com.jayway.restassured.RestAssured.given;

public class getLocation_sd extends services {
    Response response;
    @When("^I trigger GET request with \"([^\"]*)\" headers with city as \"([^\"]*)\"$")
    public void iTriggerGETRequestWithHeadersWithCityAs (String city, String headers){
        response = getServices(city, headers);
        System.out.println(response.getStatusCode());
        System.out.println(response.getStatusLine());
        System.out.println(response.getBody());
        System.out.println(response.getHeaders());
    }




        @Then("^I should see response code as (\\d+)$")
        public void iShouldSeeResponseCodeAs ( int code){

            Assert.assertEquals(code, response.getStatusCode());
        }

        @Then("^I should see response message as \"([^\"]*)\"$")
        public void iShouldSeeResponseMessageAs (String responseMsg){
            Assert.assertTrue(response.getStatusLine().contains(responseMsg));
        }


    @Then("^I should see response body as\"([^\"]*)\" is \"([^\"]*)\"$")
    public void iShouldSeeResponseBodyAsIs(String attribute, String expectedValue)  {
        String actualValue= com.jayway.jsonpath.JsonPath.read(response.getBody().asString(),attribute);
        Assert.assertEquals(expectedValue,actualValue);
//        Assert.assertTrue(actualValue.contains(expectedValue));
        System.out.println(actualValue);
        System.out.println(expectedValue);
        {
                    }}

    @When("^I trigger availability POST Request with \"([^\"]*)\" as a postbody$")
    public void iTriggerAvailabilityPOSTRequestWithAsAPostbody(String jsonFile) throws IOException, ParseException {
         response = postServices(jsonFile);






    }


}



