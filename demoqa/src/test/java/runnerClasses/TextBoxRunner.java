package runnerClasses;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.Test;
import pageObjects.TextBoxPage;
import setup.SeleniumInit;

public class TextBoxRunner {
	
	WebDriver driver = SeleniumInit.getDriver();
	String url = "https://demoqa.com/text-box";
	TextBoxPage textBoxPage = PageFactory.initElements(driver, TextBoxPage.class);
	
	@Test
	public void test1() {
		textBoxPage.navigate(url);
		textBoxPage.enterDataAndSubmit("Rajat", "rajat@rajat.com", "cA", "pA");
	}

}
