package Zerodha_Kite_POMClasses;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class TwoPhaseLogInPagePOM 
{
	private WebDriver driver;
	
	@FindBy(xpath="//input[@id='userid']")
	private WebElement UserID;
	public void sendUserId()
	{
		UserID.sendKeys("QZJ889");
	}
	
	@FindBy(xpath="//input[@id='password']")
	private WebElement password;
	public void sendPassword()
	{
		password.sendKeys("Zerodha@1");
	}
	
	@FindBy(xpath="//button[@class='button-orange wide']")
	private WebElement logIn;
	public void clickOnLOgIN()
	{
		logIn.click();
	}
	
	@FindBy(xpath="//input[@id='pin']")
	private WebElement pin;
	public void sendPin()
	{
		pin.sendKeys("123456");
	}
	
	@FindBy(xpath="//button[@class='button-orange wide']")
	private WebElement continue1;
	public void clickOnContinue()
	{
		continue1.click();
	}
	
	@FindBy(xpath="//a[text()='Forgot user ID or password?']")
	private WebElement ForgotuserIDorpassword;
	public void clickOnForgotuserIDorpassword()
	{
		ForgotuserIDorpassword.click();
	}
	
	@FindBy(xpath="//a[@class='text-light forgot-link']")
	private WebElement Forgot2FA;
	public void clickONForgot2FA()
	{
		Forgot2FA.click();
	}

	public TwoPhaseLogInPagePOM(WebDriver driver)
	{
		this.driver=driver;
		PageFactory.initElements(driver, this);
	}
}
