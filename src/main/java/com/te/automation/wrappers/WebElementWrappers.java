package com.te.automation.wrappers;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import com.te.base.Base;

public class WebElementWrappers extends Base {

	/**
	 * SendKeysWrapper - Wraps the sendkeys() Selenium method to include additional checks and logs
	 * @param element
	 * @param elementName
	 * @param value
	 */
	public void SendKeysWrapper(WebElement element, String elementName, String value) {
		if(value.equals("#skip#")) {
			return;
		}
		
		element.sendKeys(value);
		SendKeysWrapperMessage(elementName, value);
	}
	
	/**
	 * ClickWrapper - Wraps the click() Selenium method to include additional checks and logs
	 * @param element
	 * @param elementName
	 */
	public void ClickWrapper(WebElement element, String elementName) {
		element.click();
		ClickWrapperMessage(elementName);
	}
	
	/**
	 * NavigateToWrapper - Wraps driver.get() Selenium method to include additional checks and logs
	 * @param driver
	 * @param url
	 */
	public void NavigateToWrapper(WebDriver driver, String url) {
		driver.get(url);
		NavigateToWrapperMessage(url);
	}
	
	private void SendKeysWrapperMessage(String elementName, String value) {
		System.out.println("-----------------------------------");
		System.out.println("Element Name: " + elementName + " - Entered Value: " + value);
		System.out.println("-----------------------------------");
	}
	
	private void ClickWrapperMessage(String elementName) {
		System.out.println("-----------------------------------");
		System.out.println("Element Name: " + elementName + " - Clicked");
		System.out.println("-----------------------------------");
	}

	private void NavigateToWrapperMessage(String url) {
		System.out.println("-----------------------------------");
		System.out.println("Navigated to: " + url);
		System.out.println("-----------------------------------");
	}
}
