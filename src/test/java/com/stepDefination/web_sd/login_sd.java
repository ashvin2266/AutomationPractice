package com.stepDefination.web_sd;

import cucumber.api.PendingException;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import io.github.bonigarcia.wdm.WebDriverManager;
import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class login_sd {
    WebDriver driver;
    @Given("^I enter url as\"([^\"]*)\"$")
    public void iEnterUrlAs(String URL)  {
        WebDriverManager.chromedriver().setup();
        driver= new ChromeDriver();
        driver.get(URL);
    }

    @When("^I click on login  button on home page$")
    public void iClickOnLoginButtonOnHomePage() {
        driver.findElement(By.linkText("Login")).click();
    }

    @Then("^I should see login page$")
    public void iShouldSeeLoginPage() {
    }

    @When("^I click on register button on login page$")
    public void iClickOnRegisterButtonOnLoginPage() {
        driver.findElement(By.linkText("Register")).click();
    }

    @Then("^I should see register page$")
    public void iShouldSeeRegisterPage() {

    }

    @Given("^I enter first name as  \"([^\"]*)\"$")
    public void iEnterFirstNameAs(String arg0)  {
        driver.findElement(By.name("first_name")).sendKeys("abc");
    }

    @Given("^I enter last name as  \"([^\"]*)\"$")
    public void iEnterLastNameAs(String arg0)  {
        driver.findElement(By.name("last_name")).sendKeys("def");
    }

    @Given("^I enter valid email as \"([^\"]*)\"$")
    public void iEnterValidEmailAs(String arg0) {
        driver.findElement(By.name("email")).sendKeys("patcat@hotmail.com");
    }

    @Given("^I enter Password as \"([^\"]*)\"$")
    public void iEnterPasswordAs(String password) {
          driver.findElement(By.name("pass1")).sendKeys("Pat123");
    }

    @Given("^I enter confirm password as \"([^\"]*)\"$")
    public void iEnterConfirmPasswordAs(String arg0)  {
        driver.findElement(By.name("pass2")).sendKeys("Pat123");
    }

    @When("^I click on register button on register page$")
    public void iClickOnRegisterButtonOnRegisterPage() {
        driver.findElement(By.name("btn-submit")).click();
    }

    @Then("^I should see account login page$")
    public void iShouldSeeAccountLoginPage() {


    }


    @Given("^I enter Username as\"([^\"]*)\"$")
    public void iEnterUsernameAs(String arg0) {
        driver.findElement(By.name("username")).sendKeys("patcat@hotmail.com");

    }

    @Given("^I enter password id as\"([^\"]*)\"$")
    public void iEnterPasswordIdAs(String arg0)  {
       driver.findElement(By.id("username")).sendKeys();
    }

    {
    }

    @Then("^I should see log out button$")
    public void iShouldSeeLogOutButton() {
        boolean logOutButton = driver.findElement(By.linkText("Log Out")).isDisplayed();
        Assert.assertFalse(logOutButton);

    }


//    @Given("^I enter password as\"([^\"]*)\"$")
//    public void iEnterPasswordAs(String password1) throws Throwable {
//         Write code here that turns the phrase above into concrete actions
//        throw new PendingException();
//    }
}
