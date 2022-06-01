package com.te.toolsqa;

import java.io.IOException;
import java.lang.reflect.Method;
import javax.xml.parsers.ParserConfigurationException;
import org.testng.annotations.*;
import org.xml.sax.SAXException;
import com.te.automation.steps.toolsqa.StepsTextBoxPage;

public class TextBoxPageTest extends StepsTextBoxPage {


	
	public TextBoxPageTest() throws ParserConfigurationException, SAXException, IOException {
		super();
	}


	@BeforeMethod
	public void RetrieveParameters(Method method) {
		System.out.println("Test Name: " + method.getName());
	    params = _parameterXmlParser.GetParameters(method.getName());
	}
	
	@Test
	public void VerifyAbleToPopulateTextBoxes() {
		StepNavigateTo();
		StepPopulateFullName();
		StepPopulateEmail();
		StepPopulateCurrentAddress();
		StepPopulatePermanentAddress();
		StepClickOnSubmitButton();
		StepVerifySuccessMessageVisible();
	}
	
	@Test
	public void VerifyAbleToPopulateFormWithAllParameters() {
		StepNavigateTo();
		StepPopulateForm();
		StepClickOnSubmitButton();
		StepVerifySuccessMessageVisible();
	}
	
	@Test
	public void VerifyAbleToPopulateFormWithSkipParameters() {
		StepNavigateTo();
		StepPopulateForm();
		StepClickOnSubmitButton();
		StepVerifySuccessMessageVisible();
	}
	
	
	@AfterTest
	public void tearDown() {
		driver.quit();
	}
}
