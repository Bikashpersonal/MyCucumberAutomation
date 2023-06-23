package pageObjects;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class LandingPage {
	public WebDriver driver;
	public LandingPage(WebDriver driver)
	{
		this.driver=driver;
	}
	
	By txtSearchBox=By.xpath("//*[@placeholder='Search for Vegetables and Fruits']");
	//By vegName=By.xpath("//*[contains(text(),'Tomato')]");
	By vegName=By.xpath("//*[@class='product']/h4");
	By btnTopDeal=By.xpath("//*[contains(text(),'Top Deals')]");
	By plusSignToAdd=By.xpath("//*[@class='increment']");
	By btnAddToCart=By.xpath("//*[text()='ADD TO CART']");
	
	public void typeinSearhbox(String vegNames)
	{
		driver.findElement(txtSearchBox).sendKeys(vegNames);
	}
	
	public String getProductName()
	{
		return driver.findElement(vegName).getText().split(" ")[0].trim();	
	}
	
	public void clickOnTopDeals()
	{
		driver.findElement(btnTopDeal).click();
	}
	
	public void incrementQuantity(int Qnty)
	{
		while(Qnty>0)
		{
			driver.findElement(plusSignToAdd).click();
			Qnty=Qnty-1;
		}
	}
	
	public void clickAddToCart()
	{
		driver.findElement(btnAddToCart).click();
	}

}
