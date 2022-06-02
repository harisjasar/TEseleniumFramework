package com.te.TestCases;

import org.testng.annotations.*;
import com.te.automation.steps.StepsHomePage;

public class HomePageTest extends StepsHomePage {

	public HomePageTest() {
		super();
	}

	@Test
	public void VerifyEnterAndSearch() {
		StepNavigateTo();
		StepEnterText();
		StepClickSearchButton();
	}
	
	@Test
	public void VerifyEnterAndSearch1() {
		StepNavigateTo();
		StepEnterText();
		StepClickSearchButton();
	}
	
	/*
	@AfterTest
	public void tearDown() {
		driver.quit();
	}
	*/
}
