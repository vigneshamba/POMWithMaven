package testcases;

import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import pages.FindLeadPage;
import pages.LoginPagePage;
import wdMethods.ProjectMethods;


public class TC004_DeleteLead extends ProjectMethods{

	@BeforeTest
	public void setData() {
		testCaseName="TC005_DeleteLead";
		testDescription="Delete a Lead - LeafTaps";
		testNodes = "Leads";
		browserName="chrome";
		dataSheetName="TC004";
		category="Sanity";
		authors="Gopi";
	}

	@Test(dataProvider="fetchData")
	public void deleteLead(String userName, String password, String phoneNum,String errorMsg){

	String firstResultingLead=new LoginPagePage(driver)
		.enterUserName(userName)
		.enterPassword(password)
		.clickLogin()
		.clickCRMSFALink()
		.clickLeadLink()		
		.clickFindLead()
		.clickPhoneTab()
		.enterPhoneNumberField(phoneNum)
		.clickFindleadsButton()
		.getFirstResultingLead();
	new FindLeadPage(driver)
		.clickFirstResultingLead()
		.clickDeleteLeadLink()
		.clickFindLead()
		.enterLeadId(firstResultingLead)
		.clickFindleadsButton()
		.verifyErrorMsg(errorMsg);
	}
}
