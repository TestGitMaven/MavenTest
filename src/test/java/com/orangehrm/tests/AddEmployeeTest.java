package com.orangehrm.tests;

import org.testng.annotations.Test;
import com.orangehrm.basetest.BaseTest;
import com.orangehrm.pages.AddEmployeePage;

public class AddEmployeeTest extends BaseTest {
	@Test
	public void verifyAddEmployee() {
	AddEmployeePage addEmployeePage = new AddEmployeePage(getDriver());
	addEmployeePage.navigateToPim();;
	addEmployeePage.navigateToAddEmployee();
	addEmployeePage.addEmployeeDetails();
		
	}
}
