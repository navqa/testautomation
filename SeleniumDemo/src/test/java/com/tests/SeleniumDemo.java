package com.tests;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

public class SeleniumDemo {
	WebDriver driver = null;
	
	@BeforeClass
	  public void beforeClass() {
		System.setProperty("webdriver.chrome.driver", "./src/test/resources/chromedriver.exe");
		  driver =  new ChromeDriver();
		  driver.manage().window().maximize();
		  System.out.println("BeforeClass executed now");
	  }
 
  @Test
  public void verifyMyApp() {
	  try {
		
		  driver.get("https://www.speaklanguages.com/english/");
		  Thread.sleep(2000);
		  
	} catch (InterruptedException e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
	}
  }
  
  @AfterClass
  public void afterClass() {
	  driver.close();
	  driver.quit();
	  System.out.println("AfterClass executed now");
  }
  
  @Test (enabled  = false)
  public void verifyLogin() {
	  try {
		System.setProperty("webdriver.chrome.driver", "./src/test/resources/chromedriver.exe");
		  WebDriver driver =  new ChromeDriver();
		  
//		  System.setProperty("webdriver.gecko.driver", "./src/test/resources/geckodriver.exe");
//			 WebDriver driver =  new FirefoxDriver();
//			 
		  driver.manage().window().maximize();
		  driver.get("https://www.speaklanguages.com/english/");
		  Thread.sleep(4000);
		  driver.findElement(By.xpath("//li[@id='nav_login']")).click();
		  Thread.sleep(1000);
		  driver.findElement(By.id("email_input")).sendKeys("rao.navi91@gmail.com");
		  Thread.sleep(1000);
		  driver.findElement(By.id("password_input")).sendKeys("Babyshark91");
		  Thread.sleep(1000);
		  driver.findElement(By.id("login_button")).click();
		  Thread.sleep(5000);
		  driver.close();
		  driver.quit();
	} catch (InterruptedException e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
	}
  }
}
