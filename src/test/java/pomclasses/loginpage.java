package pomclasses;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import baseclass.Baseclass;

public class loginpage extends Baseclass {

	// Declaration
	@FindBy(xpath = "//input[@id='username']")
	WebElement username;

	@FindBy(id = "password")
	WebElement Password;
	@FindBy(id = "submit-login")
	WebElement Login;

	// Initialization
	public loginpage(WebDriver driver) {
		super(driver);
	}

	// implementation
	public void EnterUsername(String email) {
		username.sendKeys(email);
	}

	public void EnterPassword(String password) {
		Password.sendKeys(password);
	}

	public void ClickLogin() {
		Login.click();

	}
}
