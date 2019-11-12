package com.courseworkframeworkweb;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class pickcalenderdate {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.gecko.driver","C:\\Users\\pavan.sama\\eclipse-workspace\\courseworkframework\\driver\\geckodriver.exe");
		WebDriver driver = new FirefoxDriver();
        driver.get("https://jqueryui.com/datepicker/");
        driver.manage().window().maximize();
        Thread.sleep(15000);
        driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
        
        driver.findElement(By.xpath("//*[contains(@class,'hasDatepicker')]")).click();
        
       // driver.findElement(By.cssSelector("#datepicker")).click();
        
      int count=  driver.findElements(By.cssSelector("[class='ui-state-default']")).size();
      for(int i=0;i<count;i++) {
    	String text=  driver.findElements(By.cssSelector("[class='ui-state-default']")).get(i).getText();
    	  
    	  if (text.equalsIgnoreCase("10")) {
    		  driver.findElements(By.cssSelector("[class='ui-state-default']")).get(i).click();
    	  }
    	  
      }

	}

}
