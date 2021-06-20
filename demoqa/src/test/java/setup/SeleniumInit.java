package setup;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.BeforeSuite;

public class SeleniumInit {
	private static WebDriver driver;

    public static WebDriver getDriver() {
        return driver;
    }
	
	@BeforeSuite
	public void setup() {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\rajat\\git\\DemoQAAutomation\\demoqa\\src\\test\\resources\\drivers\\chromedriver.exe");
		driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://demoqa.com/");
	}
	
    @AfterSuite
    public void afterSuite() throws InterruptedException {
    	System.out.println("Results written into TestResult.xlsx file.");
    	Thread.sleep(2000);
        driver.quit();
    }
}
