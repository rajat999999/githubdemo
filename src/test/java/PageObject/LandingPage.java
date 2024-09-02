package PageObject;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class LandingPage {

	WebDriver driver;
	public LandingPage (WebDriver driver)
	{
		this.driver = driver;
	}
	
	
	By searchpoduct =  By.xpath("//*[@type='search']");
	By getproductname=  By.cssSelector("h4.product-name");
	By addprod   =By.cssSelector(".increment");
	By addtocart = By.cssSelector(".product-action button");
	
//	public void landing_Page_Url()
//	{
//		driver = new ChromeDriver();// driver gets the life
//		driver.get("https://rahulshettyacademy.com/seleniumPractise/#/");
//	}
	
	public void search_product(String shortname) 
	{
		
		driver.findElement(searchpoduct).sendKeys(shortname);
	}
	
	

	public String get_productname()
	{
	 String prod_name =driver.findElement(getproductname).getText();
		return prod_name;
	}
	
	public void add_product()
	{
		for (int i=0;i<2;i++) {
		driver.findElement(addprod).click();
		}
	
		
	}
		
	public void addtocartproduct ()
	{	
		driver.findElement(addtocart).click();
	}
	
	public void quit()
	{	
		driver.quit();
	}
}
