package Zerodha_Kite_TestClasses;

import java.io.IOException;
import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

import Zerodha_Kite_POMClasses.Home_DashBoard_POMPage;
import Zerodha_Kite_POMClasses.TwoPhaseLogInPagePOM;
import Zerodha_Kite_UtilityClasses.TakeScreenShot;

public class TC003_VerifyHoldingsTagByClickingOnIt extends TestBaseClass
{
	@Test
	public void VerifyHoldingsTagByClickingOnIt() throws IOException, InterruptedException 
	{
		Home_DashBoard_POMPage home=new Home_DashBoard_POMPage(driver);
		
		home.clickOnHoldings();
		System.out.println("Clicking Holdings Tabs");
		String ExpectedURL="https://kite.zerodha.com/holdings";
		String CurrentURL=driver.getCurrentUrl();
		if(ExpectedURL.equals(CurrentURL))
		{
			System.out.println("Test Case Passed");
		}
		else
		{
			System.out.println("Test Case Failed");
		}
		TakeScreenShot.getScreenShot(driver);
		System.out.println("Taking Screenshot");
	
	}

}
