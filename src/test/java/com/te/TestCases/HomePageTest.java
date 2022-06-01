package com.te.TestCases;

import java.io.IOException;
import java.util.HashMap;

import javax.xml.parsers.ParserConfigurationException;

import org.testng.annotations.*;
import org.xml.sax.SAXException;

import com.te.automation.parsers.ParameterXmlParser;
import com.te.automation.steps.StepsHomePage;

public class HomePageTest extends StepsHomePage {

	private final String _filePath = "src/main/resources/smoke.xml";
	private ParameterXmlParser _parameterXmlParser;
	
	public HomePageTest() throws ParserConfigurationException, SAXException, IOException {
		super();
		_parameterXmlParser = new ParameterXmlParser(this._filePath);
	}
	
	@Test
	public void VerifyEnterAndSearch() {
		HashMap<String, String> params = _parameterXmlParser.GetParameters("TC_0123456_VerifySignUpForm");
		StepEnterText(params.get("firstName"));
		StepClickSearchButton();
	}

	@AfterTest
	public void tearDown() {
		driver.quit();
	}
}
