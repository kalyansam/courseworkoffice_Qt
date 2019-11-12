package com.courseworkframeworkweb;

import java.io.IOException;

import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.Test;

import resource.setupinit;



public class Actionclass extends setupinit {
	public  static WebDriver driver;
	
@Test
	public  void basepageNavigation() throws IOException, InterruptedException {
		driver=mainitializeDriverin();
		 driver.get("https://qualitestgroup.com/");
	        driver.manage().window().maximize();
	        Actions a= new Actions(driver);
       Thread.sleep(3000);
       WebElement menu=driver.findElement(By.xpath("//a[@class='mega-menu-link'][contains(text(),'Solutions')]"));
        // Actions classes for move to element for mouse 
     a.moveToElement(menu).build().perform();
 //  WebElement footer=driver.findElement(By.xpath("//div[@class='footer__main']//div[@class='footer__wrap']"));   
     Assert.assertTrue(menu.isDisplayed());
        driver.quit();
	}
}
