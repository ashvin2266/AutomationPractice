package com.stepDefination;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import org.openqa.selenium.By;

public class search_sd extends DriverClass {
    @When("^I click search button on home page$")
    public void iClickSearchButtonOnHomePage() {
        driver.findElement(By.xpath("/html/body/header[1]/section[2]/div/div/div/button")).click();

    }

    @Then("^I  should see the search page url as \"([^\"]*)\"$")
    public void iShouldSeeTheSearchPageUrlAs(String searchUrl)  {
        driver.getCurrentUrl();
        System.out.println(searchUrl);

    }

    @Given("^I search Item  as \"([^\"]*)\"$")
    public void iSearchItemAs(String items)  {
        driver.findElement(By.xpath("//*[@id=\"search\"]/div[1]/div/form/input")).sendKeys(items);


    }

    @When("^I click search button$")
    public void iClickSearchButton() {
        driver.findElement(By.xpath("//*[@id=\"search\"]/div[1]/div/form/button")).click();
    }

//    @Given("^I am on homepage$")
//    public void iAmOnHomepage() {
//        driver.getCurrentUrl();
//    }
}
