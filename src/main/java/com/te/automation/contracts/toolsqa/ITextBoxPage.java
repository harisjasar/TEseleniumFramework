package com.te.automation.contracts.toolsqa;

public interface ITextBoxPage {
	void StepPopulateFullName();
	void StepPopulateEmail();
	void StepPopulateCurrentAddress();
	void StepPopulatePermanentAddress();
	void StepClickOnSubmitButton();
	void StepNavigateTo();
	boolean StepVerifySuccessMessageVisible();
	void StepPopulateForm();
}