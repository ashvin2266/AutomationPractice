package com.stepDefination.web_sd;

import com.stepDefination.utility.DriverClass;
import cucumber.api.java.en.And;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.support.ui.Select;

public class starTour_sd extends DriverClass {
//    ------------------------------------FROM HOMEPAGE TO LOGIN FIRST TIME REGISTER----------------------------------------------------
    @When("^I click on my account button at home page$")
    public void iClickOnMyAccountButtonAtHomePage() throws InterruptedException {
        Thread.sleep(2000);

       driver.findElement(By.linkText("My Account")).click();
    }

    @Then("^I should see the login page contain url as \"([^\"]*)\"$")
    public void iShouldSeeTheLoginPageContainUrlAs(String expectedUrl)  {
        String actualURL = driver.getCurrentUrl();
        Assert.assertEquals(expectedUrl,actualURL);
        System.out.println(expectedUrl);
        System.out.println(actualURL);

    }

    @When("^I click on a register button on login page$")
    public void iClickOnARegisterButtonOnLoginPage() {
        driver.findElement(By.id("RegisterLink")).click();
    }

    @Then("^I should see register page contain title as \"([^\"]*)\"$")
    public void iSholdSeeRegisterPageContainTitleAs(String pageTitle)  {
        driver.getTitle();
        System.out.println(pageTitle);

    }

    @Given("^I select title is as \"([^\"]*)\"$")
    public void iSelectTitleIsAs(String title)  {
        driver.findElement(By.id("Title")).click();
        driver.findElement(By.id("Title")).sendKeys(Keys.ARROW_DOWN);
        driver.findElement(By.id("Title")).click();

    }

    @Given("^I enter first name is as \"([^\"]*)\"$")
    public void iEnterFirstNameIsAs(String firstName) {
        driver.findElement(By.id("FirstName")).sendKeys(firstName);
    }

    @Given("^I enter Surname is  as \"([^\"]*)\"$")
    public void iEnterSurnameIsAs(String surname)  {
        driver.findElement(By.name("Surname")).sendKeys(surname);
    }

    @Given("^I enter postcode as\"([^\"]*)\"$")
    public void iEnterPostcodeAs(String postcode)  {
        driver.findElement(By.id("InternationalPostCode")).sendKeys(postcode);
    }

    @When("^I click a find address button$")
    public void iClickAFindAddressButton() {
        driver.findElement(By.id("PostcodeLookupButton")).click();
    }

    @Given("^I select House no is as \"([^\"]*)\"$")
    public void iSelectHouseNoIsAs(String houseNo) throws InterruptedException {
        System.out.println( driver.findElements(By.id("PostcodeLookupResults")).size());
        Thread.sleep(2000);
        driver.findElement(By.xpath("//*[@id=\'PostcodeLookupResults\']/option[1]")).click();
        driver.findElement(By.id("PostcodeLookupSelectButton")).click();

//        Select Address =new Select(driver.findElement(By.id("PostcodeLookupResults")));
//        Address.selectByValue("1");
    }

    @Given("^I enter valid email address as \"([^\"]*)\"$")
    public void iEnterValidEmailAddressAs(String email)  {
        driver.findElement(By.id("Email")).sendKeys(email);
    }

    @Given("^I enter confirm email address as \"([^\"]*)\"$")
    public void iEnterConfirmEmailAddressAs(String confirmEmail)  {
        driver.findElement(By.id("ConfirmEmail")).sendKeys(confirmEmail);
    }

    @Given("^I enter day time Tel No as \"([^\"]*)\"$")
    public void iEnterDayTimeTelNoAs(String dayTel)  {
       driver.findElement(By.id("TelNo1")).sendKeys(dayTel);
    }

    @Given("^I enter Evening Tel No as \"([^\"]*)\"$")
    public void iEnterEveningTelNoAs(String eveningTel) {
        driver.findElement(By.id("TelNo2")).sendKeys(eveningTel);
    }

