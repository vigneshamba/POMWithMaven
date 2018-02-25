package testcases;

import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import pages.LoginPagePage;
import wdMethods.ProjectMethods;


public class TC003_EditLead extends ProjectMethods{

	@BeforeTest
	public void setData() {
		testCaseName="TC003_EditLead";
		testDescription="Edit excisting Lead on LeafTaps";
		testNodes = "Leads";
		browserName="chrome";
		dataSheetName="TC003";
		category="Sanity";
		authors="Gopi";
	}

	@Test(dataProvider="fetchData")
	public void editLead(String userName, String password , String f_Name, String updcompanyName){

		new LoginPagePage(driver)
		.enterUserName(userName)
		.enterPassword(password)
		.clickLogin()		
		.clickCRMSFALink()		
		.clickLeadLink()		
		.clickFindLead()
		.enterFirstName(f_Name)
		.clickFindleadsButton()
		.clickFirstResultingLead()
		.clickEditLeadLink()
		.updateCompanyName(updcompanyName)
		.clickUpdateSubmit()
		.verifyCompanyName(updcompanyName);
		
	}

}
