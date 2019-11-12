package com.courseworkframeworkweb;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

public class datepicker {

	public static void main(String[] args)  throws Exception {
		System.setProperty("webdriver.gecko.driver","C:\\Users\\pavan.sama\\eclipse-workspace\\courseworkframework\\driver\\geckodriver.exe");
		WebDriver driver = new FirefoxDriver();
        driver.get("https://www.spicejet.com/Default.aspx");
       
        driver.findElement(By.xpath("//input[@id='ctl00_mainContent_view_date1']")).click();
       
        Thread.sleep(2000);
       
        List<WebElement>dates=driver.findElements(By.xpath("//div[@class='ui-datepicker-group ui-datepicker-group-last']//td"));
       
        int size=dates.size();
       
        for(WebElement ele:dates)
        {
            String dates_name=ele.getText();
           
            if(dates_name.equalsIgnoreCase("22"))
            {
                Thread.sleep(2000);
                ele.click();
               
                break;
            }
        }
       
        Thread.sleep(5000);
       
        driver.close();
	}

}
