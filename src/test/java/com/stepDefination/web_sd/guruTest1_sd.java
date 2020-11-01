package com.stepDefination.web_sd;

import com.stepDefination.pages.GuruTestPage;
import com.stepDefination.utility.CommonMethod;
import com.stepDefination.utility.DriverClass;
import cucumber.api.java.en.And;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import org.apache.commons.io.FileUtils;
import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;

import java.io.File;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

import static org.junit.Assert.assertEquals;

public class guruTest1_sd extends DriverClass {
    GuruTestPage gp=new GuruTestPage();
    private long xperia_price;
    private long xperia_price1;
    String mainMobile1;
    String mainMobile2;

    @Given("^I Verify Title of the page$")
    public void iVerifyTitleOfThePage() {
        String expectTitle="Home page";
        CommonMethod.verifyPageTitle(expectTitle);
    }
    @When("^I Click on �MOBILE� menu$")
    public void iClickOnMOBILEMenu() throws InterruptedException {
        gp.clickMobileLink();
    }
    @Then("^I  Verify the  Title of the page$")
    public void iVerifyTheTitleOfThePage() {
        String expTitle="Mobile";
        CommonMethod.verifyPageTitle(expTitle);
          }
    @Given("^In the list of all mobile$")
    public void inTheListOfAllMobile() {
        gp.totalAmountSearchResult();
    }

    @When("^I select �SORT BY� dropdown as �name�$")
    public void iSelectSORTBYDropdownAsName() {
        gp.sortByName();
    }

    @Then("^I Verify all products are sorted by name$")
    public void iVerifyAllProductsAreSortedByName() throws IOException {
      gp.iVerifyAllProductsAreSortedByName();
        }
//*******************************************************second scenario************************
    @Given("^I read the price of sony Xperia and note down the price$")
    public void  iReadThePriceOfSonyXperiaAneNoteDownThePrice() {
        String xperia_price = driver.findElement(By.id("product-price-1")).getText();
        System.out.println(xperia_price);
    }

    @When("^I click on sony xperia mobile$")
    public void iClickOnSonyXperiaMobile() {
        driver.findElement(By.id("product-collection-image-1")).click();
    }

    @Then("^I should see the sony experia mobile detail page$")
    public void iShouldSeeTheSonyExperiaMobileDetailPage() {
        driver.getCurrentUrl();
        System.out.println(driver.getTitle());
    }

    @And("^I should see the price of sony experia on mobile detail page$")
    public void iShouldSeeThePriceOfSonyExperiaOnMobileDetailPage() {
        String xperia_price1=driver.findElement(By.id("product-price-1")).getText();
        System.out.println(xperia_price1);
    }

    @And("^I compare both price from list page and mobile page$")
    public void iCompareBothPriceFromListPageAndMobilePage() throws InterruptedException {
        try {
        Assert.assertEquals(xperia_price,xperia_price1);}
        catch (Exception e){
            e.printStackTrace();
            }
        driver.findElement(By.cssSelector(".btn-cart > span:nth-child(1) > span:nth-child(1)")).click();
        Thread.sleep(3000);
        driver.findElement(By.cssSelector(".product-cart-actions > input:nth-child(1)")).clear();
        driver.findElement(By.cssSelector(".product-cart-actions > input:nth-child(1)")).sendKeys("600");
        driver.findElement(By.xpath("/html/body/div/div/div[2]/div/div/div/form/table/tbody/tr/td[4]/button/span/span")).click();

    }

    @Then("^I should see error message is  as \"([^\"]*)\"$")
    public void iShouldSeeErrorMessageIsAs(String error)  {

        String actual_errormsg= driver.findElement(By.cssSelector(".item-msg")).getText();
        Assert.assertEquals(error,actual_errormsg);

    }

    @When("^I click on empty cart button$")
    public void iClickOnEmptyCartButton() {
        driver.findElement(By.cssSelector("#empty_cart_button > span:nth-child(1) > span:nth-child(1)")).click();
    }

    @Then("^I should see the message is  as \"([^\"]*)\"$")
    public void iShouldSeeTheMessageIsAs(String msg)  {
       String actual_msg = driver.findElement(By.cssSelector(".page-title > h1:nth-child(1)")).getText();
       Assert.assertEquals(msg,actual_msg);
        System.out.println(msg);
        System.out.println(actual_msg);
    }

