package com.stepDefination;
import com.stepDefination.DriverClass;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;;
import cucumber.api.java.en.When;
import org.junit.Assert;
import org.openqa.selenium.By;


public class signin_stepDefination extends DriverClass {
    @Given("^I GOTO url as \"([^\"]*)\"$")
    public void iGOTOUrlAs(String URL) {
//OPEN A WEB BROWSER CHROME BROWSER
//   OPEN A URL
        System.out.println(URL);
//        WebDriverManager.chromedriver().setup();
//        driver = new ChromeDriver();
        driver.get(URL);
    }

    @When("^I click on log in button on home page$")
    public void iClickOnLogInButtonOnHomePage() {
        driver.findElement(By.linkText("Login")).click();

//        driver.manage().window().fullscreen();
//        driver.manage().window().maximize();
    }
    @Then("^I should see login page URL as\"([^\"]*)\"$")
    public void iShouldSeeLoginPageURLAs(String arg0)  {
        String actualURL;
        actualURL=driver.getCurrentUrl();
       Assert.assertEquals("https://www.d3dsecurity.co.uk/login/", driver.getCurrentUrl());
        System.out.println();

    }

//    @Then("^I should see login page$")
//    public void iShouldSeeLoginPage() {
//        String actualURL;
//        actualURL=driver.getCurrentUrl();
//       Assert.assertEquals("https://www.d3dsecurity.co.uk/login/", driver.getCurrentUrl());
//        System.out.println();
//    }

    @Given("^I enter username as \"([^\"]*)\"$")
    public void iEnterUsernameAs(String userName) {

        driver.findElement(By.name("log")).sendKeys(userName);
    }

    @Given("^I enter password as \"([^\"]*)\"$")
    public void iEnterPasswordAs(String password) {
        driver.findElement(By.name("pwd")).sendKeys(password);
    }

    @When("^I click on log in button on login page$")
    public void iClickOnLogInButtonOnLoginPage() {
        driver.findElement(By.name("submit")).click();
    }

//     @Then("^I should see my Account button page$")
//     public void iShouldSeeMyAccountButtonPage() {
//
//    }


    @Then("^I should see error as \"([^\"]*)\" page$")
    public void iShouldSeeErrorAsPage(String errorMessage) {
        String actual_result;
        System.out.println(errorMessage);
        actual_result = driver.findElement(By.xpath("//*[@id=\"post-4521\"]/div/div[1]/p")).getText();
        System.out.println("expected error message" + errorMessage);
        System.out.println("actual error message" + actual_result);
        Assert.assertEquals(errorMessage, actual_result);
//        Assert.assertNotEquals(errormessage,actual_result);
//          assert true; (errormessage; "actual_result")   }
    }


}