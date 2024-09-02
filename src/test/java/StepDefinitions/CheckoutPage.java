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

public class CheckoutPage {
	
	
	 TestContextSetup testcontextsetup ;
	 PageObjectManager pageobjectmamager;
	  TestBase testbase;
	  PageObject.CheckoutPage checkout;
	 
	public CheckoutPage ( TestContextSetup testcontextsetup)
	{
		checkout = testcontextsetup.pageobjectmanager.getcheckout(); 
		this.testcontextsetup = testcontextsetup;
		
	}
	
	
	
	
	@When("User the checkout the product")
	public void user_the_checkout_the_product() throws InterruptedException {
	    // Write code here that turns the phrase above into concrete actions
	   
		checkout.Click_Cart();
		Thread.sleep(7000);
		checkout.Proceed_Checkout();
	}
	
	
	@When("Validate the productname in checkoutpage matches with Landing page product {string}")
	public void validate_the_productname_in_checkoutpage_matches_with_landing_page_product(String Prod) {
	    // Write code here that turns the phrase above into concrete actions
		
		checkout.get_product_name().equalsIgnoreCase(Prod);
	   
	}
	
	@When("Validate the productqty in checkoutpage matches with {string}")
	public void validate_the_productname_in_checkoutpage_matches_with_landing_page(String qty) {
	    // Write code here that turns the phrase above into concrete actions
		
		checkout.get_product_qty().equalsIgnoreCase(qty);
	   
	}
	
	@When("Validate Enter Promo code accessbility and Palce the order")
	public void validate_enter_promo_code_accessbility_and_palce_the_order() {
	    // Write code here that turns the phrase above into concrete actions
	   checkout.VerifyPromoCode();
	   checkout.VerifyPromoCode();
	   
	   Assert.assertTrue(checkout.VerifyPromoCode());
	   Assert.assertTrue(checkout.VerifyPlaceOrder());
	}}
	
	
	
