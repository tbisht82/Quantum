package webpages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;


public class LoginPage{
	private WebDriver driver;
	
	public LoginPage(WebDriver driver) {
		this.driver = driver;
		//PageFactory.initElements(driver, this);
	}
	
	// ********************************* Objects For Login Page *******************************
	
	public By txtUsernameBy = By.id("i0116");
	public By btnEnterBy = By.id("idSIButton9");
	public By txtPasswordBy = By.id("i0118");
	public By btnUserImageBy = By.xpath("//button/img[@alt='user image']");
	public By btnLogoutBy = By.xpath("//button/span[@class='Txt']");
	
	
	// ********************************* FindElement Methods For Login Page *******************************
	
	public WebElement findUsername() {
		return driver.findElement(txtUsernameBy);
	}
	
	public WebElement findPassword() {
		return driver.findElement(txtPasswordBy);
	}
	
	public WebElement findEnterButton() {
		return driver.findElement(btnEnterBy);
	}
	
	public WebElement findUserimage() {
		return driver.findElement(btnUserImageBy);
	}
	
	public WebElement findLogoutButton() {
		return driver.findElement(btnLogoutBy);
	}
		
	// ********************************* Action Methods For Login Page *******************************
	
	/*public void setUsername(String username) {
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
	
	public void clickUserimage() {
		findUserimage().click();
	}
	
	public void clickLogoutButton() {
		findLogoutButton().click();
	}*/
}

/*@FindBy(id="i0116")
public WebElement txtUsername;

@FindBy(id="idSIButton9")
public WebElement btnEnter;

@FindBy(id="i0118")
public WebElement txtPassword;

@FindBy(xpath="//button/img[@alt='user image']")
public WebElement btnUserimage;

@FindBy(xpath="//button/span[@class='Txt']")
public WebElement btnLogout;*/