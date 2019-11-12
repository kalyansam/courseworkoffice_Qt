package com.courseworkframeworkweb;

import java.util.Iterator;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

public class linkscount {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.gecko.driver","C:\\Users\\pavan.sama\\eclipse-workspace\\courseworkframework\\driver\\geckodriver.exe");
		WebDriver driver = new FirefoxDriver();
        driver.get("https://qualitestgroup.com/");
        driver.manage().window().maximize();
       System.out.println(driver.findElements(By.tagName("a")).size());
       WebElement footer=driver.findElement(By.xpath("//div[@class='footer__main']//div[@class='footer__wrap']"));
       System.out.println(footer.findElements(By.tagName("a")).size());
       WebElement column=driver.findElement(By.xpath("//div[@class='menu-footer-solutions-container']"));
       int csize=column.findElements(By.tagName("a")).size();
       System.out.println("column size is:"+csize);
       for  (int i=0;i<csize;i++)
       {
    	   String clicktab= Keys.chord(Keys.CONTROL,Keys.ENTER);
    	   column.findElements(By.tagName("a")).get(i).sendKeys(clicktab);
    	   //Thread.sleep(15000);
       }
       
       Set <String>ids=driver.getWindowHandles();
       Iterator <String> it= ids.iterator();
       while(it.hasNext())
       {
    	   driver.switchTo().window(it.next());
    	   
    	   System.out.println(driver.getTitle());
    	   
       }
       
	}

}
