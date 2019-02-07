package com.dxc.pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class CATWSecretPage {

	WebDriver driver;

	public CATWSecretPage(WebDriver driver) {
		PageFactory.initElements(driver, this);
	}

	//Botão Time Entry
	@FindBy(xpath = "//td[@id='myTreetime_entry-cnt-start']//span[@class='urTxtStd']")
	WebElement btn_Time_Entry;

	public WebElement btn_Time_Entry() {
		return btn_Time_Entry;
	}

	//Botão Continue
	@FindBy(xpath = "//span[contains(text(), 'Continue')]")
	WebElement btn_continue;

	public WebElement btn_continue() {
		return btn_continue;
	}

	//Campo WBS element
	@FindBy(id = "data_tab_1_3_1")
	WebElement campo_wbs;

	public WebElement campo_wbs() {
		return campo_wbs;
	}

	//Campo Attend/Absence Type
	@FindBy(id = "data_tab_1_3_3")
	WebElement campo_Absence;

	public WebElement campo_Absence() {
		return campo_Absence;
	}

	//Botão Validate WBS 
	@FindBy(xpath = "//span[contains(text(), 'Validate WBS')]")
	WebElement btn_Validate_WBS;

	public WebElement btn_Validate_WBS() {
		return btn_Validate_WBS;
	}
	
	//Campo Attribute 1
	@FindBy(id = "data_tab_2_3_4")
	WebElement campo_Attribute_1;

	public WebElement campo_Attribute_1() {
		return campo_Attribute_1;
	}

	//Campo Attribute 2
	@FindBy(id = "data_tab_2_3_5")
	WebElement campo_Attribute_2;

	public WebElement campo_Attribute_2() {
		return campo_Attribute_2;
	}

	//Campo Terça
	@FindBy(xpath = "/html[1]/body[1]/table[1]/tbody[1]/tr[1]/td[1]/table[1]/tbody[1]/tr[1]/td[2]/table[1]/tbody[1]/tr[1]/td[1]/table[1]/tbody[2]/tr[2]/td[3]/div[1]/div[1]/form[1]/table[2]/tbody[1]/tr[1]/td[1]/table[2]/tbody[1]/tr[6]/td[1]/table[1]/tbody[1]/tr[1]/td[1]/table[1]/tbody[1]/tr[4]/td[11]/div[1]/table[1]/tbody[1]/tr[1]/td[1]/input[1]")
	WebElement lanc_ter;

	public WebElement lanc_ter() {
		return lanc_ter;
	}

	//Campo Quarta
	@FindBy(xpath = "/html[1]/body[1]/table[1]/tbody[1]/tr[1]/td[1]/table[1]/tbody[1]/tr[1]/td[2]/table[1]/tbody[1]/tr[1]/td[1]/table[1]/tbody[2]/tr[2]/td[3]/div[1]/div[1]/form[1]/table[2]/tbody[1]/tr[1]/td[1]/table[2]/tbody[1]/tr[6]/td[1]/table[1]/tbody[1]/tr[1]/td[1]/table[1]/tbody[1]/tr[4]/td[12]/div[1]/table[1]/tbody[1]/tr[1]/td[1]/input[1]")
	WebElement lanc_qua;

	public WebElement lanc_qua() {
		return lanc_qua;
	}
	
	//Campo Quinta
	@FindBy(xpath = "/html[1]/body[1]/table[1]/tbody[1]/tr[1]/td[1]/table[1]/tbody[1]/tr[1]/td[2]/table[1]/tbody[1]/tr[1]/td[1]/table[1]/tbody[2]/tr[2]/td[3]/div[1]/div[1]/form[1]/table[2]/tbody[1]/tr[1]/td[1]/table[2]/tbody[1]/tr[6]/td[1]/table[1]/tbody[1]/tr[1]/td[1]/table[1]/tbody[1]/tr[4]/td[13]/div[1]/table[1]/tbody[1]/tr[1]/td[1]/input[1]")
	WebElement lanc_qui;

	public WebElement lanc_qui() {
		return lanc_qui;
	}

	//Campo Sexta
	@FindBy(xpath = "/html[1]/body[1]/table[1]/tbody[1]/tr[1]/td[1]/table[1]/tbody[1]/tr[1]/td[2]/table[1]/tbody[1]/tr[1]/td[1]/table[1]/tbody[2]/tr[2]/td[3]/div[1]/div[1]/form[1]/table[2]/tbody[1]/tr[1]/td[1]/table[2]/tbody[1]/tr[6]/td[1]/table[1]/tbody[1]/tr[1]/td[1]/table[1]/tbody[1]/tr[4]/td[14]/div[1]/table[1]/tbody[1]/tr[1]/td[1]/input[1]")
	WebElement lanc_sex;

	public WebElement lanc_sex() {
		return lanc_sex;
	}
	
	//Campo Sabado
	@FindBy(xpath = "/html[1]/body[1]/table[1]/tbody[1]/tr[1]/td[1]/table[1]/tbody[1]/tr[1]/td[2]/table[1]/tbody[1]/tr[1]/td[1]/table[1]/tbody[2]/tr[2]/td[3]/div[1]/div[1]/form[1]/table[2]/tbody[1]/tr[1]/td[1]/table[2]/tbody[1]/tr[6]/td[1]/table[1]/tbody[1]/tr[1]/td[1]/table[1]/tbody[1]/tr[4]/td[15]/div[1]/table[1]/tbody[1]/tr[1]/td[1]/input[1]")
	WebElement lanc_sab;

	public WebElement lanc_sab() {
		return lanc_sab;
	}

	//Botão Save TimeSheet
	@FindBy(xpath = "//span[contains(text(), 'Save TimeSheet')]")
	WebElement btn_Save_TimeSheet;

	public WebElement btn_TimeSheet() {
		return btn_Save_TimeSheet;
	}

	//Validar Valor de Horas Lançadas
	@FindBy(xpath = "/html[1]/body[1]/table[1]/tbody[1]/tr[1]/td[1]/table[1]/tbody[1]/tr[1]/td[2]/table[1]/tbody[1]/tr[1]/td[1]/table[1]/tbody[2]/tr[2]/td[3]/div[1]/div[1]/form[1]/table[2]/tbody[1]/tr[1]/td[1]/table[2]/tbody[1]/tr[6]/td[1]/table[1]/tbody[1]/tr[1]/td[1]/table[1]/tbody[1]/tr[3]/td[9]/div[1]/span[1]")
	WebElement resul_horas;

	public WebElement resul_horas() {
		return resul_horas;
	}
	
	//Validar se Salvou o lançamento
	@FindBy(xpath = "/html[1]/body[1]/table[1]/tbody[1]/tr[1]/td[1]/table[1]/tbody[1]/tr[1]/td[2]/table[1]/tbody[1]/tr[1]/td[1]/table[1]/tbody[2]/tr[2]/td[3]/div[1]/div[1]/form[1]/table[2]/tbody[1]/tr[1]/td[1]/table[2]/tbody[1]/tr[3]/td[1]/table[1]/tbody[1]/tr[1]/td[1]/table[1]/tbody[1]/tr[2]/td[2]/div[1]/span[1]/font[1]")
	WebElement lanc_ok;

	public WebElement lanc_ok() {
		return lanc_ok;
	}
}
