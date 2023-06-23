package pageObjects;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class OfferPage {

	public WebDriver driver;
	public OfferPage(WebDriver driver)
	{
		this.driver=driver;
	}
	
	By txtSearch=By.xpath("//*[@id='search-field']");
	//By itemName=By.xpath("//*[text()='Tomato']");
	By itemName=By.xpath("//*[@class='table table-bordered']/tbody/tr/td[1]");
	
	public void typeInSearchBox(String veg)
	{
		driver.findElement(txtSearch).sendKeys(veg);
	}
	
	public String getProductName()
	{
		String x=driver.findElement(itemName).getText();
		return x;
	}
	
}
