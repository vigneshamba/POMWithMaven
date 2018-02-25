package testcases;

import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;
import pages.LoginPagePage;
import wdMethods.ProjectMethods;


public class TC001_CreateLead extends ProjectMethods{

	@BeforeTest
	public void setData() {
		testCaseName="TC001_CreateLead";
		testDescription="Create a new Lead on LeafTaps";
		testNodes = "Leads";
		browserName="chrome";
		dataSheetName="TC001";
		category="Smoke";
		authors="Gopi";
	}

	@Test(dataProvider="fetchData")
	public void createLead(String userName, String password, String comnyName, String firstName, String lastName, String eMail){

		new LoginPagePage(driver)
		.enterUserName(userName)
		.enterPassword(password)
		.clickLogin()		
		.clickCRMSFALink()		
		.clickLeadLink()		
		.clickCreateLead()
		.enterCompanyName(comnyName)
		.enterFirstName(firstName)
		.enterLastName(lastName)
		.enterEmail(eMail)
		.clickCreateLeadSubmit()		
		.verifyFirstName(firstName);			
	}
}
