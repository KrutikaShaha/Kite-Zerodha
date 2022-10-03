package Zerodha_Kite_TestClasses;

import java.io.IOException;
import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

import Zerodha_Kite_POMClasses.TwoPhaseLogInPagePOM;
import Zerodha_Kite_UtilityClasses.TakeScreenShot;

public class TC001_VerifyLogInLogOutFuctionality extends TestBaseClass
{
	@Test
	public void VerifyLogInFuctionality() throws IOException, InterruptedException 
	{
		String ExpURL="https://kite.zerodha.com/dashboard";
		String CurURL=driver.getCurrentUrl();
		System.out.println(CurURL);
		if(ExpURL.equals(CurURL))
		{
			System.out.println("Test case Passed");
		}
		else
		{
			System.out.println("Test case Failed");
		}
	}
	
//	@Test
//	public void VerifyLogOutFunctinality() throws IOException 
//	{
//		String EText="Kite - Zerodha's fast and elegant flagship trading platform";
//		String CTitle=driver.getTitle();
//		System.out.println(CTitle);
//		if(CTitle.equals(CTitle))
//		{
//			System.out.println("Test Case Passed");
//		}
//		else
//		{
//			System.out.println("Test Case Failed");
//		}	
//	}

}
