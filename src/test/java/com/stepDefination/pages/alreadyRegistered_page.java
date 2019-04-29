package com.stepDefination.pages;

import com.stepDefination.DriverClass;
import cucumber.api.DataTable;
import org.junit.Assert;
import org.openqa.selenium.By;

import java.util.List;

public class alreadyRegistered_page extends DriverClass {
    public void clickSignIn(){
        driver.findElement(By.linkText("Sign in")).click();
            }
    public void seeUrl(){
        String Actual_URL=driver.getCurrentUrl();
    }
    public void enteraEmail(String email){
        driver.findElement(By.id("email")).sendKeys(email);
    }
    public void clickSignInButton(){
        driver.findElement(By.name("SubmitLogin")).click();

    }
    public void Password(String password){
            driver.findElement(By.name("passwd")).sendKeys(password);}

    public void message(String message) throws InterruptedException {
        Thread.sleep(2000);
        String actual_message;
        if ( message.equalsIgnoreCase("password is required.")){
            actual_message = driver.findElement(By.xpath("//*[@id=\"columns\"]/div[1]/span[2]")).getText();
            Assert.assertEquals(message,actual_message);}
        else if (message.equalsIgnoreCase("An email address required.")){
            actual_message = driver.findElement(By.xpath("//*[@id=\"center_column\"]/div[1]/ol/li")).getText();
            Assert.assertEquals(message,actual_message);
        }
    }
    public void enterData(DataTable table){
//        List<List<String>>Data =table.getGherkinRows().get(1).getCells().get(0);
//        System.out.println(table.getGherkinRows().get(1).getCells().get(0));
//        System.out.println(table.getGherkinRows().get(1).getCells().get(1));

//       driver.findElement(By.id("email")).sendKeys(table.getGherkinRows().get(1).getCells().get(0));
//        System.out.println(table.getGherkinRows().get(0).getCells().get(1));
//        driver.findElement(By.name("passwd")).sendKeys();

    }
    public void errorMessage(String message){
        String actual_message = driver.findElement(By.xpath("//*[@id=\"center_column\"]/div[1]/ol/li")).getText();

        Assert.assertEquals(message,actual_message);
    }
    public void ErrorMessage(String errorMessage){
        String actual_message= driver.findElement(By.xpath("//*[@id=\"center_column\"]/div[1]/ol/li")).getText();
        Assert.assertEquals(errorMessage,actual_message);
    }


}
