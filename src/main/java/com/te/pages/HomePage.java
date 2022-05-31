package com.te.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.te.base.Base;

public class HomePage extends Base {

	@FindBy(xpath = "/html/body/div[1]/div[3]/form/div[1]/div[1]/div[1]/div/div[2]/input")
	WebElement searchTextFIeld;
	
	@FindBy(xpath = "/html/body/div[1]/div[3]/form/div[1]/div[1]/div[3]/center/input[1]")
	WebElement searchButton;
	
	public HomePage() {
		PageFactory.initElements(driver, this);
	}
	
	public void populateSearchTextBox(String text) {
		searchTextFIeld.sendKeys(text);
	}
	
	public void clickOnSearchButton() {
		searchButton.click();
	}
}
