package com.te.toolsqa;

import org.testng.Assert;
import org.testng.annotations.*;
import com.te.automation.steps.toolsqa.StepsTextBoxPage;

public class TextBoxPageTest extends StepsTextBoxPage {


	
	public TextBoxPageTest() {
		super();
	}

	@Test
	public void VerifyAbleToPopulateTextBoxes() {
		StepNavigateTo();
		StepPopulateFullName();
		StepPopulateEmail();
		StepPopulateCurrentAddress();
		StepPopulatePermanentAddress();
		StepClickOnSubmitButton();
		Assert.assertTrue(StepVerifySuccessMessageVisible(), "Success Message is not visible");
	}
	
	@Test
	public void VerifyAbleToPopulateFormWithAllParameters() {
		StepNavigateTo();
		StepPopulateForm();
		StepClickOnSubmitButton();
		Assert.assertTrue(StepVerifySuccessMessageVisible(), "Success Message is not visible");
	}
	
	@Test
	public void VerifyAbleToPopulateFormWithSkipParameters() {
		StepNavigateTo();
		StepPopulateForm();
		StepClickOnSubmitButton();
		Assert.assertTrue(StepVerifySuccessMessageVisible(), "Success Message is not visible");
	}
}
