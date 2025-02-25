package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class LoginPage {

	WebDriver driver;

	@FindBy(id = "email")
	WebElement email;

	@FindBy(id = "passwd")
	WebElement password;

	@FindBy(id = "SubmitLogin")
	WebElement login_button;

	public LoginPage(WebDriver driver) {

		// This initElements method will create all WebElements
		this.driver = driver;
		PageFactory.initElements(driver, this);
	}

	// Set user name in textbox
	public void insertUser(String username) {
		email.sendKeys(username);
	}

	// Set password in password textbox
	public void insertPassword(String pass) {
		password.sendKeys(pass);
	}

	// Click on login button
	public void clickLoginButton() {
		login_button.click();
	}

}