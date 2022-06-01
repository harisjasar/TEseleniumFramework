package com.te.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import com.te.base.Base;
import com.te.automation.wrappers.*;

public class HomePage extends Base {

	@FindBy(xpath = "/html/body/div[1]/div[3]/form/div[1]/div[1]/div[1]/div/div[2]/input")
	WebElement searchTextFIeld;
	
	@FindBy(xpath = "/html/body/div[1]/div[3]/form/div[1]/div[1]/div[3]/center/input[1]")
	WebElement searchButton;
	
	public WebElementWrappers wrappers;
	
	public HomePage() {
		PageFactory.initElements(driver, this);
		this.wrappers = new WebElementWrappers();
	}
	
	public void populateSearchTextBox(String text) {
		wrappers.SendKeysWrapper(searchTextFIeld, "Search Textbox", text);
	}
	
	public void clickOnSearchButton() {
		wrappers.ClickWrapper(searchButton, "Search Button");
	}

	public void navigateTo(String url) {
		wrappers.NavigateToWrapper(driver, url);
	}
}
