package com.stepDefination.web_sd;

import com.stepDefination.utility.DriverClass;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.When;
import org.openqa.selenium.By;

public class lastMinute_sd extends DriverClass {
    @When("^I click on flight hotel tab on home page$")
    public void iClickOnFlightHotelTabOnHomePage() throws InterruptedException {
//        driver.findElement(By.linkText("Flight + Hotel")).click();
        Thread.sleep(2000);
        driver.findElement(By.xpath("//a[@title='Flight + Hotel']")).click();
    }

    @Given("^I enter departure as\"([^\"]*)\"$")
    public void iEnterDepartureAs(String departure) throws InterruptedException {
//        driver.switchTo().alert().accept();
        driver.findElement(By.cssSelector("body > div.as-oil.light > div > div > div.as-oil-l-row.as-oil-l-buttons > div:nth-child(1) > button")).click();
        Thread.sleep(6000);
        driver.findElement(By.cssSelector("#input-sgqsr")).click();
        driver.findElement(By.id("input-hbj00")).sendKeys("lon");
        driver.findElement(By.xpath("//*[@id=\'layoutContainer\']/div/div[2]/div/div/div/div/div/div/div/div/div[2]/div[1]/div/div[1]/div[1]/div/div[1]/div[2]/div/div[2]/text()")).click();
    }
}
