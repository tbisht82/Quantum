package testcase;

import java.util.concurrent.TimeUnit;

import org.apache.log4j.Logger;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import base.InitializeLogging;
import userActions.CommonMethods;
import userActions.LoginPageAction;

public class Login {

	WebDriver driver;
	Logger log = InitializeLogging.log;
	LoginPageAction lpa;
	CommonMethods cm;

	/*
	 * @SuppressWarnings("deprecation") FluentWait<WebDriver> wait = new
	 * FluentWait<WebDriver>(driver) .withTimeout(30, TimeUnit.SECONDS)
	 * .pollingEvery(5, TimeUnit.SECONDS) .ignoring(NoSuchElementException.class);
	 */

	@BeforeClass
	public void init() {
		log.info("Initializing Browser");
		System.setProperty("webdriver.chrome.driver", "chromedriver.exe");
		driver = new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		// Maximize Window
		driver.manage().window().maximize();

		log.info("Launching website " + "https://accountplanuat.wipro.com");
		driver.get("https://accountplanuat.wipro.com");

		System.out.println("inside init" + driver.toString());
		if (driver != null)
			log.info("Browser initialized");
		else
			log.error("browser initialization failed");
		lpa = new LoginPageAction(driver);
	}

	@Test(description = "Login to the app")
	public void login() throws InterruptedException {

		log.trace("entering username and password");

		lpa.setUsername("sa377687@wipro.com");

		// vi392466@wipro.com
		// Nov@2018

		lpa.clickEnterButton();

		Thread.sleep(5000);

		lpa.setPassword("sa.377687");

		Thread.sleep(3000);

		lpa.clickEnterButton();

		Thread.sleep(5000);

		if (lpa.findEnterButton().isDisplayed())
			lpa.clickEnterButton();
	}

	@Test(description = "Logout from the app")
	public void logout() throws InterruptedException {
		Thread.sleep(5000);
		if (cm.isElementPresent(lpa.btnUserImageBy))
			log.info("logged in successfully");
		else
			log.error("login failed");
		cm.clickUserimage();

		Thread.sleep(1000);
		cm.clickLogoutButton();

		if (cm.verifyPageTitle("Logout"))
			log.info("Logged out successfully.");
		else
			log.error("Logout unsuccessful");
	}
}