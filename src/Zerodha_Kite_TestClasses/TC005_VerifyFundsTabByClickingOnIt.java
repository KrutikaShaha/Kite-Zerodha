package Zerodha_Kite_TestClasses;

import java.io.IOException;
import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

import Zerodha_Kite_POMClasses.Home_DashBoard_POMPage;
import Zerodha_Kite_POMClasses.TwoPhaseLogInPagePOM;
import Zerodha_Kite_UtilityClasses.TakeScreenShot;

public class TC005_VerifyFundsTabByClickingOnIt extends TestBaseClass
{
	@Test
	public void VerifyFundsTabByClickingOnIt() throws InterruptedException, IOException 
	{
		Home_DashBoard_POMPage home=new Home_DashBoard_POMPage(driver);
		
		home.clickOnFunds();
		System.out.println("Clicking Funds Tabs");
		
		TakeScreenShot.getScreenShot(driver);
		System.out.println("Taking Screenshot");
		
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
