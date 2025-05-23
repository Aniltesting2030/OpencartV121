package pageObjects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class Loginpage extends BasePage{

	public Loginpage(WebDriver driver)
	{
		super(driver);
	}
	@FindBy(xpath ="//input[@id='input-email']")
	WebElement txtEmailAddress;
	
	@FindBy(xpath ="//input[@id='input-password']")
	WebElement txtpassword;
	
	@FindBy(xpath ="//input[@class='btn btn-primary']")
	WebElement btnLogin;
	
	public void setEmail(String email) {
		txtEmailAddress.sendKeys(email);
	}
		
	public void setPassword(String pwd) {
			txtpassword.sendKeys(pwd);
	}
	public void clickLogin() {
		btnLogin.click();
	}
			
	}
	
	
	
	

