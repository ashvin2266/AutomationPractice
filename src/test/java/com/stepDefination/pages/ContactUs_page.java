package com.stepDefination.pages;

import com.stepDefination.utility.DriverClass;
import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;

public class ContactUs_page extends DriverClass {

    @FindBy(linkText = "Contact us")
    WebElement contactUsLink;
    @FindBy(id = "email")
    WebElement email;
    @FindBy(id = "id_order")
    WebElement orderRef;
    @FindBy(id = "fileUpload")
    WebElement fileUpload;
    @FindBy(id = "message")
    WebElement message;
    @FindBy(name = "submitMessage")
    WebElement submitMsg;
    @FindBy(css = "#center_column > p")
    WebElement successMsg;
    @FindBy(xpath = "//div[@class='alert alert-danger']/p")
    WebElement errorMsg;
    @FindBy(xpath = "//div[@class='alert alert-danger']/ol/li")
    WebElement errorMsg1;
    @FindBy(xpath = "//*[@id='uniform-fileUpload']/span[1]")
    WebElement NoFileUpload;





    public ContactUs_page(){
        PageFactory.initElements(driver,this);
    }





    public void clickContactUs() {

        contactUsLink.click();
    }

    public void expected_heading(String sub_heading) {
      Select SubHeading= new Select(driver.findElement(By.name("id_contact")));
      if(sub_heading.equalsIgnoreCase("Customer Service")){
          SubHeading.selectByValue("2");
      }
      else if(sub_heading.equalsIgnoreCase("Webmaster")){
          SubHeading.selectByValue("1");}

    }

    public void enterEmail(String Email) {
        email.sendKeys(Email);
    }

    public void orderRef(String order_ref) {
        orderRef.sendKeys(order_ref);
    }

    public void attachedFile() {
       String path = System.getProperty("user.dir");
       fileUpload.sendKeys(path + "/src/test/java/com/testData/sampleDataText.txt");
    }

    public void message1(String message1) {
        message.sendKeys(message1);
    }

    public void sendButton() {
        submitMsg.click();
    }

    public void seeURL(String controller_url) {
        String ActualURL = driver.getCurrentUrl();
        Assert.assertEquals(ActualURL, controller_url);

    }

    public void message2(String errorMessage) {

        if (errorMessage.equalsIgnoreCase("Your message has been successfully sent to our team.")) {
            String actual_message = successMsg.getText();
            Assert.assertEquals(errorMessage, actual_message);
            log.info("Actual  message is  "+actual_message);
        }else if (errorMessage.equalsIgnoreCase("There is 1 error")) {
            String actual_message = errorMsg.getText();
            Assert.assertEquals(errorMessage, actual_message);
            log.info("Actual  message is  " + actual_message);
        } else if (errorMessage.equalsIgnoreCase("The message cannot be blank.")) {
            String actual_message = errorMsg1.getText();
            Assert.assertEquals(errorMessage, actual_message);
            log.info("Actual  message is  " + actual_message);
        } else if (errorMessage.equalsIgnoreCase("Invalid email address.")) {
            String actual_message = errorMsg1.getText();
            Assert.assertEquals(errorMessage, actual_message);
            log.info("Actual  message is  " + actual_message);
        }
        log.info("Expected message is  " + errorMessage);
    }
    public void withoutAttachedFile() {
        String noFileUpload=NoFileUpload.getText();
        log.info("File is not Uploaded----> "+noFileUpload);
    }

}




