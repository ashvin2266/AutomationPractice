package com.stepDefination.web_sd;

import com.stepDefination.pages.alreadyRegistered_page;
import com.stepDefination.utility.CommonMethod;
import com.stepDefination.utility.DriverClass;
import com.stepDefination.pages.createAnAccount_page;
import cucumber.api.PendingException;
import cucumber.api.java.en.And;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import org.openqa.selenium.support.PageFactory;

import java.io.IOException;

public class createAnAccount_sd extends DriverClass {
   public createAnAccount_page c_page= PageFactory.initElements(driver,createAnAccount_page.class);
    @When("^I click on sign in button on home page$")
    public void iClickOnSignInButtonOnHomePage()
    {
       new alreadyRegistered_page().clickSignIn();

           }
    @Then("^I should see create an account in authentication page$")
    public void iShouldSeeCreateAnAccountInAuthenticationPage() throws IOException {
        String expUrl="http://automationpractice.com/index.php?controller=authentication&back=my-account";
        CommonMethod.verifyUrl(expUrl);
    }
    @Given("^I enter valid email address \"([^\"]*)\"$")
    public void iEnterValidEmailAddress(String Email1)  {
       c_page.email(Email1);
        System.out.println(Email1);    }
    @When("^I click on create an account button on authentication page$")
    public void iClickOnCreateAnAccountButtonOnAuthenticationPage() {
        c_page.clickOnCreateAnAccount();
    }
    @Then("^I should see your personal information page$")
    public void iShouldSeeYourPersonalInformationPage() {
       String expTitle="Login - My Store";
       CommonMethod.verifyPageTitle(expTitle);
    }
    @Given("^I select \"([^\"]*)\" as a Title$")
    public void iSelectAsATitle(String Title) throws InterruptedException {
        c_page.Title(Title);
    }
    @Given("^I enter a valid first name as\"([^\"]*)\"$")
    public void iEnterAValidFirstNameAs(String firstName)  {
      c_page.firstName(firstName);
    }

    @Given("^I enter a valid last name as \"([^\"]*)\"$")
    public void iEnterAValidLastNameAs(String lastName) {
       c_page.lastName(lastName);
    }
    @Given("^I enter a valid password as \"([^\"]*)\"$")
    public void iEnterAValidPasswordAs(String password)  {
        c_page.password(password);
    }
    @Given("^I select  birth date is \"([^\"]*)\"$")
    public void iSelectBirthDateIs(String Date) {
        c_page.date(Date);
    }
    @Given("^I select a month is as \"([^\"]*)\"$")
    public void iSelectAMonthIsAs(String month)  {
       c_page.month(month);
    }
    @Given("^I select a year is \"([^\"]*)\"$")
    public void iSelectAYearIs(String year)  {
        c_page.year(year);
    }

    @When("^I click a sign up newsletter box$")
    public void iClickASignUpNewsletterBox() {
        c_page.newsletter();
    }
    @When("^I click recieve a special offer box$")
    public void iClickRecieveASpecialOfferBox(){
        c_page.specialOffer();
    }
    @Given("^I enter company name as\"([^\"]*)\"$")
    public void iEnterCompanyNameAs(String company)  {
        c_page.companyName(company);
    }
    @Given("^I enter address as \"([^\"]*)\"$")
    public void iEnterAddressAs(String address) {
        c_page.address(address);
    }

    @Given("^I enter address line  is as \"([^\"]*)\"$")
    public void iEnterAddressLineIsAs(String address2)  {
        c_page.address2(address2);
    }
    @Given("^I enter a city as \"([^\"]*)\"$")
    public void iEnterACityAs(String city) {
        c_page.city(city);    }

    @Given("^I select a state as \"([^\"]*)\"$")
    public void iSelectAStateAs(String state) {
        c_page.state(state);
    }
    @Given("^I enter a zip/postal code is as \"([^\"]*)\"$")
    public void iEnterAZipPostalCodeIsAs(String postcode)  {
       c_page.postcode(postcode);
    }
    @Given("^I select country as \"([^\"]*)\"$")
    public void iSelectCountryAs(String country)  {
        c_page.coutry(country);
    }
    @Given("^I enter additional information as\"([^\"]*)\"$")
    public void iEnterAdditionalInformationAs(String info)  {
       c_page.information(info);
    }
    @Given("^I enter a home phone as\"([^\"]*)\"$")
    public void iEnterAHomePhoneAs(String phone1) {
        c_page.phone(phone1);
    }
    @Given("^I enter a Mobile phone as\"([^\"]*)\"$")
    public void iEnterAMobilePhoneAs(String mobile)  {
        c_page.mobile(mobile);
    }
    @Given("^I enter a assign an address alias for future reference as\"([^\"]*)\"$")
    public void iEnterAAssignAnAddressAliasForFutureReferenceAs(String alias)  {
       c_page.reference(alias);
    }
    @When("^I click on register button$")
    public void iClickOnRegisterButton() {
        c_page.clickRegister();    }

    @Then("^I should see my account page$")
    public void iShouldSeeMyAccountPage() {
        c_page.accountPage();
//        Assert.assertEquals(ActualURL,);

    }

    @And("^I verify page title is as \"([^\"]*)\"$")
    public void iVerifyPageTitleIsAs(String expTitle)  {
       CommonMethod.verifyPageTitle(expTitle);
    }

    @And("^I verify the heading of page is \"([^\"]*)\"$")
    public void iVerifyTheHeadingOfPageIs(String arg0)  {
        c_page.verifyPageHeading(arg0);
    }
}
