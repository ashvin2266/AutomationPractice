package com.stepDefination.pages;

import com.stepDefination.utility.DriverClass;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class GuruTestPage extends DriverClass {

@FindBy(xpath = "//a[contains(normalize-space(),'Mobile')]")
    WebElement mobileLink;




   public GuruTestPage() {
       PageFactory.initElements(driver,this);
   }
   public void clickMobileLink(){
       mobileLink.click();
   }






}
