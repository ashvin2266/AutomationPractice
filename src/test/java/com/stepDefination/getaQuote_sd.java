package com.stepDefination;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import org.openqa.selenium.By;

public class getaQuote_sd extends DriverClass {

//WebDriver driver;
//    @Given("^I enter url as \"([^\"]*)\"$")
//    public void iEnterUrlAs(String URL)  {
//        WebDriverManager.chromedriver().setup();
//        driver=new ChromeDriver();
//        driver.get(URL);
//
//    }
    @When("^I click log in button on Home page$")
    public void iClickLogInButtonOnHomePage() {
        driver.findElement(By.linkText("Login")).click();

    }

    @Given("^I enter first name as \"([^\"]*)\"$")
    public void iEnterFirstNameAs(String firstname){
        driver.findElement(By.name("first-name")).sendKeys("fist quote");
    }

    @Given("^I enter last name as \"([^\"]*)\"$")
    public void iEnterLastNameAs(String lastname) {
        driver.findElement(By.name("last-name")).sendKeys("Last quote");
    }

    @Given("^I enter email address as \"([^\"]*)\"$")
    public void iEnterEmailAddressAs(String Email) {
        driver.findElement(By.name("your-email")).sendKeys("abg@hotmail.com");
    }

    @Given("^I enter subject as \"([^\"]*)\"$")
    public void iEnterSubjectAs(String subject) {
       driver.findElement(By.name("your-subject")).sendKeys("quote");
    }

    @Given("^I enter my phone number as\"([^\"]*)\"$")
    public void iEnterMyPhoneNumberAs(String phoneNumber)  {
        driver.findElement(By.name("tel-879")).sendKeys("01234567890");
    }

    @Given("^I enter message as \"([^\"]*)\"$")
    public void iEnterMessageAs(String message)  {
       driver.findElement(By.name("your-message")).sendKeys("free quote");
    }

    @Given("^I enter captcha code shown in page as \"([^\"]*)\"$")
    public void iEnterCaptchaCodeShownInPageAs(String arg0) {
        driver.findElement(By.name("captcha-005")).sendKeys();
    }

    @When("^I click on send message button$")
    public void iClickOnSendMessageButton() {
        driver.findElement(By.xpath("//*[@id=\"wpcf7-f391-o1\"]/form/p[4]/input")).click();  }

    @Then("^I should see the message \"([^\"]*)\"$")
    public void iShouldSeeTheMessage(String arg0) {
//        System.out.println();
//        String actual_result;
//        actual_result=driver.findElement(By.xpath("//*[@id=\"wpc_5c990a779aea1\"]/div/div/div/div/div/h2")).getText();
//        Assert.assertEquals(arg0,"actual result");
//        System.out.println(arg0);


    }

//    @Then("^I should see log in page with Get a free Quote$")
//    public void iShouldSeeLogInPageWithGetAFreeQuote() {
//    }
}
