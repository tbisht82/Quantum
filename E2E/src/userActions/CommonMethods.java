package userActions;

import org.openqa.selenium.By;
import org.openqa.selenium.NoSuchElementException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;

import webpages.CommonPageElements;

public class CommonMethods extends CommonPageElements {
	WebDriver driver;
	private WebDriverWait wait;

	public CommonMethods(WebDriver driver) {
		super(driver);
		this.driver = driver;
	}

	public void clickUserimage() {
		findUserimage().click();
	}

	public void clickLogoutButton() {
		findLogoutButton().click();
	}

	public void clickHomeImage() {
		findHomeImageButton().click();
	}

	public boolean verifyPageTitle(String title) {
		System.out.println("******" + driver.getTitle());
		return driver.getTitle().contains(title);
	}
	
	public void waitVisibility(By elementBy) {
		wait.until(ExpectedConditions.visibilityOfAllElementsLocatedBy(elementBy));
	}

	public String readText(By elementBy) {
		waitVisibility(elementBy);
		return driver.findElement(elementBy).getText();
	}
	
	public void assertEquals(By elementBy, String expectedText) {
		waitVisibility(elementBy);
		Assert.assertEquals(readText(elementBy), expectedText);
	}
	
	public boolean isElementPresent(By element) {
		try {
			driver.findElement(element);
			return true;
		}
		catch(NoSuchElementException e1) {
			return false;
		}
	}
}
