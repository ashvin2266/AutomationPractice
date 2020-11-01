package com.stepDefination.pages;

import com.stepDefination.utility.CommonMethod;
import com.stepDefination.utility.DriverClass;
import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;


public class createAnAccount_page extends DriverClass {
//    WebDriverWait wait= new WebDriverWait(driver,60);
    @FindBy(id = "email_create")
    WebElement email;
    @FindBy(id = "SubmitCreate")
    WebElement submit;
    @FindBy(id = "id_gender1")
    WebElement clickMr;
    @FindBy(id = "uniform-id_gender2")
    WebElement clickMrs;
    @FindBy(name = "customer_lastname")
    WebElement LastName;
    @FindBy(name = "passwd")
    WebElement Passwd;
    @FindBy(name = "customer_firstname")
    WebElement FirstName;
    @FindBy(name = "days")
    WebElement day;
    @FindBy(name = "months")
    WebElement Month;
    @FindBy(id = "years")
    WebElement Year;
    @FindBy(id = "newsletter")
    WebElement news;
    @FindBy(name = "optin")
    WebElement offer;
    @FindBy(id = "company")
    WebElement Company;
    @FindBy(xpath = "//span[@class='navigation_page']")
    WebElement pageHeading;




    public createAnAccount_page(){
        PageFactory.initElements(driver,this);
    }


    public void email(String Email1){
         Email1= CommonMethod.StringrandomString()+"@gmail.com";
        System.out.println(Email1);
        email.sendKeys(Email1);
    }
    public void clickOnCreateAnAccount()
    {
        submit.click();
    }
       public void Title(String Title) throws InterruptedException {
        Thread.sleep(5000);
           if (Title.equalsIgnoreCase("Mr.")){
        clickMr.click();}
           else if (Title.equalsIgnoreCase("Mrs.")){          clickMrs.click();

           }
           log.info ("Title "+ Title +" is selected");

    }
    public void firstName(String firstName){
        FirstName.sendKeys(firstName);
    }
    public void lastName(String lastName){
        LastName.sendKeys(lastName);
    }
    public void password(String password){
        Passwd.sendKeys(password);
    }
    public void date(String Date){
        new Select(day).selectByValue(Date);
    }
    public void month(String month){
        new Select(Month).selectByVisibleText(month);
    }
    public void year(String year){
        new Select(Year).selectByValue(year);
    }
    public void newsletter(){
        news.click();
    }
    public void specialOffer(){
            offer.click();
        }
    public void companyName(String company){
        Company.sendKeys(company);
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
    public void verifyPageHeading(String pagetitle){
        String actualHeading=pageHeading.getText();
        Assert.assertEquals(pagetitle,actualHeading);
        log.info("My Account page Heading is verified ="+ actualHeading);
    }


    }
