package com.dxc.pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class CATWLoginPage {
	
	WebDriver driver;
	
	public CATWLoginPage(WebDriver driver) {
		PageFactory.initElements(driver, this);
	}
	
	@FindBy(id="sap-user")
	WebElement user;
	
	public WebElement user() {
		return user;
	}
	
	@FindBy(id="sap-password")
	WebElement senha;
	
	public WebElement senha() {
		return senha;
	}
	
	@FindBy(xpath="//span[@class='urBtnCntTxt']")
	WebElement btn_login;
	
	public WebElement btn_login() {
		return btn_login;
	}

}
