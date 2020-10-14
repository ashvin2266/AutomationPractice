package com.stepDefination.web_sd;

import com.stepDefination.utility.DriverClass;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;

public class spiceJet_sd extends DriverClass {
    @When("^I click on Book button on Homepage$")
    public void iClickOnBookButtonOnHomepage() {
        driver.findElement(By.id("highlight-book")).click();

    }


    @Then("^I should see the option page contain url as \"([^\"]*)\"$")
    public void iShouldSeeTheOptionPageContainUrlAs(String expectedUrl) {

        String actual_url = driver.getCurrentUrl();
        Assert.assertEquals(expectedUrl, actual_url);
    }

    @When("^I click on Departure city on home page$")
    public void iClickOnDepartureCityOnHomePage() {
        driver.findElement(By.id("ctl00_mainContent_ddl_originStation1_CTXT")).click();
    }

    @Then("^I should see the list of departure city$")
    public void iShouldSeeTheListOfDepartureCity() {
        driver.findElement(By.xpath("//*[@id=\"dropdownGroup1\"]/h3")).getText();

    }

    @Given("^I select the departure city as \"([^\"]*)\"$")
    public void iSelectTheDepartureCityAs(String depCity) {
        driver.findElement(By.linkText("Ahmedabad (AMD)")).click();

    }

    @Given("^i select arrival city as \"([^\"]*)\"$")
    public void iSelectArrivalCityAs(String arrivalCity) {
        driver.findElement(By.id("ctl00_mainContent_ddl_destinationStation1_CTXT")).click();
        driver.findElement(By.linkText("Bangkok (BKK)")).click();
    }

    @Given("^I select departure date is \"([^\"]*)\"$")
    public void iSelectDepartureDateIs(String deparDate) throws InterruptedException {
        WebElement element=driver.findElement(By.xpath("//input[@id='ctl00_mainContent_txt_Fromdate']"));
        datePicker(driver,element,deparDate);
//        js.executeScript("arguments[0].setAttribute('value','"+deparDate+"');",driver.findElement(By.xpath("//input[@id='ctl00_mainContent_txt_Fromdate']")));
//        //*[@id="ui-datepicker-div"]/div[1]/table/tbody/tr[4]/td[4]/a
        Thread.sleep(1000);
        driver.findElement(By.cssSelector(".ui-state-default.ui-state-highlight.ui-state-active")).click();
//        driver.findElement(By.linkText("ui-state-default ui-state-highlight ui-state-active")).click();
    }


//    @When("^I click on Indian Armed Forces$")
//    public void iClickOnIndianArmedForces() throws InterruptedException {
//        Thread.sleep(2000);
//        driver.findElement(By.id("ctl00_mainContent_IndArm")).click();
//        driver.findElement(By.id("divpaxinfo")).click()
//
//         }

//    @Given("^I selected passanager as \"([^\"]*)\"$")
//    public void iSelectedPassanagerAs(String passenger) throws InterruptedException {
//        driver.findElement(By.id("divpaxinfo")).click();
//        Thread.sleep(2000);
//        driver.findElement(By.id("hrefIncAdt")).click();
//        driver.findElement(By.id("btnclosepaxoption")).click();

//    }

    @Given("^I selected passenger as Adult \"([^\"]*)\"$")
    public void iSelectedPassengerAsAdult(String arg0) throws InterruptedException {
//        driver.findElement(By.xpath("//div[@id='divpaxinfo']")).clear();
        driver.findElement(By.xpath("//div[@id='divpaxinfo']")).click();
        Select adult=new Select(driver.findElement(By.xpath("//select[@id='ctl00_mainContent_ddl_Adult']")));
        adult.selectByValue(arg0);
       driver.findElement(By.xpath("//select[@id='ctl00_mainContent_ddl_Adult']")).click();
    }

    @Given("^I selected currency as \"([^\"]*)\"$")
    public void iSelectedCurrencyAs(String currency)  {
       Select s =new Select(driver.findElement(By.name("ctl00$mainContent$DropDownListCurrency")));
       s.selectByVisibleText("USD");
    }
//    @When("^I click on Indian Armed Forces$")
//    public void iClickOnIndianArmedForces() {
//        System.out.println(driver.findElement(By.id("ctl00_mainContent_chk_IndArm")).isSelected());
//        driver.findElement(By.id("ctl00_mainContent_chk_IndArm")).click();
//        System.out.println(driver.findElement(By.id("ctl00_mainContent_chk_IndArm")).isSelected());
//        System.out.println( driver.findElements(By.id("discount-checkbox")).size());
//    }


    @When("^I click check box on \"([^\"]*)\"$")
    public void iClickCheckBoxOn(String checkbox)  {
        System.out.println(driver.findElement(By.id("ctl00_mainContent_chk_friendsandfamily")).isSelected());
        driver.findElement(By.id("ctl00_mainContent_chk_friendsandfamily")).click();
        System.out.println(driver.findElement(By.id("ctl00_mainContent_chk_friendsandfamily")).isSelected());
        System.out.println( driver.findElements(By.id("discount-checkbox")).size());
    }


    @When("^I click on search button$")
    public void iClickOnSearchButton() {
        driver.findElement(By.id("ctl00_mainContent_btn_FindFlights")).click();
    }
}

