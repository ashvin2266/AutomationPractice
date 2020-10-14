package com.stepDefination.web_sd;

import com.stepDefination.utility.DriverClass;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import org.junit.Assert;
import org.openqa.selenium.By;

public class guruAccount_sd extends DriverClass {
    @When("^I click on my account link$")
    public void iClickOnMyAccountLink() {
        driver.findElement(By.xpath("/html/body/div/div/header/div/div[2]/div/a/span[2]")).click();
        driver.findElement(By.xpath("/html/body/div/div/header/div/div[5]/div/ul/li[1]/a")).click();
    }

    @Then("^I should see the create an account page url as \"([^\"]*)\"$")
    public void iShouldSeeTheCreateAnAccountPageUrlAs(String url)  {
       String account_url=driver.getCurrentUrl();
        Assert.assertEquals(url,account_url);
        System.out.println(url);
        System.out.println(account_url);
        driver.findElement(By.xpath("/html/body/div/div/div[2]/div/div/div/form/div/div[1]/div[2]/a")).click();
    }

    @Given("^I enter first name is a as \"([^\"]*)\"$")
    public void iEnterFirstNameIsAAs(String firstName) {
        driver.findElement(By.id("firstname")).sendKeys(firstName);
    }


    @Given("^I enter middlename is as \"([^\"]*)\"$")
    public void iEnterMiddlenameIsAs(String middleName) {
        driver.findElement(By.id("middlename")).sendKeys(middleName);
    }

    @Given("^I enter last name is as \"([^\"]*)\"$")
    public void iEnterLastNameIsAs(String lastName) {

        driver.findElement(By.id("lastname")).sendKeys(lastName);
        driver.findElement(By.id("email_address")).sendKeys("abc1234567@yahoo.co.uk");

    }
    @Given("^I enter a valid password is a as \"([^\"]*)\"$")
    public void iEnterAValidPasswordIsAAs(String password){
        driver.findElement(By.id("password")).sendKeys(password);

    }

    @Given("^I enter a confirm password is as \"([^\"]*)\"$")
    public void iEnterAConfirmPasswordIsAs(String confirmPassword) {
        driver.findElement(By.id("confirmation")).sendKeys(confirmPassword);
    }

    @When("^I click on registration$")
    public void iClickOnRegistration() {
        driver.findElement(By.xpath("/html/body/div/div/div[2]/div/div/div/form/div[2]/button")).click();
    }

    @Then("^I should see the message is a as \"([^\"]*)\"$")
    public void iShouldSeeTheMessageIsAAs(String thank) {
        String actual_thank= driver.findElement(By.xpath("/html/body/div/div/div[2]/div/div[2]/div/div/ul/li/ul/li/span")).getText();
        Assert.assertEquals(thank,actual_thank);
        System.out.println(thank);
        System.out.println(actual_thank);
    }


}
