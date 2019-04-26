package com.stepDefination;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import org.junit.Assert;
import org.openqa.selenium.By;

public class registration_sd extends DriverClass {
    String actual_result;

    @When("^I click on Register button on home page$")
    public void iClickOnRegisterButtonOnHomePage() {

        driver.findElement(By.linkText("Register")).click();
    }
    @Then("^I should see the Register page url as \"([^\"]*)\"$")
    public void iShouldSeeTheRegisterPageUrlAs(String expectedURL) {
        String actualURL;
        actualURL= driver.getCurrentUrl();
        Assert.assertEquals( "https://www.d3dsecurity.co.uk/register/" ,actualURL);
        System.out.println(expectedURL);

    }

    @Given("^I enter valid First name as \"([^\"]*)\"$")
    public void iEnterValidFirstNameAs(String firstName)  {
        driver.findElement(By.name("first_name")).sendKeys(firstName);

    }

    @Given("^I enter valid Last name as \"([^\"]*)\"$")
    public void iEnterValidLastNameAs(String lastName){

        driver.findElement(By.name("last_name")).sendKeys(lastName);
    }

    @Given("^I enter valid Email id as \"([^\"]*)\"$")
    public void iEnterValidEmailIdAs(String Email) {

        driver.findElement(By.name("email")).sendKeys(Email);

    }

    @Given("^I enter valid password as \"([^\"]*)\"$")
    public void iEnterValidPasswordAs(String password)  {
        driver.findElement(By.name("pass1")).sendKeys(password);
    }

    @Given("^I enter confirm password as\"([^\"]*)\"$")
    public void iEnterConfirmPasswordAs(String confirmpassword) {
       driver.findElement(By.name("pass2")).sendKeys(confirmpassword);
    }

    @When("^I click Register button on Register page$")
    public void iClickRegisterButtonOnRegisterPage() {
        driver.findElement(By.name("btn-submit")).click();
    }

    @Then("^I should see error as \"([^\"]*)\"$")
    public void iShouldSeeErrorAs(String errorMessage) {

        actual_result = driver.findElement(By.xpath("//*[@id=\"post-4519\"]/div/div[1]/p")).getText();
        System.out.println(errorMessage);

    }

    @Then("^i should see error message as \"([^\"]*)\"$")
    public void iShouldSeeErrorMessageAs(String errorMassage)  {
        actual_result=driver.findElement( By.xpath("//*[@id=\"post-4519\"]/div/div[1]/p")).getText();
    }




//    @Then("^I see Account page with login$")
//    public void iSeeAccountPageWithLogin() {
//
//







//    @Given("^I enter valid First name as \"([^\"]*)\"$")
//    public void iEnterValidFirstNameAs(String firstName){
//        driver.findElement(By.linkText("first_name")).sendKeys(firstName);}


}



