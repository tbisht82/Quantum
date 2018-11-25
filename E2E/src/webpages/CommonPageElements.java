package webpages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class CommonPageElements {
	private WebDriver driver;

	public CommonPageElements(WebDriver driver) {
		this.driver = driver;
		// PageFactory.initElements(driver, this);
	}
	
	// ********************************* Common Objects *******************************
	
	public By btnUserImageBy = By.xpath("//button/img[@alt='user image']");
	public By btnLogoutBy = By.xpath("//button/span[@class='Txt']");
	public By imgHomeBtn = By.xpath("//img[@class='home_btn' and @alt='Wipro One']");

	// ********************************* FindElement Methods *******************************
	
	public WebElement findUserimage() {
		return driver.findElement(btnUserImageBy);
	}

	public WebElement findLogoutButton() {
		return driver.findElement(btnLogoutBy);
	}

	public WebElement findHomeImageButton() {
		return driver.findElement(imgHomeBtn);
	}
}
