package com.te.automation.steps;

import com.te.automation.Parameters;
import com.te.automation.contracts.IHomePage;
import com.te.base.Base;
import com.te.pages.HomePage;

public class StepsHomePage extends Base  implements IHomePage{

	private HomePage homePage;
	protected Parameters parameters;
	
	public StepsHomePage() {
		initialization();
		this.homePage = new HomePage();
		parameters = new Parameters();
		parameters.Insert("selenium", "selenium  again  again");
		parameters.Insert("selenium1", "selenium  again  not again");
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
