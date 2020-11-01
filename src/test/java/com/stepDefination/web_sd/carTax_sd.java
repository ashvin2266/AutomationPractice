package com.stepDefination.web_sd;

import com.stepDefination.pages.CarTax_page;
import com.stepDefination.utility.CommonMethod;
import com.stepDefination.utility.DriverClass;
import cucumber.api.java.en.And;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import org.junit.Assert;
import org.openqa.selenium.By;

import java.io.IOException;

public class carTax_sd extends DriverClass {
    public CarTax_page car=new CarTax_page();

    @When("^I click on heading as \"([^\"]*)\"$")
    public void iClickOnHeadingAs(String heading) throws InterruptedException {
        car.clickOnDriveingAndTrasportLink();
    }

    @Then("^I should see page contain Url as \"([^\"]*)\"$")
    public void iShouldSeePageContainUrlAs(String url1) throws InterruptedException, IOException {
          Thread.sleep(5000);
        new CommonMethod().verifyUrl(url1);
        log.info("Page URL is verified "+url1);
    }
    @When("^I click on Vehicle tax, MOT and insurance link on driving page$")
    public void iClickOnVehicleTaxMOTAndInsuranceLinkOnDrivingPage() {
      car.ClickOnVehicleTaxMOTAndInsuranceLinkOnDrivingPage();
    }

    @When("^I click on check if vehicle is taxed link from related content list$")
    public void iClickOnCheckIfVehicleIsTaxedLinkFromRelatedContentList() throws InterruptedException {
      car.vehicleTaxedorNot();
    }

    @Then("^I should see page with title as check if a vehicle is taxed contain url as \"([^\"]*)\"$")
    public void iShouldSeePageWithTitleAsCheckIfAVehicleIsTaxedContainUrlAs(String url2) throws IOException {
       new CommonMethod().verifyUrl(url2);
        log.info("Page URL is verified " +url2);
    }

    @When("^I click on start button on check if vehicle taxed page$")
    public void iClickOnStartButtonOnCheckIfVehicleTaxedPage(){
     car.startClick();}


    @Given("^I enter registration number of vehicle as \"([^\"]*)\"$")
    public void iEnterRegistrationNumberOfVehicleAs(String regNo) throws InterruptedException {
       car.EnterRegistrationNumberOfVehicleAs(regNo);
    }

    @When("^I click on continue button on service page$")
    public void iClickOnContinueButtonOnServicePage() {
        car.ClickOnContinueButtonOnServicePage();
    }

    @Then("^I should see the page contain \"([^\"]*)\"$")
    public void iShouldSeeThePageContain(String message) {
       car.getMessege(message);
    }

    @When("^I click No search again button$")
    public void iClickNoSearchAgainButton() {
       car.iClickNoSearchAgainButton();
    }

    @And("^click on continue button$")
    public void clickOnContinueButton() {
        car.clickOnContinueButton();
    }

    @Given("^I enter valid car registration no from excel file\"([^\"]*)\"$")
    public void iEnterValidCarRegistrationNoFromExcelFile(String registrationNo)  {


        driver.findElement(By.id("wizard_vehicle_enquiry_capture_vrn_vrn")).sendKeys(registrationNo);

        System.out.println();


    }





}


