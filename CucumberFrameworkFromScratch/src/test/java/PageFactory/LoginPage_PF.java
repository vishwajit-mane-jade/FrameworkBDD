package PageFactory;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class LoginPage_PF {

	WebDriver driver;
	//Constructor
	public LoginPage_PF(WebDriver driver) {
		this.driver = driver;
		PageFactory.initElements(driver, this);
	}
	
	
	//WebElements
	@FindBy(id="username")
	WebElement txt_username;
	
	@FindBy(id="password")
	WebElement txt_password;
	
	@FindBy(id="submit")
	WebElement btn_submit;
	
	@FindBy(id="error")
	WebElement errorMsg;
	
	//Methods
	public void enterUserName(String username) {
		txt_username.sendKeys(username);
		System.out.println("Username is entered");
	}
	
	public void enterPassword(String password) {
		txt_password.sendKeys(password);
		System.out.println("Password is entered");
	}
	
	public void hitSubmit() {
		btn_submit.click();
	}
	
	public void errorMsgDisplayed() {
		errorMsg.isDisplayed();
	}
	
}
