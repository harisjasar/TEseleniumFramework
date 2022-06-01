package com.te.base;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Base {
	public static WebDriver driver;

	public static void initialization() {
		System.setProperty("webdriver.chrome.driver", "C:/chromedriver.exe");
		
		driver = new ChromeDriver();
		
		driver.manage().window().maximize();
		driver.manage().deleteAllCookies();
		
		//driver.get("https://google.com"); //@TODO refactor to be dynamic
	}
	
}

/*public class Base {
public static WebDriver driver;

public static void initialization() {
	System.setProperty("webdriver.chrome.driver", "C:/chromedriver.exe");
	
	driver = new ChromeDriver();
	
	driver.manage().window().maximize();
	driver.manage().deleteAllCookies();
	
	driver.get("https://google.com"); //@TODO refactor to be dynamic
}
}
*/