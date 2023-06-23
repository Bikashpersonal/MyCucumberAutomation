package StepDefinations;

import org.testng.Assert;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;
import pageObjects.CheckOutPage;
import utils.TestContextSetUps;

public class CheckOutPageStepDefinations {
	public TestContextSetUps testcontextsetups;
	public CheckOutPage checkoutpage;
	public String CheckOutPageObjectName;
	public CheckOutPageStepDefinations(TestContextSetUps testcontextsetups)
	{
		this.testcontextsetups=testcontextsetups;
		checkoutpage=testcontextsetups.pageobjectmanager.getCheckOutPage();
	}
	
	@And("verify user has ability to enter promo code and place the order")
	public void verify_user_has_ability_to_enter_promo_code_and_place_the_order()
	{
		Assert.assertTrue(checkoutpage.verifyplaceOrderButton());
		System.out.println("placeOrder button is verified successfully.");
		Assert.assertTrue(checkoutpage.verifyapplybutton());
		System.out.println("Apply Button is verified successfully.");
	}
	
	@Then("^user proceed to checkout and validate the (.+) items in checkout page$")
	public void user_proceed_to_checkout_and_validate_the_item_Names_in_checkout_page(String Item) throws InterruptedException
	{
		checkoutpage.CheckOutItems();
		CheckOutPageObjectName=checkoutpage.getProductName();
		System.out.println(CheckOutPageObjectName+" is Extracted Successfully.");
		Thread.sleep(2000);
		Assert.assertEquals(Item, CheckOutPageObjectName);
	}

}
