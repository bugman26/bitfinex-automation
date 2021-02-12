package stepdefinitions;

import org.junit.Assert;

import base.BaseDriver;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

import pages.Common;
import pages.LandingPage;
import utils.ConfigReader;

public class SearchSteps {
	
	private LandingPage landingPage = new LandingPage(BaseDriver.getDriver());
	private Common common = new Common(BaseDriver.getDriver());
	
	@Given("User is on the Bitfinex Landing page")
	public void user_is_on_the_bitfinex_landing_page() throws InterruptedException {
		BaseDriver.getDriver().get(ConfigReader.getProp().getProperty("bitfinex.url"));
		 Thread.sleep(1000);
	}

	@When("User clicks the search icon")
	public void user_clicks_the_search_icon() throws InterruptedException {
	    landingPage.clickSearchIcon();
	    Thread.sleep(1000);
	}
	@When("User enters {string} on the search field")
	public void user_enters_on_the_search_field(String searchText) throws InterruptedException {
		landingPage.enterSearchText(searchText);
		Thread.sleep(1000);
	}
	@When("User clicks the searh result")
	public void user_clicks_the_searh_result() throws InterruptedException {
	    landingPage.clickResult(1);
	    Thread.sleep(5000);
	}
	@Then("User is redirected to {string}")
	public void user_is_redirected_to(String expectedTitle) {
	    String actualTitle = common.getCurrentUrl();
	    System.out.println("Actual Title: " + actualTitle + "==" + "Expected Title: " + expectedTitle);
	    Assert.assertEquals(expectedTitle, actualTitle);
	    		
	}


}
