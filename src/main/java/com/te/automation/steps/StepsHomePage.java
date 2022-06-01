package com.te.automation.steps;

import com.te.automation.contracts.IHomePage;

import com.te.base.Base;
import com.te.pages.HomePage;

public class StepsHomePage extends Base  implements IHomePage{

	private HomePage homePage;
	
	public StepsHomePage() {
		initialization();
		this.homePage = new HomePage();
	}
	
	@Override
	public void StepEnterText(String value) {
		homePage.populateSearchTextBox(value);
	}

	@Override
	public void StepClickSearchButton() {
		homePage.clickOnSearchButton();
	}

}
