package com.stepDefination.pages;

import com.stepDefination.utility.DriverClass;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class GetAQuote_page extends DriverClass {
    @FindBy(linkText = "Login")
    WebElement loginBtn;
    @FindBy(name = "first-name")
    WebElement firstName;
    @FindBy(name = "last-name")
    WebElement lastName;
    @FindBy(name = "your-email")
    WebElement email;
    @FindBy(name = "your-subject")
    WebElement subject;
    @FindBy(name = "tel-879")
    WebElement phone;
    @FindBy(name = "your-message")
    WebElement enterMsg;
    @FindBy(xpath = "//input[@value='Send Message']")
    WebElement sendMsgBtn;
    @FindBy(name = "captcha-005")
    WebElement captcha;

    public GetAQuote_page() {
        PageFactory.initElements(driver, this);
    }

    public void ClickLogInBtn() {
        loginBtn.click();

    }
    public void FirstName(String firstname){
        firstName.sendKeys(firstname);}
    public void LastName(String lastname) {
        lastName.sendKeys(lastname);
    }
    public void EnterEmail(String Email) {
        email.sendKeys(Email);
    }

    public void EnterSubject(String Subject)
    {
        subject.sendKeys(Subject);
    }

     public void EnterMyPhoneNumber(String phoneNumber)  {
        phone.sendKeys(phoneNumber);
    }

     public void EnterMessage(String message)  {
        enterMsg.sendKeys(message);
    }

    public void EnterCaptchaCodeShownInPageAs(String arg0) {
        captcha.sendKeys(arg0);
//        //img[@alt='captcha']
    }
    public void iClickOnSendMessageButton() {
        sendMsgBtn.click();  }
    public void TheMessage(String MSG) {
//        System.out.println();
//        String actual_result;
//        actual_result=driver.findElement(By.xpath("//*[@id=\"wpc_5c990a779aea1\"]/div/div/div/div/div/h2")).getText();
//        Assert.assertEquals(arg0,"actual result");
//        System.out.println(arg0);


    }



//    @Then("^I should see log in page with Get a free Quote$")
//    public void iShouldSeeLogInPageWithGetAFreeQuote() {
//    }
}