    @When("^I click on xperia mobile button add to compare$")
    public void iClickOnXperiaMobileButtonAddToCompare() {
        driver.findElement(By.xpath(".//*[@id='top']/body/div[1]/div/div[2]/div/div[2]/div[1]/div[3]/ul/li[3]/div/div[3]/ul/li[2]/a")).click();
//        driver.findElement(By.xpath(".//*[@id='top']/body/div[1]/div/div[2]/div/div[2]/div[1]/div[3]/ul/li[3]/div/div[3]/ul/li[2]/a")).click();           driver.findElement(By.cssSelector("li.item:nth-child(3) > div:nth-child(2) > div:nth-child(4) > ul:nth-child(2) > li:nth-child(2) > a:nth-child(2)")).click();
         mainMobile1=driver.findElement(By.xpath("//h2/a[@title='Sony Xperia']")).getText();
        System.out.println("mainMobile1" + mainMobile1);
    }

    @When("^I click on add to compare for iphone from mobile list$")
    public void iClickOnAddToCompareForIphoneFromMobileList() {
        driver.findElement(By.xpath("/html/body/div/div/div[2]/div/div[2]/div[1]/div[3]/ul/li[1]/div/div[3]/ul/li[2]/a")).click();
          mainMobile2= driver.findElement(By.xpath("//h2/a[@title='IPhone']")).getText();
        System.out.println("main mobile2" + mainMobile2);}

    @Then("^I should see the pop window is open as a titile \"([^\"]*)\"$")
    public void iShouldSeeThePopWindowIsOpenAsATitile(String arg0) {
        System.out.println(driver.getTitle());
        String a = driver.findElement(By.cssSelector(".block-list > div:nth-child(1) > strong:nth-child(1) > span:nth-child(1)")).getText();
        System.out.println(a);
    }


    @And("^I should see the selected both product in pop window$")
    public void iShouldSeeTheSelectedBothProductInPopWindow() {
        System.out.println( driver.findElements(By.className("compare-item-id")).size());
    }

    @When("^I click on compare button$")
    public void iClickOnCompareButton() throws InterruptedException {
                // 4. Click on �COMPARE� button. A popup window opens
        driver.findElement(By.xpath("//button[@title='Compare']")).click();
        Thread.sleep(1000);
        // switching to new window
        for (String handle : driver.getWindowHandles()) {
            driver.switchTo().window(handle);
        }

        // 5. Verify the pop-up window and check that the products are reflected in it
        //    Heading "COMPARE PRODUCTS" with selected products in it.
        String strHead = ("COMPARE PRODUCTS");
        String compHead = driver.findElement(By.xpath(".//*[@id='top']/body/div[1]/div[1]/h1")).getText();
        System.out.println("compHead = "+compHead);
        String popupMobile1 = driver.findElement(By.xpath("//h2/a[@title='Sony Xperia']")).getText();  // text captured "SONY XPERIA" in uppercase
        String popupMobile2 = driver.findElement(By.xpath("//h2/a[@title='IPhone']")).getText();  // text captured is "IPHONE" in uppercase

        System.out.println("popupMobile1 = "+popupMobile1);
        System.out.println("popupMobile2 = "+popupMobile2);
        Thread.sleep(1000);
        // to check the popup heading/title
        try {
            assertEquals(strHead, compHead);
        } catch (Exception e) {
            e.printStackTrace();
        }
        // to check the 2 mobiles selected are the two in the popup - this is tp check the IPhone
        try {

            assertEquals(mainMobile1, popupMobile1);
        } catch (Exception e) {
            e.printStackTrace();
        }
        // to check the 2 mobiles selected are the two in the popup - this is to check Sony X
        try {
            assertEquals(mainMobile2, popupMobile2);
        } catch (Exception e) {
            e.printStackTrace();
        }

        // 6. Close the Popup Windows
        driver.findElement(By.xpath("//button[@title='Close Window']")).click();

        // switching to new window
        for (String handle : driver.getWindowHandles()) {
            driver.switchTo().window(handle);
        }







    }
}
