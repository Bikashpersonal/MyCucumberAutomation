package pageObjects;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class CheckOutPage {
	
	public WebDriver driver;
	public CheckOutPage(WebDriver driver)
	{
		this.driver=driver;
	}
	
	By btnCart=By.xpath("//*[@alt='Cart']");
	By btnCheckOut=By.xpath("//*[text()='PROCEED TO CHECKOUT']");
	By btnApply=By.xpath("//*[text()='Apply']");
	By btnPlaceOrder=By.xpath("//*[text()='Place Order']");
	By productName=By.xpath("//*[@class='product-name']");
	
	
	
	public void CheckOutItems()
	{
		driver.findElement(btnCart).click();
		driver.findElement(btnCheckOut).click();
	}
	
	public boolean verifyapplybutton()
	{
		return driver.findElement(btnApply).isDisplayed();
	}
	
	public boolean verifyplaceOrderButton()
	{
		return driver.findElement(btnPlaceOrder).isDisplayed();
	}
	
	public String getProductName()
	{
		return driver.findElement(productName).getText().split(" ")[0].trim();
	}

}
