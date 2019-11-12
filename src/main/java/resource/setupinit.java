package resource;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;
import java.util.concurrent.TimeUnit;


import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;
import org.testng.annotations.Test;

public class setupinit {
public  static WebDriver driver;


	@Test
	public WebDriver mainitializeDriverin() throws IOException {
		// TODO Auto-generated method stub
		// TODO Auto-generated method stub
		Properties prop = new Properties();
		FileInputStream fs= new FileInputStream("C:\\Users\\pavan.sama\\eclipse-workspace\\courseworkframework\\src\\main\\java\\resource\\data.properties");
		prop.load(fs);
		String BrowserName =prop.getProperty("Browser");
		if(BrowserName.equalsIgnoreCase("firefox"))
		{

		System.setProperty("webdriver.gecko.driver","C:\\Users\\pavan.sama\\eclipse-workspace\\courseworkframework\\driver\\geckodriver.exe");
		 driver = new FirefoxDriver();
    
		}
		else if(BrowserName.equalsIgnoreCase("chrome"))
		{

		System.setProperty("webdriver.chrome.driver","C:\\Users\\pavan.sama\\eclipse-workspace\\courseworkframework\\driver\\chromedriver.exe");
		 driver = new ChromeDriver();
        
		}
		else 
		{

		System.setProperty("webdriver.gecko.driver","C:\\Users\\pavan.sama\\eclipse-workspace\\courseworkframework\\driver\\geckodriver.exe");
		 driver = new InternetExplorerDriver();
     
		}
	   
  driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
return driver;

		
	}

	}


