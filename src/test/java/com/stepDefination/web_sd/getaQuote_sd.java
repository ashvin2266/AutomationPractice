package com.stepDefination.web_sd;

import com.stepDefination.pages.GetAQuote_page;
import com.stepDefination.utility.CommonMethod;
import com.stepDefination.utility.DriverClass;
import cucumber.api.PendingException;
import cucumber.api.java.en.And;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import cucumber.api.java.pt.E;
import org.junit.Assert;
import org.openqa.selenium.By;

import java.io.IOException;

public class getaQuote_sd extends DriverClass {
    GetAQuote_page gp=new GetAQuote_page();
    @Given("^I go to Home Page url as \"([^\"]*)\"$")
    public void iGoToHomePageUrlAs(String url) throws IOException {
        CommonMethod.verifyUrl(url);
    }

    @When("^I click log in button on Home page$")
    public void iClickLogInButtonOnHomePage() {
        gp.ClickLogInBtn();
    }

    @Given("^I enter first name as \"([^\"]*)\"$")
    public void iEnterFirstNameAs(String firstname){
        gp.FirstName(firstname);
    }

    @Given("^I enter last name as \"([^\"]*)\"$")
    public void iEnterLastNameAs(String lastname) {

        gp.LastName(lastname);
    }

    @Given("^I enter email address as \"([^\"]*)\"$")
    public void iEnterEmailAddressAs(String Email) {
       gp.EnterEmail(Email);
    }

    @Given("^I enter subject as \"([^\"]*)\"$")
    public void iEnterSubjectAs(String subject) {
     gp.EnterSubject(subject);
    }

    @Given("^I enter my phone number as\"([^\"]*)\"$")
    public void iEnterMyPhoneNumberAs(String phoneNumber)  {
       gp.EnterMyPhoneNumber(phoneNumber);
    }

    @Given("^I enter message as \"([^\"]*)\"$")
    public void iEnterMessageAs(String message)  {
        gp.EnterMessage(message);
    }

    @Given("^I enter captcha code shown in page as \"([^\"]*)\"$")
    public void iEnterCaptchaCodeShownInPageAs(String arg0) throws InterruptedException {
        /*  String c=driver.findElement(By.xpath("//img[@alt='captcha']")).getText();
        driver.findElement(By.name("captcha-005")).sendKeys(c);
        System.out.println(c);*/
      gp.EnterCaptchaCodeShownInPageAs(arg0);
    }

    @When("^I click on send message button$")
    public void iClickOnSendMessageButton() {
       gp.iClickOnSendMessageButton();  }

    @And("^I should see the error message \"([^\"]*)\"$")
    public void iShouldSeeTheMessage(String errorMsg) {
        String actualError=driver.findElement(By.xpath("//div[@class='wpcf7-response-output wpcf7-display-none wpcf7-validation-errors']")).getText();
        Assert.assertEquals(errorMsg,actualError);
        log.info("ErrorMsg is verified----> "+ actualError);
    }


    @Then("^verify the error message is as \"([^\"]*)\"$")
    public void verifyTheErrorMessageIsAs(String errorMsg)  {
        String actual_Msg=driver.findElement(By.xpath("//span[@role='alert'][contains(normalize-space(),'Your entered code is incorrect.')]")).getText();
        Assert.assertEquals(errorMsg,actual_Msg);
        log.info("Error Message is verified---->" + actual_Msg);


    }
}
