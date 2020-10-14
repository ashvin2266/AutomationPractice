package com.stepDefination.pages;

import com.stepDefination.utility.DriverClass;
import org.openqa.selenium.By;
import org.openqa.selenium.support.ui.*;

public class createAnAccount_page extends DriverClass {
//    WebDriverWait wait= new WebDriverWait(driver,60);

    public void clickSignIn(){
        driver.findElement(By.linkText("Sign in")).click();
    }
    public void authenticationPage() throws InterruptedException {
//        Thread.sleep(2000);
        String ActualURL=driver.getCurrentUrl();
    }
    public void email(String Email1){
        driver.findElement(By.id("email_create")).sendKeys(Email1);
    }
    public void clickOnCreateAnAccount(){
        driver.findElement(By.id("SubmitCreate")).click();
    }
    public void personnelPage(){
        String ActualURL=driver.getCurrentUrl();
    }
    public void Title(String Title) throws InterruptedException {
        Thread.sleep(3000);
//        WebDriverWait wait= new WebDriverWait(driver,60);
//        wait.until(ExpectedConditions.visibilityOf((WebElement)By.name("id_gender"))).click();
//        Wait<WebDriver> wait = new FluentWait<WebDriver>(driver)
//                .withTimeout(60,TimeUnit.SECONDS)
//                .pollingEvery(5,TimeUnit.SECONDS)
//                .ignoring(NoSuchElementException.class);
//
        driver.findElement(By.name("id_gender")).click();

    }
    public void firstName(String firstName){
        driver.findElement(By.name("customer_firstname")).sendKeys(firstName);
    }
    public void lastName(String lastName){
        driver.findElement(By.name("customer_lastname")).sendKeys(lastName);
    }
    public void password(String password){
        driver.findElement(By.name("passwd")).sendKeys(password);
    }
    public void date(String Date){
        new Select(driver.findElement(By.name("days"))).selectByValue(Date);
    }
    public void month(String month){
        new Select(driver.findElement(By.name("months"))).selectByVisibleText(month);
    }
    public void year(String year){
        new Select(driver.findElement(By.id("years"))).selectByValue(year);
    }
    public void newsletter(){
        driver.findElement(By.id("newsletter")).click();
    }
    public void specialOffer(){
            driver.findElement(By.name("optin")).click();
        }
    public void companyName(String company){
        driver.findElement(By.id("company")).sendKeys(company);
    }
    public void address(String address){
        driver.findElement(By.name("address1")).sendKeys(address);
    }
    public void address2(String address2){
        driver.findElement(By.name("address2")).sendKeys(address2);
    }
    public void city(String city){
        driver.findElement(By.name("city")).sendKeys(city);
    }
    public void state(String state){
        new Select(driver.findElement(By.id("id_state"))).selectByIndex(2);
    }
    public void postcode(String postcode){
        driver.findElement(By.name("postcode")).sendKeys(postcode);
    }
    public void coutry(String country){
        new Select(driver.findElement(By.id("id_country"))).selectByValue("United state");
    }
    public void information(String info){
        driver.findElement(By.name("other")).sendKeys(info);
    }
    public void phone(String phone1){
        driver.findElement(By.id("phone")).sendKeys(phone1);
       }
    public void mobile(String mobile){
        driver.findElement(By.name("phone_mobile")).sendKeys(mobile);
    }
    public void reference(String alias){
        driver.findElement(By.name("alias")).sendKeys(alias);
    }
    public void clickRegister(){
        driver.findElement(By.name("submitAccount")).click();
    }
    public void accountPage(){
        String ActualURL=driver.getCurrentUrl();
    }


    }
