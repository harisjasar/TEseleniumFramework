package com.te.TestCases;

import java.io.IOException;
import java.lang.reflect.Method;
import javax.xml.parsers.ParserConfigurationException;
import org.testng.annotations.*;
import org.xml.sax.SAXException;
import com.te.automation.steps.StepsHomePage;

public class HomePageTest extends StepsHomePage {


	
	public HomePageTest() throws ParserConfigurationException, SAXException, IOException {
		super();
	}


	@BeforeMethod
	public void RetrieveParameters(Method method) {
		System.out.println("Test Name: " + method.getName());
	    params = _parameterXmlParser.GetParameters(method.getName());
	}
	
	@Test
	public void VerifyEnterAndSearch() {
		StepNavigateTo();
		StepEnterText();
		StepClickSearchButton();
	}
	
	@Test
	public void VerifyEnterAndSearch1() {
		StepNavigateTo();
		StepEnterText();
		StepClickSearchButton();
	}

	@AfterTest
	public void tearDown() {
		driver.quit();
	}
}