    @Given("^I enter Mobile no is as \"([^\"]*)\"$")
    public void iEnterMobileNoIsAs(String mobileNo) {
        driver.findElement(By.id("MobileNo")).sendKeys(mobileNo);
    }

    @Given("^I enter Fax No as \"([^\"]*)\"$")
    public void iEnterFaxNoAs(String fax)  {
       driver.findElement(By.id("FaxNo")).sendKeys(fax);    }

    @Given("^I choose prefered contact method as \"([^\"]*)\"$")
    public void iChoosePreferedContactMethodAs(String prefered)  {
        driver.findElement(By.name("ContactVia")).click();
        driver.findElement(By.name("ContactVia")).sendKeys(Keys.ARROW_DOWN);
        driver.findElement(By.name("ContactVia")).click();
    }

    @Given("^I enter a valid password is as \"([^\"]*)\"$")
    public void iEnterAValidPasswordIsAs(String password) {
       driver.findElement(By.name("WebPassword")).sendKeys(password);
    }

    @Given("^I enter a confirm password as \"([^\"]*)\"$")
    public void iEnterAConfirmPasswordAs(String confirmPassword)  {
        driver.findElement(By.name("ConfirmWebPassword")).sendKeys(confirmPassword);
    }

    @When("^I click on creat Account button$")
    public void iClickOnCreatAccountButton() {
        driver.findElement(By.id("AccountDetailsSaveDetailsButton")).click();
    }

    @Then("^I should see my account page Url as \"([^\"]*)\"$")
    public void iShouldSeeMyAccountPageUrlAs(String expUrl)  {
       String actual_url= driver.getCurrentUrl();
       Assert.assertEquals(expUrl,actual_url);
        System.out.println(expUrl);
        System.out.println(actual_url);
    }

    @Then("^I should see error message  as \"([^\"]*)\"$")
    public void iShouldSeeErrorMessageAs(String errorMessage) {
       String actualMsg= driver.findElement(By.xpath("/html/body/div[1]/div[2]/div[4]/div[2]/div/div/div/form/div[1]/p")).getText();
       Assert.assertEquals(errorMessage,actualMsg);
        System.out.println(errorMessage);
        System.out.println(actualMsg);
    }
//    -------------------------------------------------------LOGIN BUTTON-----------------------------------------------------------------------------------------------

    @Given("^I enter valid email address is as \"([^\"]*)\"$")
    public void iEnterValidEmailAddressIsAs(String email1) {
        driver.findElement(By.id("fldEMail")).sendKeys(email1);
    }

    @Given("^I enter a valid password  as \"([^\"]*)\"$")
    public void iEnterAValidPasswordAs(String password1)  {
       driver.findElement(By.id("fldPassword")).sendKeys(password1);
    }

    @When("^I click on login button$")
    public void iClickOnLoginButton() {
        driver.findElement(By.className("LoginButton")).click();
    }

    @Then("^I should see my account page url is as \"([^\"]*)\"$")
    public void iShouldSeeMyAccountPageUrlIsAs(String url) {
        String actualUrl= driver.getCurrentUrl();
        Assert.assertEquals(url,actualUrl);
        System.out.println(url);
        System.out.println(actualUrl);

    }

    @And("^I should see page title as \"([^\"]*)\"$")
    public void iShouldSeePageTitleAs(String title) {
       String actualTitle = driver.getTitle();
       Assert.assertEquals(title,actualTitle);
        System.out.println(title);
        System.out.println(actualTitle);
        String pageTitle= driver.findElement(By.xpath("/html/body/div[1]/div[2]/div[4]/div[2]/div/div/h1")).getText();
        System.out.println(pageTitle);

    }
//------------------------------------SEARCH HOLIDAY----------------------------------------------------------------------------------------
    @When("^I click on dropdown box on home page$")
    public void iClickOnDropdownBoxOnHomePage() {
        driver.findElement(By.id("cphBody_HolidaySearchBanner_ddlHolidayWhere")).click();
    }

