package pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.remote.RemoteWebDriver;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.PageFactory;

import wdMethods.ProjectMethods;


public class HomePagePage extends ProjectMethods  {

	public HomePagePage(RemoteWebDriver driver){
		this.driver = driver;	
		PageFactory.initElements(driver, this);
	}


	@FindBy(how=How.XPATH,using="//h2[text()[contains(.,'Demo')]]")
	public WebElement eleLoggedName;

	public HomePagePage verifyLoggedName(String data) {
		verifyPartialText(eleLoggedName, data);
		return this;
	}

	@FindBy(how=How.LINK_TEXT,using="CRM/SFA")
	public WebElement eleCRMSFALink;

	public MyHomePage clickCRMSFALink(){
		click(eleCRMSFALink);
		return new MyHomePage(driver);
	}

	@FindBy(how=How.CLASS_NAME,using="decorativeSubmit")
	private WebElement eleLogOut;
	
	public LoginPagePage clickLogout() {
		click(eleLogOut);
		return new LoginPagePage(driver);

	}



}
