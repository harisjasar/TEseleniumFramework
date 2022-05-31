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
		System.out.println("Element Name: " + elementName + " - Entered Value: " + value);
	}
	
	public void ClickWrapper(WebElement element, String elementName) {
		element.click();
		System.out.println("Clicked on " + elementName);
	}
}
