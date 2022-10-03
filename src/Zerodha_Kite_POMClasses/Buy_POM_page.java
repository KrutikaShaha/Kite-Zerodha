package Zerodha_Kite_POMClasses;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.FindBy;

public class Buy_POM_page 
{
	private WebDriver driver;
	
	public Buy_POM_page(WebDriver driver)
	{
		this.driver=driver;
		PageFactory.initElements(driver,this);
	}
	
	@FindBy(xpath="(//input[@type='number'])[1]")private WebElement buyQuntity;
	public String checkQuntityBuy()
	{
		String quantity=buyQuntity.getAttribute("value");
		return quantity;
	}
	
	public void sendQuntity()
	{
		buyQuntity.sendKeys("2");
	}
	
	@FindBy(xpath="//button[@class='button-outline cancel']")
	private WebElement byeCancel;
	public void clickOnBuyCancel()
	{
		byeCancel.click();
	}
	
	@FindBy(xpath="//label[text()='Cover']")private WebElement cover;
	public void clickOnCover()
	{
		cover.click();
	}
	
	@FindBy(xpath="//input[@label='Stoploss trigger Price']")private WebElement stiplossTriggerPrize;
	public boolean stiplossTriggerPrizeIsEnable()
	{
		boolean result=stiplossTriggerPrize.isEnabled();
		return result;
	}

}
