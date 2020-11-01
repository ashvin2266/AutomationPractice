package com.stepDefination.utility;

import cucumber.api.java.cs.A;
import org.apache.commons.lang3.RandomStringUtils;
import org.junit.Assert;
import org.openqa.selenium.WebElement;

import java.io.IOException;

public class CommonMethod extends DriverClass{
    public void verifyUrlOfHomePage(String url) throws IOException {
        url=getProperty("url2");
        String actualUrl=driver.getCurrentUrl();
        Assert.assertEquals(url,actualUrl);
        log.info("expected Url is "+url);
        log.info("Actual Url is "+ actualUrl);

   }
   public  void goToHomePage(String url) throws IOException {
        driver.get(getProperty("url3"));
   }

    public static void verifyUrl(String Url) throws IOException {
        String actualUrl=driver.getCurrentUrl();
        Assert.assertEquals(Url,actualUrl);
        log.info("expected Url is "+Url);
        log.info("Actual Url is "+ actualUrl);

    }
    public static void verifyPageTitle(String expTitle){
        String actualPageTitle= driver.getTitle();
        Assert.assertEquals(expTitle,actualPageTitle);
        log.info("Page Title is verified Actual pagetitle is "+actualPageTitle);
    }
    public void getText(WebElement element){
        element.getText();
    }
    public static String StringrandomString() {
        String generatedString1= RandomStringUtils.randomAlphabetic(4);
        return (generatedString1);}





}
