package StepDefinitions;

import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;

import PageObject.LandingPage;
import PageObject.PageObjectManager;
import Utils.TestBase;
import Utils.TestContextSetup;

import static org.testng.Assert.assertEquals;

import java.io.IOException;
import java.util.Iterator;
import java.util.Set;

import org.openqa.selenium.*;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class GreenKartLandingPage {
	
	
	 TestContextSetup testcontextsetup ;
	 PageObjectManager pageobjectmamager;
	  TestBase testbase;
	  LandingPage landingpage;
	 
	public GreenKartLandingPage ( TestContextSetup testcontextsetup)
	{
		this.testcontextsetup = testcontextsetup;
		
	}
	
	 
	@Given("User is on Home page")
	public void user_is_on_home_page() throws InterruptedException, IOException {
//		System.setProperty("webdriver.chrome.driver", "D:/chromedriver.exe");
//	testcontextsetup.driver = new ChromeDriver();// driver gets the life
//		testcontextsetup.driver.get("https://rahulshettyacademy.com/seleniumPractise/#/");
		
		testcontextsetup.testbase.WebDriverManager();
		landingpage = testcontextsetup.pageobjectmanager.getlandingpage();
	}
	
	
	@When("User serched with shortname {string} and extracted name")
	public void user_serched_with_shortname_and_extracted_name(String shortname) throws InterruptedException  {
	    // Write code here that turns the phrase above into concrete actions
		//LandingPage land = new LandingPage(testcontextsetup.driver);

		landingpage.search_product(shortname);
		Thread.sleep(1000);
		testcontextsetup.landingpage=landingpage.get_productname().split("-")[0].trim();
		
	   System.out.println(testcontextsetup.landingpage);
	}
	
	@When("User add the same prodcut on landing page {string} times")
	public void user_add_the_same_prodcut_on_landing_page_times(String qty) throws InterruptedException {
	    // Write code here that turns the phrase above into concrete actions
	    
	landingpage.add_product();
	landingpage.addtocartproduct();	
	
	Thread.sleep(1000);
	}
	
//	@Then("Close Browser")
//	public void close_browser() {
//	    // Write code here that turns the phrase above into concrete actions
//	  landingpage.quit();
//	}
	
}
