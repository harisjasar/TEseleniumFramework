package com.te.pages.toolsqa;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.testng.Assert;

import com.te.automation.wrappers.WebElementWrappers;
import com.te.base.Base;

public class TextBoxPage extends Base{
	@FindBy(xpath = "//*[@id=\"userName\"]")
	WebElement fullName;
	
	@FindBy(xpath = "//*[@id=\"userEmail\"]")
	WebElement email;
	
	@FindBy(xpath = "//*[@id=\"currentAddress\"]")
	WebElement currentAddress;
	
	@FindBy(xpath = "//*[@id=\"permanentAddress\"]")
	WebElement permanentAddress;
	
	@FindBy(xpath = "//*[@id=\"submit\"]")
	WebElement submitButton;
	
	@FindBy(xpath = "//*[@id=\"output\"]/div")
	WebElement successMessage;
	
	
	public WebElementWrappers wrappers;
	
	public TextBoxPage() {
		PageFactory.initElements(driver, this);
		this.wrappers = new WebElementWrappers();
	}
	
	public void populateFullName(String text) {
		wrappers.SendKeysWrapper(fullName, "Full Name", text);
	}
	
	public void populateEmail(String text) {
		wrappers.SendKeysWrapper(email, "Email", text);
	}
	
	public void populateCurrentAddress(String text) {
		wrappers.SendKeysWrapper(currentAddress, "Current Address", text);
	}
	
	public void populatePermanentAddress(String text) {
		wrappers.SendKeysWrapper(permanentAddress, "Permanent Address", text);
	}
	
	public void clickOnSubmitButton() {
		wrappers.ClickWrapper(submitButton, "Submit Button");
	}

	public void navigateTo(String url) {
		wrappers.NavigateToWrapper(driver, url);
	}
	
	public void verifySuccessMessageVisible() {
		String attribute = successMessage.getAttribute("class");
		if(attribute.contains("undefined")) {
			Assert.fail("Success Message is not visible");
		}
	}
}
