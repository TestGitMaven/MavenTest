package com.orangehrm.pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import com.orangehrm.basepage.BasePage;

public class AddEmployeePage extends BasePage {
	@FindBy(xpath = ".//*[@id='menu_pim_viewPimModule']")
	private WebElement linkPim;

	@FindBy(xpath = ".//*[@id='menu_pim_addEmployee']")
	private WebElement linkAddEmployee;

	@FindBy(xpath = ".//*[@id='firstName']")
	private WebElement txtFirstName;

	@FindBy(xpath = ".//*[@id='lastName']")
	private WebElement txtLastName;

	@FindBy(xpath = ".//*[@id='btnSave']")
	private WebElement btnSave;
	
	@FindBy(xpath = "//*[@id='personal_txtEmployeeId']")
	private WebElement txtEmployeeId;
			
	public void navigateToPim() {
		linkPim.click();
	}

	public void navigateToAddEmployee() {
		linkAddEmployee.click();
	}

	public String addEmployeeDetails() {
		txtFirstName.sendKeys("raju");
		txtLastName.sendKeys("reddy");
		btnSave.click();
		String expectedEmpID = txtEmployeeId.getAttribute("value");
		return expectedEmpID;
	}

	public AddEmployeePage(WebDriver driver) {
		super(driver);
	}
}
