package userActions;

import org.openqa.selenium.WebDriver;

import webpages.LoginPage;

public class LoginPageAction extends LoginPage{
	
	WebDriver driver;
	
	public LoginPageAction(WebDriver driver) {
		super(driver);
		this.driver = driver;
	}

	public void setUsername(String username) {
		findUsername().clear();
		findUsername().sendKeys(username);
	}

	public void setPassword(String password) {
		findPassword().clear();
		findPassword().sendKeys(password);
	}
	
	public void clickEnterButton() {
		findEnterButton().click();
	}
}