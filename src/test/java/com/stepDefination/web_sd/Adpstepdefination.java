package com.stepDefination.web_sd;

import com.stepDefination.utility.DriverClass;
import cucumber.api.java.en.When;
import org.openqa.selenium.By;

public class Adpstepdefination extends DriverClass {
    @When("^I click on my get a quote$")
    public void iClickOnMyGetAQuote() {
        driver.findElement(By.linkText("Get a free quote")).click();
        driver.findElement(By.xpath("//*[@id=\'adp-modal-2\']/div/div/div/div[2]/div/div[2]/label")).click();
        driver.findElement(By.xpath("//*[@id=\'adp-modal-2\']/div/div/div/div[5]/a[2]")).click();
        driver.findElement(By.name("First_Name")).sendKeys("abc");


    }
}
