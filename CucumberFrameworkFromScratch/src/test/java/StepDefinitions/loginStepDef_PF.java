package StepDefinitions;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import PageFactory.HomePage_PF;
import PageFactory.LoginPage_PF;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class loginStepDef_PF {
	WebDriver driver = null;
	LoginPage_PF loginPage;
	HomePage_PF homePage;
	
	@Given("user is on login page")
	public void user_is_on_login_page() {
    	String projectPath = System.getProperty("user.dir");
	    System.setProperty("webdriver.chrome.driver", projectPath+"/src/test/resources/Drivers/chromedriver.exe");
		driver = new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		driver.manage().window().maximize();
    	driver.navigate().to("https://practicetestautomation.com/practice-test-login/");
	}

	@When("^user enters (.*) and (.*)$")
	public void user_enters_username_and_password(String username, String password) throws InterruptedException {
	    System.out.println("user creds");
	    loginPage = new LoginPage_PF(driver);
	    loginPage.enterUserName(username);
	    loginPage.enterPassword(password);
	    Thread.sleep(3000);
	}

	@And("User clicks on login button")
	public void user_clicks_on_login_button() {
	    System.out.println("login button");
	    loginPage.hitSubmit();
	}

	@Then("User is navigated to home page")
	public void user_is_navigated_to_home_page() throws InterruptedException {
	    System.out.println("home page");
	    homePage = new HomePage_PF(driver);
	    homePage.IsLogoutButtonDisplayed();
	    Thread.sleep(3000);
	    driver.close();
	}
	
}
