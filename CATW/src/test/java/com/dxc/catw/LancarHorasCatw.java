package com.dxc.catw;

import java.util.concurrent.TimeUnit;

import org.junit.After;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.Select;

import com.dxc.managers.DriverManager;
import com.dxc.pages.CATWLoginPage;
import com.dxc.pages.CATWSecretPage;

public class LancarHorasCatw {

	WebDriver driver;
	private Select lista_Absence;

	DriverManager dm = new DriverManager();
	CATWLoginPage pl;
	CATWSecretPage ps;

	@Before
	public void setUp() {
		driver = dm.selectBrowser("chrome");
		pl = new CATWLoginPage(driver);
		ps = new CATWSecretPage(driver);

		driver.get(
				"https://e9u0028.houston.entsvcs.net:4106/hps-ic-red(bD1lbiZjPTIwMCZ0PVpIUFNfSUM=)/default.htm?sap-client=200&sap-language=EN");
		driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);

		pl.user().sendKeys("21911323");
		pl.senha().sendKeys("M@yc0n24");
		pl.btn_login().click();
	}

	@Test
	public void lancarHoras() {

		driver.switchTo().frame("list");
		ps.btn_Time_Entry().click();

		driver.switchTo().defaultContent();

		driver.switchTo().frame("right");
		ps.btn_continue().click();

		ps.campo_wbs().sendKeys("ZZZ-4695.P01.ATAQ");

		lista_Absence = new Select(ps.campo_Absence());
		lista_Absence.selectByVisibleText("400 Project Attendance");

		ps.btn_Validate_WBS().click();

		try {
			Thread.sleep(2000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

		ps.campo_Attribute_1().sendKeys("RFC-REQ_FOR_CHG REQUEST FOR CHANGE");
		ps.campo_Attribute_2().sendKeys("SUP OPER PJ SUPORTE OPERACIONAL PROJETO");

		ps.lanc_ter().clear();
		ps.lanc_ter().sendKeys("8,00");

		ps.lanc_qua().clear();
		ps.lanc_qua().sendKeys("8,00");

		ps.lanc_qui().clear();
		ps.lanc_qui().sendKeys("8,00");

		ps.lanc_sex().clear();
		ps.lanc_sex().sendKeys("8,00");

		ps.lanc_sab().clear();
		ps.lanc_sab().sendKeys("8,00");
		
		ps.btn_TimeSheet().click();
		
		Assert.assertEquals("40.00", ps.resul_horas().getText());
		System.out.println(ps.resul_horas().getText());
		
		try {
			Thread.sleep(2000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		Assert.assertEquals("Data has been saved.", ps.lanc_ok().getText());
		System.out.println(ps.lanc_ok().getText());
	}
	
	@After
	public void tearDown() {
		driver.quit();
	}

}
