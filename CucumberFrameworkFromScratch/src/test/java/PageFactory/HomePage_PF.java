package PageFactory;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class HomePage_PF {

	WebDriver driver;
	LoginPage_PF loginPage;
	
	//Constructor
	public HomePage_PF(WebDriver driver) {
		this.driver = driver;
		PageFactory.initElements(driver, this);
	}
	
	//WebElements
	@FindBy(xpath = "//a[text()='Log out']")
	WebElement btn_logout;
	
	//Methods
	public void IsLogoutButtonDisplayed() {
		System.out.println("Logout method");
		try {
			btn_logout.isDisplayed();
			System.out.println("Successful login");
		} catch (Exception e) {
			System.out.println(e);
			loginPage = new LoginPage_PF(driver);
			loginPage.errorMsgDisplayed();
			System.out.println("Invalid credentials lead to login failure.");
		}
	}
}
