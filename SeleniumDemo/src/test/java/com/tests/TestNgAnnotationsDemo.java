package com.tests;

import org.testng.annotations.Test;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.AfterSuite;

public class TestNgAnnotationsDemo {
  @Test
  public void myTestCase() {
	  System.out.println("My Testcase passed");
  }
  @BeforeMethod
  public void beforeMethod() {
	 System.out.println("BeforeMethod executed now");
  }

  @AfterMethod
  public void afterMethod() {
	  System.out.println("AfterMethod executed now");
  }

  @BeforeClass
  public void beforeClass() {
	  System.out.println("BeforeClass executed now");
  }

  @AfterClass
  public void afterClass() {
	  System.out.println("AfterClass executed now");
  }

  @BeforeTest
  public void beforeTest() {
	  System.out.println("BeforeTest executed now");
  }

  @AfterTest
  public void afterTest() {
	  System.out.println("AfterTest executed now");
  }

  @BeforeSuite
  public void beforeSuite() {
	  System.out.println("BeforeSuite executed now");
  }

  @AfterSuite
  public void afterSuite() {
	  System.out.println("AfterSuite executed now");
  }

}
