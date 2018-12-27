package com.orangehrm.basetest;


import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;

import com.orangehrm.pages.Login;

public class BaseTest {
	WebDriver driver;

	@BeforeMethod
	public void OpenBroswer() {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\venu\\eclipse-workspace\\chromedriver.exe");
		driver = new ChromeDriver();
		driver.get("http://localhost/orangehrm/orangehrm-4.1.2.1/symfony/web/index.php/auth/login");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(60, TimeUnit.SECONDS);
	}

	@BeforeMethod()
	public void login() throws InterruptedException {
		Login Login = new Login(driver);
		Login.LoginPage();

	}

	
	/*  @AfterMethod() 
	  public void closeBrowser() { 
		  driver.quit();
	  
	  }*/
	 
	@AfterMethod()
	public void logout() throws InterruptedException {
		Login Login = new Login(driver);
		Login.logout();
	}

	public WebDriver getDriver() {
		return driver;
	}
}
