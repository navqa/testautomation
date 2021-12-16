package com.testpractice;

import org.testng.annotations.Test;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.AfterSuite;

public class TestNGDemoDec13 {

	@Test(groups = { "Smoke" })
	public void testCase1() {
		System.out.println("Test Case1 Smoke");
	}

	@Test(groups = { "Smoke" })
	public void testCase2() {
		System.out.println("Test Case2 Smoke");
	}

	@Test(groups = { "Regression" })
	public void testCase3() {
		System.out.println("Test Case3 Regression");
	}

	@Test(groups = { "Regression" })
	public void testCase4() {
		System.out.println("Test Case4 Regression");
	}

	@BeforeMethod
	public void beforeMethod() {
		System.out.println("beforeMethod");
	}

	@AfterMethod
	public void afterMethod() {
		System.out.println("afterMethod");
	}

	@BeforeClass
	public void beforeClass() {
		System.out.println("beforeClass");
	}

	@AfterClass
	public void afterClass() {
		System.out.println("afterClass");
	}

	@BeforeTest
	public void beforeTest() {
		System.out.println("beforeTest");
	}

	@AfterTest
	public void afterTest() {
	}

	@BeforeSuite
	public void beforeSuite() {
	}

	@AfterSuite
	public void afterSuite() {
	}

}
