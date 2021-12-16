package com.testpractice;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.Test;

public class SeleniumPracticeDec11 {
	
	 WebDriver driver = null;
  
@Test (priority =  2)
  public void VerifyFacebookPageChrome() {
	 try {
		 System.setProperty("webdriver.chrome.driver", "./src/test/resources/chromedriver.exe");
		 driver =  new ChromeDriver();
		 driver.manage().window().maximize();
		 driver.get("https://www.facebook.com/");
		 Thread.sleep(7000);
		 driver.close();
		 driver.quit();
	} catch (InterruptedException e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
	}
  }
@Test (priority =  1)
public void VerifyFacebookPageFireFox() {
	 try {
		 System.setProperty("webdriver.gecko.driver", "./src/test/resources/geckodriver.exe");
		 driver =  new FirefoxDriver();
		 driver.manage().window().maximize();
		 driver.get("https://www.facebook.com/");
		 Thread.sleep(7000);
		 driver.close();
		 //driver.quit();
	} catch (InterruptedException e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
	}
}
}


