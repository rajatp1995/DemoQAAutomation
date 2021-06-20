package pageObjects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

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
	
	@FindBy(xpath="//button[@id='submit']")
	WebElement submitButton;
	
	public void enterDataAndSubmit(String uName, String uEmail, String cAddress, String pAddress) {
		userName.sendKeys(uName);
		userEmail.sendKeys(uEmail);
		currentAddress.sendKeys(cAddress);
		permanentAddress.sendKeys(pAddress);
		submitButton.click();
	}
}
