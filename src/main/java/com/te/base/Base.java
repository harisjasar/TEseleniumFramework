package com.te.base;

import java.io.IOException;
import java.lang.reflect.Method;
import java.time.Duration;
import java.util.HashMap;

import javax.xml.parsers.ParserConfigurationException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.remote.RemoteWebDriver;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.BeforeMethod;
import org.xml.sax.SAXException;

import com.te.automation.parsers.ParameterXmlParser;

public class Base {
	public static WebDriver driver;
	protected static ParameterXmlParser _parameterXmlParser;
	protected static HashMap<String, String> params;
	private final static String _filePath = "src/main/resources/parameters.xml";

	public static void initialization() {
		if(driver != null) {
			if(((RemoteWebDriver) driver).getSessionId() != null) {
				return;
			}
		}
		
		System.setProperty("webdriver.chrome.driver", "C:/chromedriver.exe");
		
		driver = new ChromeDriver();
		
		driver.manage().window().maximize();
		driver.manage().deleteAllCookies();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(2));
		
		try {
			_parameterXmlParser = new ParameterXmlParser(_filePath);
		} catch (ParserConfigurationException e) {
			e.printStackTrace();
		} catch (SAXException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		}
	}
	
	@BeforeMethod 
	public void RetrieveParameters(Method method) {
		System.out.println("Test Name: " + method.getName());
	    params = _parameterXmlParser.GetParameters(method.getName());
	}
	
	@AfterSuite
	public void tearDown() {
		driver.quit();
	}
}