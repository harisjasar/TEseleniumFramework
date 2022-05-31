package com.te.automation.wrappers;
import org.openqa.selenium.WebElement;

public class WebElementWrappers {

	public WebElementWrappers(){
		
	}
	
	public void SendKeysWrapper(WebElement element, String elementName, String value) {
		if(value.equals("#skip#")) {
			return;
		}
		
		element.sendKeys(value);
		SendKeysWrapperMessage(elementName, value);
	}
	
	public void ClickWrapper(WebElement element, String elementName) {
		element.click();
		ClickWrapperMessage(elementName);
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
}
