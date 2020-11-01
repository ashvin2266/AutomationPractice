package com.stepDefination.pages;

import com.stepDefination.utility.DriverClass;
import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;

import java.io.IOException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class GuruTestPage extends DriverClass {

@FindBy(xpath = "//a[contains(normalize-space(),'Mobile')]")
    WebElement mobileLink;
@FindBy(xpath = "//p[@class='amount amount--no-pages']")
WebElement searchResult;
@FindBy(xpath = "//select[@title='Sort By']")
WebElement sortBy;
@FindBy(xpath = "//ul[@class='products-grid products-grid--max-4-col first last odd']/li/div/h2")
List<WebElement> mobileByName;



   public GuruTestPage() {
       PageFactory.initElements(driver,this);
   }
   public void clickMobileLink(){
       mobileLink.click();
   }
   public void totalAmountSearchResult(){
       String totalItemsSearched =  driver.findElement(By.xpath("//p[@class='amount amount--no-pages']")).getText();
       System.out.println(totalItemsSearched);

   }
   public void sortByName(){
       //select[@title='Sort By']
       new Select(sortBy).selectByVisibleText("Name");
   }
    public void iVerifyAllProductsAreSortedByName() throws IOException {
        List<String> mobileList=new ArrayList<String>();
        List<WebElement> product= mobileByName;
        for (int i=0;i<product.size();i++){
            String mobileName= product.get(i).getText();
            mobileList.add(mobileName);
        }
        System.out.println(mobileList);
        List<String>templist=new ArrayList<String>();
        templist.addAll(mobileList);
        Collections.sort(templist);
        Assert.assertEquals(templist,mobileList);
        log.info("All mobile is sorted "+mobileList+ "By Name is verified ");
    }







}
