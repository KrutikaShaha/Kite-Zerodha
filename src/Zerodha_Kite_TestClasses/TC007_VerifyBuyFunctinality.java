package Zerodha_Kite_TestClasses;

import java.io.IOException;
import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

import Zerodha_Kite_POMClasses.Buy_POM_page;
import Zerodha_Kite_POMClasses.Home_DashBoard_POMPage;
import Zerodha_Kite_POMClasses.TwoPhaseLogInPagePOM;
import Zerodha_Kite_UtilityClasses.TakeScreenShot;

public class TC007_VerifyBuyFunctinality extends TestBaseClass 
{
	@Test
	public void VerifyBuyFunctinality() throws IOException, InterruptedException 
	{
		Home_DashBoard_POMPage hp=new Home_DashBoard_POMPage(driver);
		
		hp.sendNameSearchBox("SBIN");
		System.out.println("Searching SBIN in SearchBox");
		
		//hp.clickOnBuy();
		
		hp.buyStockName("SBIN");
		System.out.println("Click On Buy");
		Thread.sleep(2000);
		
		Buy_POM_page buy=new Buy_POM_page(driver);
		buy.clickOnBuyCancel();
		System.out.println("Click On cancel");
		Thread.sleep(2000);
		
		String ExpectedURl="https://kite.zerodha.com/funds";
		String CurrentURL=driver.getCurrentUrl();
		if(ExpectedURl.equals(CurrentURL))
		{
			System.out.println("Test Case Passed");
		}
		else
		{
			System.out.println("Test Case Failed");
		}
	}
}
