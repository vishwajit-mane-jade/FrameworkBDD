package Pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class loginPage {

	protected WebDriver driver;
	private By txt_username = By.id("username");
	private By txt_password = By.id("password");
	private By btn_login = By.id("submit");
	private By btn_logout = By.xpath("//a[text()='Log out']");
	
	public loginPage(WebDriver driver) {
		this.driver = driver;
	}
	
	public void enterUsername(String username) {
		driver.findElement(txt_username).sendKeys(username);
	}
	
	public void enterPassword(String password) {
		driver.findElement(txt_password).sendKeys(password);
	}
	
	public void clickLogin() {
		driver.findElement(btn_login).click();
	}
	
	public void checkLogoutIsDisplayed() {
		driver.findElement(btn_logout).isDisplayed();
	}
}
