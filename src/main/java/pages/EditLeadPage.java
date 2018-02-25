package pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.remote.RemoteWebDriver;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.PageFactory;

import wdMethods.ProjectMethods;


public class EditLeadPage extends ProjectMethods {
	
	
	public EditLeadPage(RemoteWebDriver driver){
			this.driver = driver;			
			PageFactory.initElements(driver, this);			
		}
	
	@FindBy(how=How.ID,using="updateLeadForm_companyName")
	private WebElement eleupdateCompanyName;
     	public EditLeadPage updateCompanyName(String updcomnyName){
		type(eleupdateCompanyName, updcomnyName);
		return this;
		
	    }
     	@FindBy(how=How.CLASS_NAME,using="smallSubmit")
    	private WebElement eleUpdateSubmit;
     	public ViewLeadPage clickUpdateSubmit(){
			click(eleUpdateSubmit);
			return new ViewLeadPage(driver);
		}
		
}
     	
