package com.stepDefination.utility;

import cucumber.api.java.cs.A;
import org.junit.Assert;
import org.openqa.selenium.WebElement;

import java.io.IOException;

public class CommonMethod extends DriverClass{

    public void verifyUrl(String Url) throws IOException {
//        Url=getProperty("url");
        String actualUrl=driver.getCurrentUrl();
        Assert.assertEquals(Url,actualUrl);
        log.info("expected Url is "+Url);
        log.info("Actual Url is "+ actualUrl);

    }
    public void verifyPageTitle(String expTitle){
        String actualPageTitle= driver.getTitle();
        Assert.assertEquals(expTitle,actualPageTitle);
        log.info("Page Title is verified Actual pagetitle is "+actualPageTitle);
    }
    public void getText(WebElement element){
        element.getText();
    }




}
