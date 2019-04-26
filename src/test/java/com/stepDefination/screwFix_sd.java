package com.stepDefination;

import cucumber.api.java.en.And;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.support.ui.Select;

public class screwFix_sd extends DriverClass {

    @When("^I click on sign in/Register button at home page$")
    public void iClickOnSignInRegisterButtonAtHomePage() {
        driver.findElement(By.xpath("//*[@id=\"header_link_sign_in\"]/span[1]")).click();
    }

    @Then("^I should see sign in /Register page url as\"([^\"]*)\"$")
    public void iShouldSeeSignInRegisterPageUrlAs(String URL)  {
     String actual_url= driver.getCurrentUrl();
        Assert.assertEquals(URL,actual_url);
    }

    @When("^I click on Registration button at register page$")
    public void iClickOnRegistrationButtonAtRegisterPage() {
        driver.findElement(By.xpath("//*[@id=\"id-signin-details\"]/div/form/button")).click();
    }

    @Then("^I should see create a web account page$")
    public void iShouldSeeCreateAWebAccountPage() {
        String actualURL = driver.getCurrentUrl();
    }

    @When("^I click on continue button at create a web account page$")
    public void iClickOnContinueButtonAtCreateAWebAccountPage() {
        driver.findElement(By.id("continueRegistrationButton")).click();
    }

    @Given("^I enter a valid email address as \"([^\"]*)\"$")
    public void iEnterAValidEmailAddressAs(String email)  {
       driver.findElement(By.id("email-input")).sendKeys(email);
    }

    @Then("^I should see a registration form at Url as \"([^\"]*)\"$")
    public void iShouldSeeARegistrationFormAtUrlAs(String url)  {
       String actualUrl = driver.getCurrentUrl();
//       Assert.assertEquals(url,actualUrl);
        System.out.println(url);
        System.out.println(actualUrl);
    }

    @When("^I select title as \"([^\"]*)\"$")
    public void iSelectTitleAs(String Title) throws InterruptedException {
        Thread.sleep(3000);
      new Select(driver.findElement(By.name("title"))).selectByValue("Mr");
    }

    @Given("^I enter valid first name as \"([^\"]*)\"$")
    public void iEnterValidFirstNameAs(String firstName) {
       driver.findElement(By.name("first-name")).sendKeys(firstName);
    }

    @Given("^I enter valid last name as \"([^\"]*)\"$")
    public void iEnterValidLastNameAs(String lastName) {
       driver.findElement(By.name("last-name")).sendKeys(lastName);
    }

    @When("^I select profession as \"([^\"]*)\"$")
    public void iSelectProfessionAs(String profession)  {
     new Select(driver.findElement(By.name("profession"))).selectByVisibleText(profession);
    }

    @Given("^I enter my post code is \"([^\"]*)\"$")
    public void iEnterMyPostCodeIs(String postcode)  {
       driver.findElement(By.name("search-postcode")).sendKeys(postcode);
    }

    @When("^I click on find address button$")
    public void iClickOnFindAddressButton() {
        driver.findElement(By.xpath("//*[@id=\"addressSearchForm\"]/div[2]/div/div[1]/button")).click();
    }

    @Then("^I select address as \"([^\"]*)\"$")
    public void iSelectAddressAs(String address) throws InterruptedException {
        Thread.sleep(3000);
//       driver.findElement(By.xpath("//*[@id=\"addressSearchForm\"]/div[4]/label")).click();
        driver.findElement(By.id("contact-address-result-select")).click();
    }

    @And("^I choose address as \"([^\"]*)\"$")
    public void iChooseAddressAs(String street)  {
        driver.findElement(By.id("ADDRESS_1")).click();
    }

//    @Given("^I enter (\\d+) characters password \"([^\"]*)\"$")
//    public void iEnterCharactersPassword( String password) {
//
//    }

    @Given("^I enter  password \"([^\"]*)\"$")
    public void iEnterPassword(String password)  {
        driver.findElement(By.name("Password")).sendKeys(password);

    }

    @Given("^I enter confirm password \"([^\"]*)\"$")
    public void iEnterConfirmPassword(String confirmPassword)  {
        driver.findElement(By.id("retypePassword")).sendKeys(confirmPassword);
    }

//    @When("^I select contact preferences as \"([^\"]*)\"$")
//    public void iSelectContactPreferencesAs(String contact){
//
//    }

    @When("^I click on \"([^\"]*)\" as select contact preferences$")
    public void iClickOnAsSelectContactPreferences(String email) {
       driver.findElement(By.cssSelector("#registrationFormPanel > div.lg-22.lg-offset-1.md-22.md-offset-1.sm24 > div.row.fm-minor.bl-info > div > div > div:nth-child(1) > label")).click();


    }

    @When("^I click registration now button$")
    public void iClickRegistrationNowButton() {
        driver.findElement(By.id("registerNowButton")).click();
    }

    @Then("^I should see message is as \"([^\"]*)\"$")
    public void iShouldSeeMessageIsAs(String message) {
        driver.findElement(By.xpath("//*[@id=\"container-content\"]/div/div/div[2]/div[1]/h2/span")).getText();

    }

    @And("^I see URL as \"([^\"]*)\"$")
    public void iSeeURLAs(String url) {
        String actual_URL= driver.getCurrentUrl();
//        Assert.assertEquals(url,actual_URL);
        System.out.println(url);
        System.out.println(actual_URL);
    }

//    @When("^I  click on ADDRESSES SEARCH RESULTS$")
//    public void iClickOnADDRESSESSEARCHRESULTS() {
//        driver.findElement(By.name("select-address-result")).click();
//
//    }

//    @Then("^I choose address as \"([^\"]*)\"$")
//    public void iChooseAddressAs(String address) throws InterruptedException {
//        Thread.sleep(2000);
//        new Select(driver.findElement(By.id("contact-address-result-select"))).selectByValue(address);
    }


//    @Given("^I go to URL \"([^\"]*)\"$")
//    public void iGoToURL(String url)  {
//       driver.getCurrentUrl();
//    }
//}
