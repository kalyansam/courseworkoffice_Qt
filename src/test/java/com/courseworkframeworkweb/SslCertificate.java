package com.courseworkframeworkweb;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.firefox.FirefoxOptions;
import org.openqa.selenium.remote.CapabilityType;
import org.openqa.selenium.remote.DesiredCapabilities;

public class SslCertificate {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
DesiredCapabilities ch=DesiredCapabilities.firefox();
FirefoxOptions c= new FirefoxOptions();
c.merge(ch);
System.setProperty("webdriver.gecko.driver","C:\\Users\\pavan.sama\\eclipse-workspace\\courseworkframework\\driver\\geckodriver.exe");
WebDriver driver = new FirefoxDriver(c);
ch.setCapability(CapabilityType.ACCEPT_INSECURE_CERTS, true);
ch.setCapability(CapabilityType.ACCEPT_SSL_CERTS, true);
	}

}
