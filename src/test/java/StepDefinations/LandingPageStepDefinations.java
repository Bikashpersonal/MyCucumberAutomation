package StepDefinations;

import org.openqa.selenium.WebDriver;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.When;
import pageObjects.LandingPage;
import pageObjects.PageObjectManager;
import utils.TestContextSetUps;

public class LandingPageStepDefinations {
	public WebDriver driver;
	public LandingPage landingpage;
	public String landingPageObjectName;
	public TestContextSetUps testcontextsetups;
	public LandingPageStepDefinations(TestContextSetUps testcontextsetups)
	{
		this.testcontextsetups=testcontextsetups;
		landingpage=testcontextsetups.pageobjectmanager.getLandingPage();
	}
	
	
	@Given("^User is on greenkart landing page$")
	public void User_is_on_greenkart_landing_page()
	{
		//LandingPage landingpage=testcontextsetups.pageobjectmanager.getLandingPage();
		
	}
	@When("^user searched with short name (.+) and extracted actual name of product$")
	public void user_searched_with_short_name_and_extracted_actual_name_of_product(String string) throws InterruptedException
	{
		//landingpage=testcontextsetups.pageobjectmanager.getLandingPage();
		landingpage.typeinSearhbox(string);
		testcontextsetups.landingPageObjectName=landingpage.getProductName();
		System.out.println(testcontextsetups.landingPageObjectName+" is extracted successfully.");
		landingpage.clickOnTopDeals();
		testcontextsetups.commonfunctions.navigateToChildTab();
		Thread.sleep(2000);
	}
	
	@And("added {string} items of the selected product to cart")
	public void added_items_of_the_selected_product_to_cart(String Quantity) throws InterruptedException
	{
		testcontextsetups.commonfunctions.navigateToParentTab();
		Thread.sleep(2000);
		landingpage.incrementQuantity(Integer.parseInt(Quantity));
		landingpage.clickAddToCart();
	}

}
