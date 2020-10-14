package com.stepDefination.web_sd;

import com.stepDefination.utility.DriverClass;
import cucumber.api.java.en.Given;
import org.openqa.selenium.By;
import org.openqa.selenium.support.ui.Select;

public class makeMyTrip_sd extends DriverClass {
    @Given("^i open a url as \"([^\"]*)\"$")
    public void iOpenAUrlAs(String URL) throws InterruptedException {
//        practice for make xpath//*[@id="\root\"]/div/div[2]/div/div[1]/ul/li[1]/span

//driver.findElement(By.xpath("//*[@id=\'root\']/div/div[2]/div/div[1]/ul/li[1]/span")).clear();
        driver.manage().deleteAllCookies();
        Thread.sleep(5000);

driver.findElement(By.id("fromCity")).sendKeys(" DEL");
        Thread.sleep(3000);
//        driver.findElement(By.id("react-autowhatever-1-section-0-item-0")).click();
        Thread.sleep(5000);
        driver.findElement(By.id("toCity")).click();
        driver.findElement(By.id("toCity")).sendKeys("MUM");

//        driver.findElement(By.xpath("//*[@id=\'root\']/div/div[2]/div/div[2]/div[1]/div[2]/div[1]/div/div/div/input")).sendKeys("MUM");
        Thread.sleep(2000);
        driver.findElement(By.xpath("//*[@id=\'react-autowhatever-1-section-0-item-0\']/div/div[1]/p[1]")).click();
        driver.findElement(By.cssSelector("div.dateInnerCell")).click();

// /*this is radiobutton assighnments       driver.findElement(By.xpath("//input[@value='radio1']")).click();
//        driver.findElement(By.id("dropdown-class-example")).click();
//     Select a=new Select(driver.findElement(By.xpath("//option[@value='option1']")));
//     a.selectByValue("Option1");/*
//*[@id="root"]/div/div[2]/div/div[1]/ul/li[3]/span



    }
}