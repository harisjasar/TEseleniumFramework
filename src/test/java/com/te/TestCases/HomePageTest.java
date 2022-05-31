package com.te.TestCases;

import org.testng.annotations.*;
import com.te.automation.steps.StepsHomePage;

public class HomePageTest extends StepsHomePage {

	public HomePageTest() {
		super();
	}
	
	@Test
	public void VerifyEnterAndSearch() {
		StepEnterText(parameters.Get("selenium"));
		StepClickSearchButton();
	}

	@AfterTest
	public void tearDown() {
		driver.quit();
	}
}
