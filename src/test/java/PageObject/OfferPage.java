package PageObject;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class OfferPage {

	WebDriver driver;
	public OfferPage (WebDriver driver)
	{
		this.driver = driver;
	}
	
	
	
	By Topdealsearch =  By.linkText("Top Deals");
	By searchbox= By.id("search-field");
	By getproductname=By.cssSelector("tr td:nth-child(1)");
	
	
	
//	public void landing_Page_Url()
//	{
//		landingPageUrl;
//	}
	

			public void Top_Deal_Page() 
			{
				
		//driver.findElement(Topdealsearch).click();
		
		driver.findElement(By.linkText("Top Deals")).click();
			}
			
	public void search_product(String shortname) 
	{
		
		driver.findElement(searchbox).sendKeys(shortname);
	}
	
	

	public String get_productname()
	{
		String prod_name =driver.findElement(getproductname).getText();
		return prod_name;
	}
	
			
}
