package com.te.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import com.te.base.Base;
import com.te.automation.wrappers.*;

public class HomePage extends Base {

	public static final String searchTextFieldXpath = "/html/body/div[1]/div[3]/form/div[1]/div[1]/div[1]/div/div[2]/input";;
	public static final String searchButtonXpath = "/html/body/div[1]/div[3]/form/div[1]/div[1]/div[3]/center/input[1]";
	
	@FindBy(xpath = searchTextFieldXpath)
	WebElement searchTextFIeld;
	
	@FindBy(xpath = searchButtonXpath )
	WebElement searchButton;
	
	public WebElementWrappers wrappers;
	
	public HomePage() {
		System.out.println("$$$$$$$$$$$$$$$$$");
		System.out.println("WHEN DOES THIS HAPPEN - HOME PAGE");
		System.out.println("$$$$$$$$$$$$$$$$$");
		initialization();
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
