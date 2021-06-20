package runnerClasses;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;
import pageObjects.TextBoxPage;
import setup.SeleniumInit;

public class TextBoxRunner {
	
	WebDriver driver;
	String url = "https://demoqa.com/text-box";
	TextBoxPage textBoxPage;
	
	@BeforeClass
	public void classSetup() {
		driver = SeleniumInit.getDriver();
		textBoxPage = PageFactory.initElements(driver, TextBoxPage.class);
	}
	
	@Test
	public void test1() {
		textBoxPage.navigate(url);
		textBoxPage.enterDataAndSubmit("Rajat", "rajat@rajat.com", "cA", "pA");
	}
	
	@Test
	public void test2() {
		textBoxPage.navigate(url);
		textBoxPage.enterDataAndSubmit("Fish", "fish@fish.com", "cA", "pA");
	}

}
