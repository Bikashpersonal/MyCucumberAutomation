package utils;

import java.util.Iterator;
import java.util.Set;

import org.openqa.selenium.WebDriver;

public class CommonFunctions {
	
	public WebDriver driver;
	
	public CommonFunctions(WebDriver driver)
	{
		this.driver=driver;
	}
	
	public void navigateToChildTab()
	{
		Set<String> windows=driver.getWindowHandles();
		Iterator<String> i=windows.iterator();
		String parentTab=i.next();
		String childTab=i.next();
		driver.switchTo().window(childTab);
	}
	
	public void navigateToParentTab()
	{
		Set<String> windows=driver.getWindowHandles();
		Iterator<String> i=windows.iterator();
		String parentTab=i.next();
		String childTab=i.next();
		driver.switchTo().window(parentTab);
	}
	
	
	

}