    @Then("^I should see the all holiday list for selection$")
    public void iShouldSeeTheAllHolidayListForSelection() {
        System.out.println( driver.findElement(By.id("cphBody_HolidaySearchBanner_ddlHolidayWhere")).getText());

    }

    @Given("^I choose holiday from list is as \"([^\"]*)\"$")
    public void iChooseHolidayFromListIsAs(String selectHoliday)  {
        new Select(driver.findElement(By.id("cphBody_HolidaySearchBanner_ddlHolidayWhere"))).selectByVisibleText(selectHoliday);
        driver.findElement(By.id("cphBody_HolidaySearchBanner_ddlHolidayWhere")).click();
    }

    @When("^I click on when would you like to travel drop box$")
    public void iClickOnWhenWouldYouLikeToTravelDropBox() {
        driver.findElement(By.id("cphBody_HolidaySearchBanner_ddlHolidayWhen")).click();
    }

    @Then("^I should see list of months$")
    public void iShouldSeeListOfMonths() {
        System.out.println( driver.findElement(By.id("cphBody_HolidaySearchBanner_ddlHolidayWhen")).getText());
    }

    @Given("^I choose from list as \"([^\"]*)\"$")
    public void iChooseFromListAs(String selectMonth)  {
       Select s =new Select(driver.findElement(By.id("cphBody_HolidaySearchBanner_ddlHolidayWhen")));
       s.selectByVisibleText(selectMonth);
        driver.findElement(By.id("cphBody_HolidaySearchBanner_ddlHolidayWhen")).click();

    }

    @When("^I click on how many passenger drop box$")
    public void iClickOnHowManyPassengerDropBox() {
        driver.findElement(By.id("cphBody_HolidaySearchBanner_ddlHolidayPassengers")).click();
    }

    @Then("^I should see list of how many passengers is displayed$")
    public void iShouldSeeListOfHowManyPassengersIsDisplayed() {
        driver.findElement(By.id("cphBody_HolidaySearchBanner_ddlHolidayPassengers")).getText();
    }

    @Given("^I choose  passenger no, from list as \"([^\"]*)\"$")
    public void iChoosePassengerNoFromListAs(String passengerNo) {

        Select passenger = new Select(driver.findElement(By.id("cphBody_HolidaySearchBanner_ddlHolidayPassengers")));
                passenger.selectByValue(passengerNo);
        driver.findElement(By.id("cphBody_HolidaySearchBanner_ddlHolidayPassengers")).click();

    }

    @When("^I click on search button on this page$")
    public void iClickOnSearchButtonOnThisPage() {
        driver.findElement(By.name("ctl00$cphBody$HolidaySearchBanner$btnHolidaySubmit")).click();
    }

    @Then("^I should see the message is as \"([^\"]*)\"$")
    public void iShouldSeeTheMessageIsAs(String message)  {
       String searchResult= driver.findElement(By.xpath("/html/body/div[1]/div[2]/div[4]/div[2]/div/div[1]/div/p")).getText();
       Assert.assertEquals(message,searchResult);
        System.out.println(message);
        System.out.println(searchResult);

    }

    @And("^I should see the heading of the page is \"([^\"]*)\"$")
    public void iShouldSeeTheHeadingOfThePageIs(String headingPage) {
       String pageHeading= driver.findElement(By.xpath("/html/body/div[1]/div[2]/div[4]/div[2]/div/div[1]/div/h1")).getText();
       Assert.assertEquals(headingPage,pageHeading);
        System.out.println(headingPage);
        System.out.println(pageHeading);
        driver.findElement(By.linkText("04 Days - Historic Scotland")).click();
        System.out.println( driver.findElement(By.xpath("/html/body/div[1]/div[2]/div[4]/div[2]/div[1]/div[1]/div/div[1]/div/h1")).getText());
    }
}
