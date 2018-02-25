package pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.remote.RemoteWebDriver;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.PageFactory;

import wdMethods.ProjectMethods;

public class LoginPagePage extends ProjectMethods  {

	// This is to confirm you are in Login Page
	public LoginPagePage(RemoteWebDriver driver){
		this.driver = driver;	
		// This is to load all the elements in the page
		PageFactory.initElements(driver, this);
		
	}
	
	@FindBy(how=How.ID,using="username")
	private WebElement eleUserName;
	
	// Enter user name in Login Page
	public LoginPagePage enterUserName(String userName){
		type(eleUserName, userName);
		return this;
	}
	
	@FindBy(how=How.ID,using="password")
	private WebElement elePassword;
	
	// Enter password in Login Page,
	public LoginPagePage enterPassword(String password){
		type(elePassword, password);
		return this;
		
	}
	
	@FindBy(how=How.CLASS_NAME,using="decorativeSubmit")
	private WebElement eleLogin;
	
	// Click login 
	public HomePagePage clickLogin(){
		click(eleLogin);
		return new HomePagePage(driver);
	}
	
	// Click login button on negative case
	public LoginPagePage clickLoginForFailure(){
		click(eleLogin);
		return this;
	}
	
	@FindBy(how=How.ID,using="errorDiv")
	private WebElement eleErrorMessage;
	
	// Verify the error message
	public LoginPagePage verifyErrorMsg(String text){
		verifyPartialText(eleErrorMessage, text);
		return this;
	}

}
