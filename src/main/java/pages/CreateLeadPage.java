package pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.remote.RemoteWebDriver;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.PageFactory;

import wdMethods.ProjectMethods;

public class CreateLeadPage  extends ProjectMethods {


	public CreateLeadPage(RemoteWebDriver driver){
		this.driver = driver;		
		PageFactory.initElements(driver, this);		
	}


	@FindBy(how=How.ID,using="createLeadForm_companyName")
	private WebElement companyName;

	public CreateLeadPage enterCompanyName(String comnyName){
		type(companyName, comnyName);
		return this;

	}

	@FindBy(how=How.ID,using="createLeadForm_firstName")
	private WebElement eleFirstName;

	public CreateLeadPage enterFirstName(String firstName){
		type(eleFirstName, firstName);
		return this;
	}

	@FindBy(how=How.ID,using="createLeadForm_lastName")
	private WebElement eleLastName;
	public CreateLeadPage enterLastName(String lastName){
		type(eleLastName, lastName);
		return this;

	}

	@FindBy(how=How.CLASS_NAME,using="smallSubmit")
	private WebElement eleCreateLeadSubmit;
	public ViewLeadPage clickCreateLeadSubmit(){
		click(eleCreateLeadSubmit);
		return new ViewLeadPage(driver);
	}
	
	@FindBy(how=How.ID,using="createLeadForm_primaryEmail")
	private WebElement eleEmail;
	public CreateLeadPage enterEmail(String eMail){
		type(eleEmail, eMail);
		return this;
	}
}
