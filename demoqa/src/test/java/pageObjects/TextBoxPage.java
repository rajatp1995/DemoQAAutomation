package pageObjects;

import java.util.List;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.testng.Assert;

public class TextBoxPage {
	final WebDriver driver;
	
	public TextBoxPage(WebDriver driver){
		this.driver=driver;
	}
	
	public void navigate(String url) {
		driver.get(url);
	}
	
	@FindBy(xpath="//input[@id='userName']")
	WebElement userName;
	
	@FindBy(xpath="//input[@id='userEmail']")
	WebElement userEmail;
	
	@FindBy(xpath="//textarea[@id='currentAddress']")
	WebElement currentAddress;
	
	@FindBy(xpath="//textarea[@id='permanentAddress']")
	WebElement permanentAddress;
	
	@FindBy(xpath="/html/body/div[2]/div/div/div[2]/div[2]/div[1]/form/div[5]/div/button")
	WebElement submitButton;
	
	public void enterDataAndSubmit(String uName, String uEmail, String cAddress, String pAddress) throws InterruptedException {
		userName.sendKeys(uName);
		userEmail.sendKeys(uEmail);
		currentAddress.sendKeys(cAddress);
		permanentAddress.sendKeys(pAddress);
		
		((JavascriptExecutor) driver).executeScript(
	            "arguments[0].scrollIntoView();", submitButton);
		submitButton.click();
	}
	
	public void verifyData(String uName, String uEmail, String cAddress, String pAddress) {
		List<WebElement> data = driver.findElements(By.xpath("//p[@class='mb-1']"));
		Assert.assertTrue(data.get(0).getText().contains(uName), "Wrong Name displayed");
		Assert.assertTrue(data.get(1).getText().contains(uEmail), "Wrong E-Mail displayed");
		Assert.assertTrue(data.get(2).getText().contains(cAddress), "Wrong Current Address displayed");
		Assert.assertTrue(data.get(3).getText().contains(pAddress), "Wrong Permanent Address displayed");
	}
}
