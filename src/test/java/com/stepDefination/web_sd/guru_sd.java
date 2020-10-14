package com.stepDefination.web_sd;

import com.stepDefination.utility.DriverClass;
import cucumber.api.java.en.And;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;

import java.util.List;

import static org.junit.Assert.assertEquals;

public class guru_sd extends DriverClass {

        @Given("^I go to url as \"([^\"]*)\"$")
    public void iGoToUrlAs(String url) {
            String actual_url = driver.getCurrentUrl();
            Assert.assertEquals(url,actual_url);
            System.out.println(url);
            System.out.println(actual_url);    }

    @Then("^I should see the title of home page is \"([^\"]*)\"$")
    public void iShouldSeeTheTitleOfHomePageIs(String titlePage)  {
        driver.getTitle();
        System.out.println(titlePage);

    }
    @And("^I should see the home page contain text as \"([^\"]*)\"$")
    public void iShouldSeeTheHomePageContainTextAs(String text)  {
           String actualText = driver.findElement(By.className("page-title")).getText();
           Assert.assertEquals(text,actualText);
        System.out.println(text);
        System.out.println(actualText);


}

    @When("^I click on Mobile button on Home page$")
    public void iClickOnMobileButtonOnHomePage() {
            driver.findElement(By.className("level0")).click();
    }

    @Then("^I should see mobile page url as \"([^\"]*)\"$")
    public void iShouldSeeMobilePageUrlAs(String url1) {
          String actual_url1 =  driver.getCurrentUrl();
          Assert.assertEquals(url1,actual_url1);
        System.out.println(url1);
        System.out.println(actual_url1);

    }

    @And("^I should see the title of page is \"([^\"]*)\"$")
    public void iShouldSeeTheTitleOfPageIs(String title1)  {
      String title = driver.getTitle();
      Assert.assertEquals(title1,title);
    }

    @And("^I should see the list of mobile items$")
    public void iShouldSeeTheListOfMobileItems() {
          String items =  driver.findElement(By.xpath("/html/body/div/div/div[2]/div/div[2]/div[1]/div[3]/div[1]/div[2]/div/p/strong")).getText();
        System.out.println(items);
    }

    @When("^I click on short by drop down box$")
    public void iClickOnShortByDropDownBox() {
            driver.findElement(By.xpath("/html/body/div/div/div[2]/div/div[2]/div[1]/div[3]/div[1]/div[1]/div/select")).click();
    }

    @Given("^I select option from list as \"([^\"]*)\"$")
    public void iSelectOptionFromListAs(String option)  {
        driver.findElement(By.xpath("/html/body/div/div/div[2]/div/div[2]/div[1]/div[3]/div[1]/div[1]/div/select")).sendKeys(Keys.ARROW_DOWN);
           }

    @When("^I click on Name$")
    public void iClickOnName() {
       Select option=new Select(driver.findElement(By.xpath("/html/body/div/div/div[2]/div/div[2]/div[1]/div[3]/div[1]/div[1]/div/select")));
       option.selectByVisibleText("Name");
    }

    @Then("^I should see the list of item by Name$")
    public void iShouldSeeTheListOfItemByName() throws InterruptedException {
            List<WebElement> text =  driver.findElements(By.className("product-name"));
            int i=text.size();

        for (  i=0;i<=3;i++){
//            System.out.println( text.get(i).getText());


//                    if (text.contains("Iphone")){
//                System.out.println(text);}else
//
//                if (text.contains("Samsung galaxy")){
//                    System.out.println(text);
//                }
//            }


            }





    // 2. Click on my account link
	    driver.findElement(By.linkText("MY ACCOUNT")).click();
	    Thread.sleep(2000);

    // switching to new window
	    for (String handle : driver.getWindowHandles()) {
        driver.switchTo().window(handle);
    }

    // 3a. Click Create an Account link
	    driver.findElement(By.linkText("CREATE AN ACCOUNT")).click();
	    Thread.sleep(2000);

    // switching to new window
	    for (String handle : driver.getWindowHandles()) {
        driver.switchTo().window(handle);
    }
    // 3b. and fill New User information
	    driver.findElement(By.id("firstname")).clear();
	    driver.findElement(By.id("firstname")).sendKeys("first");
	    driver.findElement(By.id("lastname")).clear();
	    driver.findElement(By.id("lastname")).sendKeys("lastName");
	    driver.findElement(By.id("email_address")).clear();
	    driver.findElement(By.id("email_address")).sendKeys("Berry987678@tpg.com.au");
	    driver.findElement(By.id("password")).clear();
	    driver.findElement(By.id("password")).sendKeys("mar8mar");
	    driver.findElement(By.id("confirmation")).clear();
	    driver.findElement(By.id("confirmation")).sendKeys("mar8mar");

    // 4. Click Register
	    driver.findElement(By.xpath("//button[@title='Register']")).click();
	    Thread.sleep(2000);

    // switching to new window
	    for (String handle : driver.getWindowHandles()) {
        driver.switchTo().window(handle);
    }

    // 5. Verify Registration is done. Expected account registration done.
//    String vWelcome = ("WELCOME, " + "firstName" + " " + "lastName" + "!");
//    String tWelcome = driver.findElement(By.xpath(".//*[@id='top']/body/div[1]/div/div[1]/div/p")).getText();
//	    System.out.println("tWelcome = "+tWelcome);
//
//	    try {
//        assertEquals(tWelcome, vWelcome);
//    } catch (Exception e) {
//        e.printStackTrace();
//    }

    // 6. Go to TV menu
	    driver.findElement(By.xpath(".//*[@id='nav']/ol/li[2]/a")).click();
	    Thread.sleep(2000);

    // switching to new window
	    for (String handle : driver.getWindowHandles()) {
        driver.switchTo().window(handle);
    }

    // 7. Add product in your wish list - use product - LG LCD
	    driver.findElement(By.xpath("//li/a[@class='link-wishlist']")).click();

	    Thread.sleep(2000);

    // switching to new window
	    for (String handle : driver.getWindowHandles()) {
        driver.switchTo().window(handle);
    }

    // 8. Click SHARE WISHLIST
	    driver.findElement(By.xpath("//button[@title='Share Wishlist']")).click();

	    Thread.sleep(2000);

    // switching to new window
	    for (String handle : driver.getWindowHandles()) {
        driver.switchTo().window(handle);
    }

    // 9. In next page enter Email and a message and click SHARE WISHLIST
	    driver.findElement(By.id("email_address")).clear();
	    driver.findElement(By.id("email_address")).sendKeys("support@guru99.com");
	    driver.findElement(By.id("message")).clear();
	    driver.findElement(By.id("message")).sendKeys("Hey Mary!! this LCD TV looks ok, check it out !!.. cheers .. Berry");

	    driver.findElement(By.xpath("//button[@title='Share Wishlist']")).click();
    // the above click will still be in the same page as prior page, so no need take another handle to another window

	    Thread.sleep(2000);

    // 10. Check wishlist is shared. Expected wishlist shared successfully.
    String vWishList = "Your Wishlist has been shared.";
    String wishList = driver.findElement(By.xpath(".//*[@id='top']/body/div[1]/div/div[2]/div/div[2]/div/div[1]/ul/li/ul/li/span")).getText();
	    System.out.println("wishList = "+wishList);
	    try {
        assertEquals(vWishList, wishList);
    } catch (Exception e) {
        e.printStackTrace();
    }

	    Thread.sleep(2000);}

//    @AfterTest
//    public void tearDown() throws Exception {
//        Thread.sleep(1000);
//        driver.quit();
//    }


}
