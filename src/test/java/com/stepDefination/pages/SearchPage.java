package com.stepDefination.pages;

import com.stepDefination.utility.DriverClass;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.CacheLookup;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class SearchPage extends DriverClass {
    WebDriver ldriver;
        public  SearchPage(WebDriver rdriver){
        ldriver=rdriver;
        PageFactory.initElements(rdriver,this);

    }
    @FindBy(id = "site-search")
    @CacheLookup
    WebElement search;
public void setSearch(){
    search.click();
}
    public void SearchPageUrl(String searchUrl)  {
        driver.getCurrentUrl();
        System.out.println(searchUrl);}
    public void SearchItem(String items) {
        driver.findElement(By.id("site-search")).sendKeys(items);
    }
    public void ClickSearchButton() {
        driver.findElement(By.xpath("//button[@type='submit']")).click();
    }




}
