package Zerodha_Kite_POMClasses;

import java.util.List;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;


public class Home_DashBoard_POMPage 
{
	private WebDriver driver;
	private Actions act;
	
	@FindBy(xpath="//input[@placeholder='Search eg: infy bse, nifty fut, nifty weekly, gold mcx']")
	private WebElement searchBox;
	public void sendNameSearchBox(String stockName)
	{
		searchBox.sendKeys(stockName);
	}
	
	@FindBy(xpath="//span[text()='QZJ889']")
	private WebElement profileDropDown;
	public void clickOnProfileDropDown()
	{
		profileDropDown.click();
	}
	
	public Home_DashBoard_POMPage(WebDriver driver)
	{
		this.driver=driver;
		PageFactory.initElements(driver, this);
		act =new Actions(driver);
	}
	
	@FindBy(xpath="//a[@target='_self']")
	private WebElement logOut;
	public void clickOnLogOut()
	{
		logOut.click();
	}
	
	@FindBy(xpath="//span[text()='Dashboard']")
	private WebElement dashboard;
	public void clickOnDashboard()
	{
		dashboard.click();
	}
	
	@FindBy(xpath="//span[text()='Orders']")
	private WebElement orders;
	public void clickOnOrders()
	{
		orders.click();
	}
	
	@FindBy(xpath="//span[text()='Holdings']")
	private WebElement holdings;
	public void clickOnHoldings()
	{
		holdings.click();
	}
	
	@FindBy(xpath="//span[text()='Positions']")
	private WebElement positions;
	public void clickOnPositions()
	{
		positions.click();
	}
	
	@FindBy(xpath="//span[text()='Funds']")
	private WebElement funds;
	public void clickOnFunds()
	{
		funds.click();
	}
	
	@FindBy(xpath="//span[text()='Apps']")
	private WebElement app;
	public void clickOnApp()
	{
		app.click();
	}
	
	@FindBy(xpath="(//span[@class='tradingsymbol link-chart'])[1]")
	private WebElement sensex;
	public void clickOnSensex()
	{
		sensex.click();
	}
	
	@FindBy(xpath="(//span[@class='tradingsymbol link-chart'])[2]")
	private WebElement nifty;
	public void clickOnNifty()
	{
		nifty.click();
	}
	
	@FindBy(xpath="//span[@class='tradingsymbol']")private List<WebElement> stock;
	@FindBy(xpath="//button[@class='button-blue']")private WebElement buy;
	
	
		
	public void buyStockName(String nameOfStock) 
	 {
		 for(int i=0;i<stock.size();i++) 
		 {
			 WebElement currentStock = stock.get(i);
			 String name = currentStock.getText();
			 if(name.equals(nameOfStock)) 
			 {
				 act.moveToElement(currentStock);
				 act.perform();
				 buy.click();
			 }
		 }
	 }		
	
	@FindBy(xpath="//button[@data-balloon='Chart']")private WebElement chart;
	@FindBy(xpath="//button[@class='button-orange']")private WebElement sell;
	@FindBy(xpath="//button[@class='button-green']")private WebElement add;
	
	public void sellStock(String nameOfStock) throws InterruptedException 
	 {
		 for(int i=0;i<stock.size();i++) 
		 {
			 WebElement currentStock = stock.get(i);
			 String name = currentStock.getText();
			 if(name.equals(nameOfStock)) 
			 {
				 act.moveToElement(currentStock);
				 act.perform();
				 sell.click();
				 Thread.sleep(2000);
			
			 }
		 }
	 }
	
	
	
	@FindBy(xpath="(//span[text()='Sell'])[2]")private WebElement sells;
	public void clickOnSellS()
	{
		sells.click();
	}
	public void clickOnAdd()
	{
		add.click();
	}
	
}

