package com.stepDefination.pages;

import com.stepDefination.utility.DriverClass;
import cucumber.api.DataTable;
import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class alreadyRegistered_page extends DriverClass {
    @FindBy(linkText = "Sign in")
    WebElement signInBtn;
    @FindBy(id = "email")
    WebElement email;
    @FindBy(id = "passwd")
    WebElement passwd;
    @FindBy(name = "SubmitLogin")
    WebElement signin;
    @FindBy(xpath = "//div[@class='alert alert-danger']/ol/li")
    WebElement errorMsg;


    public alreadyRegistered_page(){
        PageFactory.initElements(driver,this);
    }

    public void clickSignIn()  {
        signInBtn.click();

            }
    public void seeUrl(){

        String Actual_URL=driver.getCurrentUrl();
    }
    public void enteraEmail(String Email){
        email.sendKeys(Email);
    }
    public void clickSignInButton(){
        signin.click();
    }
    public void Password(String password){
            passwd.sendKeys(password);}

    public void message(String message)  {

      String actual_message;
            actual_message = errorMsg.getText();
            Assert.assertEquals(message,actual_message);
            log.info("Actual error msg is "+actual_message);
    }
    public void enterData(DataTable table){
        email.sendKeys(table.getGherkinRows().get(1).getCells().get(0));
        log.info(table.getGherkinRows().get(1).getCells().get(0));
        log.info(table.getGherkinRows().get(1).getCells().get(1));
        passwd.sendKeys(table.getGherkinRows().get(1).getCells().get(1));
    }


}
