package com.te.automation.steps;

import java.io.IOException;
import java.util.HashMap;

import javax.xml.parsers.ParserConfigurationException;

import org.xml.sax.SAXException;

import com.te.automation.contracts.IHomePage;
import com.te.automation.parsers.ParameterXmlParser;
import com.te.base.Base;
import com.te.pages.HomePage;

public class StepsHomePage extends Base  implements IHomePage{

	private HomePage homePage;
	private final String _filePath = "src/main/resources/parameters.xml";
	protected ParameterXmlParser _parameterXmlParser;
	protected HashMap<String, String> params;
	
	public StepsHomePage() throws ParserConfigurationException, SAXException, IOException {
		initialization();
		this.homePage = new HomePage();
		_parameterXmlParser = new ParameterXmlParser(this._filePath);
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
