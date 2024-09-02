package Utils;

import java.util.Iterator;
import java.util.Set;

import org.openqa.selenium.WebDriver;

public class GenericUtil {

	WebDriver driver;
	
	public GenericUtil(WebDriver driver) {
		// TODO Auto-generated constructor stub
		this.driver=driver;
	}
	
	
	


	public void switchWindowtoChild()
	{
		Set<String> windows =driver.getWindowHandles();
		Iterator<String> i1= windows.iterator();
		String parentwindow = i1.next();
		String childwindow = i1.next();
		driver.switchTo().window(childwindow);
	}
	
}
