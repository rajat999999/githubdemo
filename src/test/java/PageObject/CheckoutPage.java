package PageObject;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class CheckoutPage {

	WebDriver driver;
	public CheckoutPage (WebDriver driver)
	{
		this.driver = driver;
	}
	
By cart_img = By.xpath("//img[@alt='search']");
By cart_click =By.cssSelector(".cart-icon");
By Proceed_Checkout = By.xpath("//button[contains(text(),'PROCEED TO CHECKOUT')]");
//By checkOutButton =   By.xpath("//button[contains(text(),'PROCEED TO CHECKOUT')]");
By ProductName= By.cssSelector(".product-name");
By ProductQty= By.cssSelector(".quantity");
By PromoCode = By.cssSelector(".promoCode");
By PromoCodeApply = By.xpath("//button[contains(text(),'Apply')]");
By PlaceOrder = By.xpath("//button[contains(text(),'Place Order')]");


public void Click_Cart()
{
	driver.findElement(cart_click).click();
}

public void Proceed_Checkout() {
	
	driver.findElement(Proceed_Checkout).click();
}

public String get_product_name() {
String prodname=	driver.findElement(ProductName).getText().split("-")[0].trim();
System.out.println(prodname);
return prodname;
}

public String get_product_qty() {
String prodqty=	driver.findElement(ProductQty).getText();
System.out.println(prodqty);
return prodqty;
}

//public void PromoCode() {
//	driver.findElement(PromoCode).sendKeys("rahul");
//    driver.findElement(PromoCodeApply).click();
//}
//
//public void PlaceOrder() {
//	driver.findElement(PlaceOrder).click();
//
//}

public Boolean VerifyPromoCode() {
	return driver.findElement(PromoCode).isDisplayed();
    
	
}

public Boolean VerifyPlaceOrder() {
	return driver.findElement(PlaceOrder).isDisplayed();

}

}
