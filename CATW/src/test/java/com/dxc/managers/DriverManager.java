package com.dxc.managers;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class DriverManager {

	public WebDriver selectBrowser(String browser) {

		if (browser.equalsIgnoreCase("chrome")) {
			System.setProperty("webdriver.chrome.driver", "C:\\webdrivers\\chromedriver.exe");
			return new ChromeDriver();
		}

		if (browser.equalsIgnoreCase("firefox")) {
			System.setProperty("webdriver.gecko.driver", "C:\\webdrivers\\geckodriver.exe");
			return new FirefoxDriver();
		}
		return null;
	}

}
