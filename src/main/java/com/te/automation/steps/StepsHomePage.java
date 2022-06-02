package com.te.automation.steps;

import com.te.automation.contracts.IHomePage;
import com.te.base.Base;
import com.te.pages.HomePage;

public class StepsHomePage extends Base  implements IHomePage{

	private HomePage homePage;
	
	public StepsHomePage() {
		this.homePage = new HomePage();
	}
	
	@Override
	public void StepEnterText() {
		homePage.populateSearchTextBox(params.get("firstName"));
	}

	@Override
	public void StepClickSearchButton() {
		homePage.clickOnSearchButton();
	}

	@Override
	public void StepNavigateTo() {
		homePage.navigateTo(params.get("url"));
	}

}
