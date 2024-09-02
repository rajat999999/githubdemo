package Utils;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.cucumber.core.internal.com.fasterxml.jackson.databind.annotation.JsonAppend.Prop;
import io.cucumber.messages.types.Duration;

public class TestBase {

	WebDriver driver;
	
		
	public  WebDriver WebDriverManager() throws IOException
{
		
		FileInputStream fis = new FileInputStream(System.getProperty("user.dir")+"//src//test//resources//global.properties");
		Properties prop = new Properties();
		prop.load(fis);
	String url=	prop.getProperty("url");
	String browser = prop.getProperty("browser");
		if(driver==null)  {
		
			if (browser.equalsIgnoreCase("chrome")) {
		System.setProperty("webdriver.chrome.driver","D:\\chromedriver.exe");
		driver = new ChromeDriver();
			}
			else if (browser.equalsIgnoreCase("firefox"))
			{
				//firefox code
			}
			driver.get(url);
			driver.manage().timeouts().implicitlyWait(java.time.Duration.ofMillis(5000));
}
           return driver;
}
}
