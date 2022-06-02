package com.te.automation.steps.toolsqa;

import com.te.automation.contracts.toolsqa.ITextBoxPage;
import com.te.base.Base;
import com.te.pages.toolsqa.TextBoxPage;

public class StepsTextBoxPage extends Base  implements ITextBoxPage{

	private TextBoxPage textBoxPage;

	public StepsTextBoxPage() {
		this.textBoxPage = new TextBoxPage();
	}
	
	@Override
	public void StepPopulateFullName() {
		textBoxPage.populateFullName(params.get("fullName"));
	}

	@Override
	public void StepPopulateEmail() {
		textBoxPage.populateEmail(params.get("email"));
		
	}

	@Override
	public void StepPopulateCurrentAddress() {
		textBoxPage.populateCurrentAddress(params.get("currentAddress"));
	}

	@Override
	public void StepPopulatePermanentAddress() {
		textBoxPage.populatePermanentAddress(params.get("permanentAddress"));
	}

	@Override
	public void StepClickOnSubmitButton() {
		textBoxPage.clickOnSubmitButton();
	}

	@Override
	public void StepNavigateTo() {
		textBoxPage.navigateTo(params.get("url"));
	}

	@Override
	public boolean StepVerifySuccessMessageVisible() {
		return textBoxPage.verifySuccessMessageVisible();
	}

	@Override
	public void StepPopulateForm() {
		StepPopulateFullName();
		StepPopulateEmail();
		StepPopulateCurrentAddress();
		StepPopulatePermanentAddress();
	}
}
