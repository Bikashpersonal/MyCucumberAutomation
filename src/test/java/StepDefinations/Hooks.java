package StepDefinations;

import java.io.File;
import java.io.IOException;

import io.cucumber.java.After;
import io.cucumber.java.AfterStep;
import io.cucumber.java.Scenario;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;

import utils.TestContextSetUps;

public class Hooks {
	
	public TestContextSetUps testcontextsetups;
	public Hooks(TestContextSetUps testcontextsetups)
	{
		this.testcontextsetups=testcontextsetups;
	}
	
	@After
	public void afterScenario() throws IOException
	{
		testcontextsetups.testbase.startApp().quit();
	}

	@AfterStep
	public void getScreenshot(Scenario scenario) throws IOException
	{
		WebDriver driver=testcontextsetups.testbase.startApp();
		if(scenario.isFailed())
		{
			File sourcePath=((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
			byte[] fileContent=FileUtils.readFileToByteArray(sourcePath);
			scenario.attach(fileContent, "image/png", "image");
		}
	}
}
