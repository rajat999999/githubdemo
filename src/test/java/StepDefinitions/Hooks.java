package StepDefinitions;

import java.io.File;
import java.io.IOException;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.testng.annotations.TestInstance;

import Utils.TestContextSetup;
import io.cucumber.java.After;
import io.cucumber.java.AfterAll;
import io.cucumber.java.AfterStep;
import io.cucumber.java.Scenario;

public class Hooks {

	TestContextSetup testContextSetup;
	
	public Hooks(TestContextSetup testcontextsetup) {
		this.testContextSetup=testcontextsetup;
	}
	
	
	@After
	public  void AfterScenario() throws IOException
	{
		
		testContextSetup.testbase.WebDriverManager().quit();
		
	}
	
	@AfterStep
	public void Fail_Scenario(Scenario scenario) throws IOException {
		
	WebDriver	driver=testContextSetup.testbase.WebDriverManager();
//	if(scenario.isFailed()) {
	File file =((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
	
	byte[] bytedata = FileUtils.readFileToByteArray(file);
	scenario.attach(bytedata, "image/png", "image");
	//}
	}
	
}
