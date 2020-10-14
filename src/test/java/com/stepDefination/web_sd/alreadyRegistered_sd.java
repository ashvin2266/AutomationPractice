package com.stepDefination.web_sd;

import com.stepDefination.utility.CommonMethod;
import com.stepDefination.utility.DriverClass;
import com.stepDefination.pages.alreadyRegistered_page;
import cucumber.api.DataTable;
import cucumber.api.PendingException;
import cucumber.api.java.en.And;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.support.PageFactory;

import java.io.IOException;

public class alreadyRegistered_sd extends DriverClass {
    public alreadyRegistered_page d_page = PageFactory.initElements(driver,alreadyRegistered_page.class);
    private Object DataTable;
    public CommonMethod cm=new CommonMethod();
    @Given("^I go to Home Page$")
    public void iGoToHomePage() throws IOException {
        cm.verifyUrl(getProperty("url"));
    }
    @When("^I click on a sign in button on home page$")
    public void iClickOnASignInButtonOnHomePage()  {
        d_page.clickSignIn();
    }
    @Then("^I should see Already Registered in authentication page title as\"([^\"]*)\"$")
    public void iShouldSeeAlreadyRegisteredInAuthenticationPageTitleAs(String title) {
        cm.verifyPageTitle(title);
    }
    @Given("^I enter a valid email as \"([^\"]*)\"$")
    public void iEnterAValidEmailAs(String email)  {
        d_page.enteraEmail(email);
    }
    @When("^I click on sign in button$")
    public void iClickOnSignInButton() {
        d_page.clickSignInButton();
    }
    @Given("^I enter a valid password is  as \"([^\"]*)\"$")
    public void iEnterAValidPasswordIsAs(String password)  {
       d_page.Password(password);
    }
     @Given("^I enter below details;$")
    public void iEnterBelowDetails(DataTable table) {
       d_page.enterData(table);
         }

    @Then("^I should see error message as \"([^\"]*)\"$")
    public void iShouldSeeErrorMessageAs(String message) {
        d_page.message(message);
    }

    @Then("^I should see my account page Url as\"([^\"]*)\"$")
    public void iShouldSeeMyAccountPageUrlAs(String accountUrl) throws IOException {
            cm.verifyUrl(accountUrl);
    }
    @And("^verify the page title of account page is \"([^\"]*)\"$")
    public void verifyThePageTitleOfAccountPageIs(String expTitle)  {
       cm.verifyPageTitle(expTitle);
    }


}
