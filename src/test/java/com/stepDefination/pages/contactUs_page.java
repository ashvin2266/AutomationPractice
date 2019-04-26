package com.stepDefination.pages;

import com.stepDefination.DriverClass;
import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.support.ui.Select;

public class contactUs_page extends DriverClass {
    public void clickContactUs() {

        driver.findElement(By.linkText("Contact us")).click();
    }

    public void expected_heading(String sub_heading) {

       new Select(driver.findElement(By.name("id_contact"))).selectByVisibleText(sub_heading);
//        new Select(driver.findElement(By.name("id_contact"))).selectByValue("2");
//
//         new Select(driver.findElement(By.name("id_contact"))).selectByValue("2");

    }

    public void enterEmail(String Email) {
        driver.findElement(By.id("email")).sendKeys(Email);
    }

    public void orderRef(String order_ref) {
        driver.findElement(By.id("id_order")).sendKeys(order_ref);
    }

    public void attachedFile() {
       String path = System.getProperty("user.dir");
       driver.findElement(By.id("fileUpload")).sendKeys(path + "/src/test/java/com/testData/sampleDataText.txt");
    }

    public void message1(String message1) {
        driver.findElement(By.id("message")).sendKeys(message1);
    }

    public void sendButton() {
        driver.findElement(By.name("submitMessage")).click();
    }

    public void seeURL(String controller_url) {
        String ActualURL = driver.getCurrentUrl();
        Assert.assertEquals(ActualURL, controller_url);

    }

    public void message2(String message)  {
        if (message.equalsIgnoreCase(" Your message has been successfully sent to our team.")){
         String actual_message= driver.findElement(By.cssSelector("#center_column > p")).getText();
        System.out.println(message);
        System.out.println(actual_message);
        actual_message= actual_message.replace( "\n"," ");
        Assert.assertEquals(message,actual_message);}
        else if (message.equalsIgnoreCase("There is 1 error The message cannot be blank. ")){

            String actual_message= driver.findElement(By.xpath("//*[@id=\"center_column\"]/div")).getText();
            actual_message= actual_message.replace( "\n"," ");
            Assert.assertEquals(message,actual_message);}
        else if(message.equalsIgnoreCase("There is 1 error Invalid email address. ")){
            String actual_message= driver.findElement(By.xpath("//*[@id=\"center_column\"]/div")).getText();


        }
    }

//    public void subjectHeading() {
//        new Select(driver.findElement(By.id("id_contact"))).selectByIndex(2);
//    }
//
//    public void errorMessage(String message3) {
//        driver.findElement(By.xpath("//*[@id=\"center_column\"]/div/ol/li")).getText();
//    }
//
//    public void message4(String message4) {
//        driver.findElement(By.xpath("//*[@id=\"center_column\"]/div/ol/li")).getText();
//    }
//
    public void withoutAttachedFile() {
        driver.findElement(By.xpath("//*[@id=\"uniform-fileUpload\"]/span[1]")).getText();
    }

//    public void heading(String subHeading) {
//        new Select(driver.findElement(By.name("id_contact"))).selectByValue("1");
//    }

}




