package base;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeSuite;

public class BrowserInit extends InitializeLogging{
	public static WebDriver driver;
	
	@BeforeClass
	public void init() {
		System.out.println("inside init");
		log.info("Initializing Browser");
		System.setProperty("webdriver.chrome.driver", "chromedriver.exe");
		driver = new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		//Maximize Window
        driver.manage().window().maximize();
        
        log.info("Launching website " + "https://accountplanuat.wipro.com");
		driver.get("https://accountplanuat.wipro.com");
        
		System.out.println("inside init" + driver.toString());
		if(driver!=null)
			log.info("Browser initialized");
		else
			log.error("browser initialization failed");
	}
	
	@AfterClass
	public void tearDown()
	{
		driver.quit();
	}
}