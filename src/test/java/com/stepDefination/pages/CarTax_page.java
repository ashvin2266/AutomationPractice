package com.stepDefination.pages;

import com.stepDefination.utility.DriverClass;
import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class CarTax_page extends DriverClass {

    @FindBy(linkText = "Driving and transport")
    WebElement drivingLink;
    @FindBy(xpath = "//*[@id=\"section\"]/div/ul/li[2]/a/h3")
    WebElement vehicleTaxMot;
    @FindBy(xpath = "//div[@id='subsection']//ul[1]//li[3]//a[1]")
    WebElement vehicleTaxedorNot;
    @FindBy(linkText = "Start now")
    WebElement startNowBtn;
    @FindBy(xpath = "//input[@id='wizard_vehicle_enquiry_capture_vrn_vrn']")
    WebElement enterRegNo;
    @FindBy(id = "submit_vrn_button")
    WebElement continueBtn;
    @FindBy(xpath = "//h1[contains(normalize-space(),'Is this the vehicle you are looking for?')]")
    WebElement MSG;
    @FindBy(xpath = "//input[@id='no-vehicle-confirm']")
    WebElement clickOnSearchBtn;
    @FindBy(id = "capture_confirm_button")
    WebElement confirmBtn;






    public CarTax_page(){
        PageFactory.initElements(driver,this);
    }
    public void clickOnDriveingAndTrasportLink(){
        drivingLink.click();
    }
    public void ClickOnVehicleTaxMOTAndInsuranceLinkOnDrivingPage(){
        vehicleTaxMot.click();
            }
    public void vehicleTaxedorNot(){
        vehicleTaxedorNot.click();
            }
    public void startClick()  {
        startNowBtn.click();
    }
    public void EnterRegistrationNumberOfVehicleAs(String regNo) throws InterruptedException {
        enterRegNo.sendKeys(regNo);
    }
    public void ClickOnContinueButtonOnServicePage() {
        continueBtn.click();
    }
    public void getMessege(String message){
       String ActualMSG= MSG.getText();
        Assert.assertEquals(message,ActualMSG);
        log.info("Message of Page is verified "+ ActualMSG);
    }
    public void iClickNoSearchAgainButton() {
        clickOnSearchBtn.click();
    }
    public void clickOnContinueButton() {
        confirmBtn.click();
    }

}
