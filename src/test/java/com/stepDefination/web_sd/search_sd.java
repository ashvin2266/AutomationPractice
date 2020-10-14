package com.stepDefination.web_sd;

import com.stepDefination.pages.SearchPage;
import com.stepDefination.utility.DriverClass;
import cucumber.api.PendingException;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import org.junit.Assert;
import org.openqa.selenium.By;

public class search_sd extends DriverClass {
    public SearchPage sp;
    @When("^I click search button on home page$")
    public void iClickSearchButtonOnHomePage() {
        sp=new SearchPage(driver);
        sp.setSearch();
    }
    @Then("^I  should see the search page url as \"([^\"]*)\"$")
    public void iShouldSeeTheSearchPageUrlAs(String searchUrl)  {
        sp.SearchPageUrl(searchUrl);   }

    @Given("^I search Item  as \"([^\"]*)\"$")
    public void iSearchItemAs(String items)  {
        sp.SearchItem(items);   }

    @When("^I click search button$")
    public void iClickSearchButton() {
        sp.ClickSearchButton();
    }
    @Then("^I should see search page heading is \"([^\"]*)\"$")
    public void i_should_see_search_page_heading_is_something(String heading) throws InterruptedException {
        Thread.sleep(5000);

        String actualHeading = driver.findElement(By.xpath("//div[@class='content-wrap']")).getText();
        Assert.assertEquals(heading, actualHeading);
    }
    @Then("^I should see the page title as \"([^\"]*)\"$")
    public void iShouldSeeThePageTitleAs(String pageTitle) {
        boolean actualTitle= driver.getPageSource().contains(pageTitle);
        Assert.assertEquals(pageTitle,actualTitle);
    }

}
