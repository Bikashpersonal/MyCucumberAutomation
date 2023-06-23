package PMCdev.PMCdev;

import org.testng.annotations.DataProvider;

import io.cucumber.testng.AbstractTestNGCucumberTests;
import io.cucumber.testng.CucumberOptions;

@CucumberOptions(features="src/test/java/Feature",glue="StepDefinations",monochrome=true
,tags="@Smoke or @Regression"
,plugin= {"html:target/CucumberReport.html"
		,"json:target/CucumberReport.json"
		,"com.aventstack.extentreports.cucumber.adapter.ExtentCucumberAdapter:"})
public class TestngTestRunner extends AbstractTestNGCucumberTests{
	//@Override
	//@DataProvider(parallel=true)
	//public Object[][] scenarios()
	//{
		//return super.scenarios();
	//}
	  
	

}
