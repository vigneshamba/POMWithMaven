package pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.remote.RemoteWebDriver;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.PageFactory;

import wdMethods.ProjectMethods;


public class FindLeadPopPage extends ProjectMethods {


	public FindLeadPopPage(RemoteWebDriver driver){
		this.driver = driver;
		PageFactory.initElements(driver, this);
	}
	@FindBy(how=How.NAME,using="firstName")
	private WebElement elefindFirstName;
	public FindLeadPopPage enterFirstName(String findfistname){
		type(elefindFirstName, findfistname);
		return this;

	}
	@FindBy(how=How.XPATH,using="//button[text()='Find Leads']")
	private WebElement eleFindleadsButton;
	public FindLeadPopPage clickFindleadsButton(){
		click(eleFindleadsButton);
		return this;
	}
	@FindBy(how=How.XPATH,using="(//div[@class='x-grid3-cell-inner x-grid3-col-partyId']/a)[1]")
	private WebElement eleGetResultingLeads;
	public String getFirstResultingLead(){	
		return 	getText(eleGetResultingLeads);
	}

	@FindBy(how=How.XPATH,using="(//div[@class='x-grid3-cell-inner x-grid3-col-partyId']/a)[1]")
	private WebElement eleResultingLeads;
	public MergeLeadPage clickResultingLeads(){
		clickWithNoSnap(eleResultingLeads);
		switchToWindow(0);
		return new MergeLeadPage(driver);
	}
}