package com.stepDefination;

import com.stepDefination.pages.alreadyRegistered_page;
import cucumber.api.DataTable;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import org.junit.Assert;
import org.openqa.selenium.support.PageFactory;

public class alreadyRegistered_sd extends DriverClass {
    public alreadyRegistered_page d_page = PageFactory.initElements(driver,alreadyRegistered_page.class);
    @When("^I click on a sign in button on home page$")
    public void iClickOnASignInButtonOnHomePage()  {
        d_page.clickSignIn();
    }
    @Then("^Then I should see Already Registered in authentication page$")
    public void thenIShouldSeeAlreadyRegisteredInAuthenticationPage() {
       d_page.seeUrl();
    }
    @Given("^I enter a valid email as \"([^\"]*)\"$")
    public void iEnterAValidEmailAs(String email)  {
        d_page.enteraEmail(email);
    }
    @When("^I click on sign in button$")
    public void iClickOnSignInButton() {
        d_page.clickSignInButton();
    }
//    @Given("^I enter a valid email is  as \"([^\"]*)\"$")
//    public void iEnterAValidEmailIsAs(String email) {
//        driver.findElement(By.id("email") ).sendKeys(email);    }

    @Given("^I enter a valid password is  as \"([^\"]*)\"$")
    public void iEnterAValidPasswordIsAs(String password)  {
       d_page.Password(password);
    }
    @Then("^I should see message as \"([^\"]*)\"$")
    public void iShouldSeeMessageAs(String message) throws InterruptedException {
       d_page.message(message);
    }

    @Given("^I enter below details;$")
    public void iEnterBelowDetails(DataTable table) {
        d_page.enterData(table);    }

    @Then("^I should see error message as \"([^\"]*)\"$")
    public void iShouldSeeErrorMessageAs(String message) {
        d_page.errorMessage(message);
    }

    @Then("^I should see error message is as \"([^\"]*)\"$")
    public void iShouldSeeErrorMessageIsAs(String errorMessage)  {
       d_page.ErrorMessage(errorMessage);
    }


    @Then("^I should see my account page Url as\"([^\"]*)\"$")
    public void iShouldSeeMyAccountPageUrlAs(String accountUrl)  {
        String actual_url= driver.getCurrentUrl();
        Assert.assertEquals(actual_url,accountUrl);
        System.out.println(accountUrl);
        System.out.println(actual_url);
    }
}
