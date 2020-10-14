package com.stepDefination.web_sd;

import com.stepDefination.utility.DriverClass;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import org.junit.Assert;
import org.openqa.selenium.By;

public class Woman_sd extends DriverClass {
    @When("^I click on Woman button on home page$")
    public void iClickOnWomanButtonOnHomePage() {
        driver.findElement(By.linkText("Women")).click();

    }

    @Then("^I should see the page contain Url as \"([^\"]*)\"$")
    public void iShouldSeeThePageContainUrlAs(String ExpectedUrl)  {
        String actual_url = driver.getCurrentUrl();
        Assert.assertEquals(ExpectedUrl,actual_url);
        System.out.println(ExpectedUrl);
        System.out.println(actual_url);

    }

    @Then("^I scroll down the page$")
    public void iScrollDownThePage() {
        driver.getWindowHandle();
    }



}
