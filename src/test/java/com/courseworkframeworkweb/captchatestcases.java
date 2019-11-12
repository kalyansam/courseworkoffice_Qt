package com.courseworkframeworkweb;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.Test;

public class captchatestcases {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.gecko.driver","C:\\Users\\pavan.sama\\eclipse-workspace\\courseworkframework\\driver\\geckodriver.exe");
		WebDriver driver = new FirefoxDriver();
        driver.get("https://www.google.com/recaptcha/api2/demo");
        driver.manage().window().maximize();
      int framesize = driver.findElements(By.tagName("iframe")).size();
      
      for (int i =0;i<framesize;i++) {
    	  driver.switchTo().frame(i)  ;
    	  
    	  int innerframecount=driver.findElements(By.xpath("//div[@class='recaptcha-checkbox-border']")).size();
    	  if(innerframecount>0) {
    		  driver.findElement(By.xpath("//div[@class='recaptcha-checkbox-border']")).click();
    	  }
    	  else {
    		  System.out.println("continue loop");
    	  }
    	  driver.switchTo().defaultContent();
      }
       
       // driver.findElement(By.xpath("//div[@class='recaptcha-checkbox-checkmark']")).click();

	}
	

}
