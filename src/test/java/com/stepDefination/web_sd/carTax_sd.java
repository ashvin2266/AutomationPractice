package com.stepDefination.web_sd;

import com.stepDefination.utility.DriverClass;
import cucumber.api.java.en.And;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import org.junit.Assert;
import org.openqa.selenium.By;

public class carTax_sd extends DriverClass {

    @When("^I click on heading as \"([^\"]*)\"$")
    public void iClickOnHeadingAs(String heading) throws InterruptedException {
        Thread.sleep(3000);
//        driver.findElement(By.xpath("//*[@id=\"services-and-information\"]/div/div[2]/ul[2]/li[2]/h3/a")).click();
     driver.findElement(By.linkText("Driving and transport")).click();
    }

    @Then("^I should see page contain Url as \"([^\"]*)\"$")
    public void iShouldSeePageContainUrlAs(String url1)  {

       String Actual_Url=  driver.getCurrentUrl();
        Assert.assertEquals(url1,Actual_Url);
        System.out.println(url1);
    }
    @When("^I click on Vehicle tax, MOT and insurance link on driving page$")
    public void iClickOnVehicleTaxMOTAndInsuranceLinkOnDrivingPage() {
        driver.findElement(By.xpath("//*[@id=\"section\"]/div/ul/li[2]/a/h3")).click();
    }

    @When("^I click on check if vehicle is taxed link from related content list$")
    public void iClickOnCheckIfVehicleIsTaxedLinkFromRelatedContentList() throws InterruptedException {
        Thread.sleep(3000);
        driver.findElement(By.xpath("//*[@id=\"subsection\"]/div/ul[1]/li[3]/a")).click();
    }

    @Then("^I should see page with title as check if a vehicle is taxed contain url as \"([^\"]*)\"$")
    public void iShouldSeePageWithTitleAsCheckIfAVehicleIsTaxedContainUrlAs(String url2) {
        driver.getCurrentUrl();
        System.out.println(url2);
    }

    @When("^I click on start button on check if vehicle taxed page$")
    public void iClickOnStartButtonOnCheckIfVehicleTaxedPage(){
        driver.findElement(By.linkText("Start now")).click();}


    @Given("^I enter registration number of vehicle as \"([^\"]*)\"$")
    public void iEnterRegistrationNumberOfVehicleAs(String regNo) throws InterruptedException {
        Thread.sleep(2000);
        driver.findElement(By.name("Vrm")).sendKeys(regNo);
    }

    @When("^I click on continue button on service page$")
    public void iClickOnContinueButtonOnServicePage() {
        driver.findElement(By.id("submit_vrn_button")).click();
    }

    @Then("^I should see the page contain \"([^\"]*)\"$")
    public void iShouldSeeThePageContain(String message) {
        driver.findElement(By.xpath("//*[@id=\"pr3\"]/div/h1")).getText();
    }

    @When("^I click No search again button$")
    public void iClickNoSearchAgainButton() {
        driver.findElement(By.xpath("//*[@id=\"pr3\"]/div/div[2]/fieldset/div[2]/label")).click();
    }

    @And("^click on continue button$")
    public void clickOnContinueButton() {
        driver.findElement(By.name("Continue")).click();
    }

    @Given("^I enter valid car registration no from excel file\"([^\"]*)\"$")
    public void iEnterValidCarRegistrationNoFromExcelFile(String registrationNo)  {


        driver.findElement(By.name("Vrm")).sendKeys(registrationNo);

        System.out.println();


    }





}


