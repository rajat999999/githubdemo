package StepDefinitions;

import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;

import PageObject.OfferPage;
import PageObject.PageObjectManager;
import Utils.GenericUtil;
import Utils.TestContextSetup;

import static org.testng.Assert.assertEquals;

import java.io.IOException;
import java.util.Iterator;
import java.util.Set;

import org.openqa.selenium.*;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class GreenKartOfferPage {
	
	String offerpage;
	 TestContextSetup testcontextsetup ;
	 PageObjectManager pageobjectmamager;
	
	public GreenKartOfferPage ( TestContextSetup testcontextsetup)
	{
		this.testcontextsetup = testcontextsetup;
	}
	
	

	
	@Then("User searched the same prodcut {string} in Offer page")
	public void user_searched_the_same_prodcut_in_offer_page(String shortname) throws InterruptedException {
	    // Write code here that turns the phrase above into concrete actions
//		textcontextsetup.driver.findElement(By.linkText("Top Deals")).click();
		
		OfferPage offer = testcontextsetup.pageobjectmanager.getofferpage();
		offer.Top_Deal_Page();
		
		//windowhandles();
		GenericUtil genericutil = testcontextsetup.genericutil;
		genericutil.switchWindowtoChild();
		Thread.sleep(5000);
		offer.search_product(shortname);
		 offerpage =offer.get_productname();
		
		System.out.println(offerpage);
	}
		@Then("Validate the productname in offer page matches with Landing page productname")
		public void validate_the_productname_in_offer_page_matches_with_landing_page_productname() throws InterruptedException, IOException {
		    // Write code here that turns the phrase above into concrete actions
		  
			Assert.assertEquals(offerpage,testcontextsetup.landingpage);
			System.out.println("Hi");
			Thread.sleep(1000);
			//testcontextsetup.testbase.WebDriverManager().quit();
	    
	}

	
//		public void windowhandles()
//		{
//			Set<String> windows =testcontextsetup.driver.getWindowHandles();
//			Iterator<String> i1= windows.iterator();
//			String parentwindow = i1.next();
//			String childwindow = i1.next();
//			testcontextsetup.driver.switchTo().window(childwindow);
//		}
		
}
