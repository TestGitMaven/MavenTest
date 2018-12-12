package com.orangehrm.pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import com.orangehrm.basepage.BasePage;

public class Login extends BasePage {

// Driver constructor to use parent class methods.
	public Login(WebDriver driver) {
		super(driver);
	}

	@FindBy(xpath = ".//*[@id='txtUsername']")
	private WebElement txtUsername;
	@FindBy(xpath = ".//*[@id='txtPassword']")
	private WebElement txtPassword;
	@FindBy(xpath = ".//*[@id='btnLogin']")
	private WebElement btnLogin;
	@FindBy(xpath = ".//*[@id= 'welcome']")
	private WebElement welcome;
	@FindBy(xpath = ".//*[@id= 'welcome-menu']/ul/li[3]/a")
	
	private WebElement logout;

	public void LoginPage() {
		txtUsername.sendKeys("Admin");
		txtPassword.sendKeys("Venu@0304");
		btnLogin.click();
	}

	public void logout() throws InterruptedException {
		welcome.click();
		Thread.sleep(40000);
		logout.click();
	}
}