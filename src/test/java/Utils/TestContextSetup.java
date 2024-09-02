package Utils;

import java.io.IOException;

import org.openqa.selenium.WebDriver;

import PageObject.PageObjectManager;
import StepDefinitions.GreenKartLandingPage;

public class TestContextSetup {

	public WebDriver driver ;
	public String landingpage;
	public PageObjectManager pageobjectmanager;
	public TestBase testbase;
	public GenericUtil genericutil;
	
	
	public TestContextSetup() throws IOException
	{
		testbase = new TestBase();
		pageobjectmanager = new PageObjectManager(testbase.WebDriverManager());
		genericutil = new GenericUtil(testbase.WebDriverManager());
	}
	
	
}
