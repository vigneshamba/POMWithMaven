package pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.remote.RemoteWebDriver;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.PageFactory;

import wdMethods.ProjectMethods;


public class ViewLeadPage extends ProjectMethods  {

	public ViewLeadPage(RemoteWebDriver driver){
		this.driver = driver;		
		PageFactory.initElements(driver, this);		
	}
	
	@FindBy(how=How.ID,using="viewLead_firstName_sp")
	public WebElement eleLeadLink;
	public ViewLeadPage verifyFirstName(String fname) {
		verifyPartialText(eleLeadLink, fname);
		return this;
	}
	@FindBy(how=How.LINK_TEXT,using="Find Leads")
	public WebElement elefindLead;
	
	public FindLeadPage clickFindLead(){
		click(elefindLead);
		return new FindLeadPage(driver);
	}
	
	@FindBy(how=How.ID,using="viewLead_companyName_sp")
	public WebElement eleCompanyName;
	public ViewLeadPage verifyCompanyName(String CompanyName) {
		verifyPartialText(eleCompanyName, CompanyName);
		return this;
	}
	@FindBy(how=How.LINK_TEXT,using="Edit")
	public WebElement eleEditLeadLink;
	public EditLeadPage clickEditLeadLink(){
		click(eleEditLeadLink);
		return new EditLeadPage(driver);
	}
	@FindBy(how=How.LINK_TEXT,using="Duplicate Lead")
	public WebElement eleDuplicateLeadLink;
	public DuplicateLeadPage clickDuplicateLeadLink(){
		click(eleDuplicateLeadLink);
		return new DuplicateLeadPage(driver);
	}
	@FindBy(how=How.LINK_TEXT,using="Delete")
	public WebElement eleDeleteLeadLink;
	public MyLeadsPage clickDeleteLeadLink(){
		click(eleDeleteLeadLink);
		return new MyLeadsPage(driver);
	}
	
	

	
	
}
