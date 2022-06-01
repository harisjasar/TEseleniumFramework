package com.te.automation.steps.toolsqa;

import java.io.IOException;
import java.util.HashMap;
import javax.xml.parsers.ParserConfigurationException;
import org.xml.sax.SAXException;
import com.te.automation.contracts.toolsqa.ITextBoxPage;
import com.te.automation.parsers.ParameterXmlParser;
import com.te.base.Base;
import com.te.pages.toolsqa.TextBoxPage;

public class StepsTextBoxPage extends Base  implements ITextBoxPage{

	private TextBoxPage textBoxPage;
	private final String _filePath = "src/main/resources/parameters.xml";
	protected ParameterXmlParser _parameterXmlParser;
	protected HashMap<String, String> params;
	
	public StepsTextBoxPage() throws ParserConfigurationException, SAXException, IOException {
		initialization();
		this.textBoxPage = new TextBoxPage();
		_parameterXmlParser = new ParameterXmlParser(this._filePath);
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
	public void StepVerifySuccessMessageVisible() {
		textBoxPage.verifySuccessMessageVisible();
	}

	@Override
	public void StepPopulateForm() {
		StepPopulateFullName();
		StepPopulateEmail();
		StepPopulateCurrentAddress();
		StepPopulatePermanentAddress();
	}
}
