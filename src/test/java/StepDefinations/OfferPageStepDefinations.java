package StepDefinations;

import static org.testng.Assert.assertEquals;

import org.openqa.selenium.WebDriver;
import org.testng.Assert;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;
import pageObjects.OfferPage;
import utils.TestContextSetUps;

public class OfferPageStepDefinations {
	public WebDriver driver;
	public TestContextSetUps testcontextsetups;
	public OfferPage offerpage;
	public String offerPageProductName;
	public OfferPageStepDefinations(TestContextSetUps testcontextsetups)
	{
		this.testcontextsetups=testcontextsetups;
	}
	
	@Then("^user search for (.+) in offer page$")
	public void user_search_for_item_in_offer_page(String string) throws InterruptedException
	{
		offerpage=testcontextsetups.pageobjectmanager.getOfferPage();
		offerpage.typeInSearchBox(string);
		offerPageProductName=offerpage.getProductName();
		
		
	}
	@And("^Validate product name in offer page matches with the product name in landing page$")
	public void Validate_product_name_in_offer_page_matches_with_the_product_name_in_landing_page()
	{
		String x="Bikash";
		Assert.assertEquals(testcontextsetups.landingPageObjectName, offerPageProductName);
		System.out.println("Execution is done now");
	}
	

}
