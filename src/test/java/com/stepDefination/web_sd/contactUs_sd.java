package com.stepDefination.web_sd;

import com.stepDefination.utility.DriverClass;
import com.stepDefination.pages.ContactUs_page;
import cucumber.api.DataTable;
import cucumber.api.java.en.And;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;

public class contactUs_sd extends DriverClass {
    public ContactUs_page c_page = PageFactory.initElements(driver, ContactUs_page.class);
//    contact 1
    @When("^I click on contact us on home page$")
    public void iClickOnContactUsOnHomePage() {
        c_page.clickContactUs();
    }
    @Then("^I should see the url contains \"([^\"]*)\"$")
    public void iShouldSeeTheUrlContains(String partialURL) {
        String actual_url = driver.getCurrentUrl();
        Assert.assertTrue(actual_url.contains(partialURL));
        log.info("Page Url is verified  "+ actual_url);
    }
    @Given("^I selected subject heading as \"([^\"]*)\"$")
    public void iSelectedSubjectHeadingAs(String sub_heading)
    {
        c_page.expected_heading(sub_heading);    }

    @Given("^I enter a valid email as\"([^\"]*)\"$")
    public void iEnterAValidEmailAs(String Email) {
        c_page.enterEmail(Email);
    }

    @Given("^I enter order reference as \"([^\"]*)\"$")
    public void iEnterOrderReferenceAs(String order_ref) {
        c_page.orderRef(order_ref);
    }
    @Given("^I enter a message as \"([^\"]*)\"$")
    public void iEnterAMessageAs(String message1) {
        c_page.message1(message1);
    }

    @Given("^I attached file$")
    public void iAttachedFile() {
        c_page.attachedFile();
    }

    @When("^I click on send button$")
    public void iClickOnSendButton() {
        c_page.sendButton();
    }

    @Then("^I should see url as \"([^\"]*)\"$")
    public void iShouldSeeUrlAs(String controller_url) {
        c_page.seeURL(controller_url);
    }

    @Then("^I should see the message as \"([^\"]*)\"$")
    public void iShouldSeeTheMessageAs(String message) {
        c_page.message2(message);
    }
    @Given("^I enter without attached file$")
    public void iEnterWithoutAttachedFile() {
        c_page.withoutAttachedFile();
    }


//  other contact2 to10
    //following are is displayed is selected is enable method how to verify

    @Then("^I should not see sign Out button$")
    public void iShouldNotSeeSignOutButton() {
        int signOutButton = driver.findElements(By.linkText("Sign out")).size();
        Assert.assertEquals(0, signOutButton);
        log.info("Not seen signOut button is verified "+signOutButton);

    }
    @And("^i should see sign in button$")
    public void iShouldSeeSignInButton() {
        boolean ButtonDisplay = driver.findElement(By.linkText("Sign in")).isDisplayed();
        Assert.assertTrue(ButtonDisplay);
        log.info("Sign in button is displayed  "+ ButtonDisplay);
    }
    @Then("^I should see Contact Us button$")
    public void iShouldSeeContactUsButton() throws InterruptedException {
        boolean contactUsButton = driver.findElement(By.xpath("//div[@id='contact-link']")).isDisplayed();
        Assert.assertTrue(contactUsButton);
        log.info("Contact us button is displayed  "+contactUsButton);
    }

    @When("^I click Browser back button$")
    public void iClickBrowserBackButton() {
        driver.navigate().back();
    }

    @Then("^I should not see the message as a \"([^\"]*)\"$")
    public void iShouldNotSeeTheMessageAsA(String arg0)  {
        int messageDisplayed = driver.findElements(By.xpath("//*[@id='center_column']/div")).size();
        Assert.assertEquals(0,messageDisplayed);

    }

    @When("^I click browser forward button$")
    public void iClickBrowserForwardButton() {
        driver.navigate().forward();
    }

    @Then("^I should see the message as a \"([^\"]*)\"$")
    public void iShouldSeeTheMessageAsA(String errorMessage)  {
       String actual_errorMessage = driver.findElement(By.xpath("//*[@id=\"center_column\"]/div")).getText();
         actual_errorMessage= actual_errorMessage.replace( "\n"," ");
         Assert.assertEquals(errorMessage,actual_errorMessage);



            }
//            stepDefination for DataTable`

    @Given("^I selected subject heading as$")
    public void iSelectedSubjectHeadingAs(DataTable table) {
        String subHeading = table.getGherkinRows().get(0).getCells().get(0);
        new Select(driver.findElement(By.name("id_contact"))).selectByVisibleText(subHeading);
        System.out.println(subHeading);
    }

    @Given("^I enter a valid detail$")
    public void iEnterAValidDetail(DataTable table) {
        String email = table.getGherkinRows().get(1).getCells().get(0);
        driver.findElement(By.id("email")).sendKeys(email);
        System.out.println(email);
        String orderRef = table.getGherkinRows().get(1).getCells().get(1);
        driver.findElement(By.name("id_order")).sendKeys(orderRef);
        System.out.println(orderRef);
        String message1 = table.getGherkinRows().get(1).getCells().get(2);
        System.out.println(message1);
        driver.findElement(By.id("message")).sendKeys(message1);

    }
}