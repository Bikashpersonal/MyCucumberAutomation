package utils;

import java.io.IOException;

import org.openqa.selenium.WebDriver;

import pageObjects.PageObjectManager;

public class TestContextSetUps {
	
	public WebDriver driver;
	public PageObjectManager pageobjectmanager;
	public TestBase testbase;
	public CommonFunctions commonfunctions;
	public String landingPageObjectName;
	public TestContextSetUps() throws IOException
	{
		testbase=new TestBase();
		pageobjectmanager=new PageObjectManager(testbase.startApp());
		commonfunctions=new CommonFunctions(testbase.startApp());
	}

}
