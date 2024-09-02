package PageObject;

import org.openqa.selenium.WebDriver;

public class PageObjectManager {
	public LandingPage landingpage;
	public OfferPage offerpage;
	public WebDriver driver;
	public CheckoutPage checkout;
	
	public PageObjectManager (WebDriver driver){
		this.driver=driver;
	}
	
	public LandingPage getlandingpage ()
	{
		 landingpage= new LandingPage(driver);
		 return landingpage;
	}
	
	public OfferPage getofferpage ()
	{
		offerpage= new OfferPage(driver);
		 return offerpage;
	}
	
	public CheckoutPage getcheckout ()
	{
		checkout= new CheckoutPage(driver);
		 return checkout;
	}
	
}
