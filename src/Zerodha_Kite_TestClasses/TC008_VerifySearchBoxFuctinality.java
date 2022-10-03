package Zerodha_Kite_TestClasses;

import java.io.IOException;
import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

import Zerodha_Kite_POMClasses.Home_DashBoard_POMPage;
import Zerodha_Kite_POMClasses.TwoPhaseLogInPagePOM;
import Zerodha_Kite_UtilityClasses.TakeScreenShot;

public class TC008_VerifySearchBoxFuctinality extends TestBaseClass
{
	@Test
	public void VerifySearchBoxFuctinalityBySearchingSBIN() throws IOException, InterruptedException
	{
		Home_DashBoard_POMPage home=new Home_DashBoard_POMPage(driver);
		
		home.sendNameSearchBox("SBIN");
		System.out.println("Send SBIN in search Box");
		Thread.sleep(2000);
		
		TakeScreenShot.getScreenShot(driver);
		System.out.println("Taking Screenshot");
		
		home.clickOnProfileDropDown();
		System.out.println("Clicking profile menu");
		Thread.sleep(2000);
		
		TakeScreenShot.getScreenShot(driver);
		System.out.println("Taking Screenshot");
	}

}
