package runnerClasses;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.Test;
import pageObjects.TextBoxPage;
import setup.SeleniumInit;

public class TextBoxRunner {
	
	WebDriver driver;
	String url = "https://demoqa.com/text-box";
	TextBoxPage textBoxPage;
	
	@Test
	public void test1() {
		driver = SeleniumInit.getDriver();
		textBoxPage = PageFactory.initElements(driver, TextBoxPage.class);
		textBoxPage.navigate(url);
		textBoxPage.enterDataAndSubmit("Rajat", "rajat@rajat.com", "cA", "pA");
	}

}
