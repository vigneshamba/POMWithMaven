package testcases;

import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import pages.FindLeadPopPage;
import pages.LoginPagePage;
import wdMethods.ProjectMethods;


public class TC002_MergeLead extends ProjectMethods {
	
	@BeforeTest
	public void setValues(){
		testCaseName = "TC002_MergeLead";
		testDescription = "Merge two Lead on LeafTaps";
		testNodes = "Leads";
		browserName = "chrome";
		dataSheetName = "TC002";
		category = "Regression";
		authors = "Babu";		
	}
	
	@Test(dataProvider = "fetchData")
	public void mergeLead(String uName, String pwd,String f_LeadName,String l_LeadName, String errorMsg){
		String fromLeadId = new LoginPagePage(driver)
		.enterUserName(uName)
		.enterPassword(pwd)
		.clickLogin()
		.clickCRMSFALink()
		.clickLeadLink()
		.clickMergeLead()
		.clickFromLeadLookup()
		.enterFirstName( f_LeadName)
		.clickFindleadsButton()
		.getFirstResultingLead();
		new FindLeadPopPage(driver)
		.clickResultingLeads()
		.clickToLeadLookup()
		.enterFirstName( l_LeadName)
		.clickFindleadsButton()
		.clickResultingLeads()
		.clickMergeButton()
		.clickFindLead()
		.enterLeadId(fromLeadId)
		.clickFindleadsButton()
		.verifyErrorMsg(errorMsg);
		
	}
	
	
}










