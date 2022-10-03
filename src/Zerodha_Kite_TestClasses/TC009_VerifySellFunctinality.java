package Zerodha_Kite_TestClasses;

import java.io.IOException;
import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

import Zerodha_Kite_POMClasses.Home_DashBoard_POMPage;
import Zerodha_Kite_POMClasses.TwoPhaseLogInPagePOM;
import Zerodha_Kite_UtilityClasses.TakeScreenShot;

public class TC009_VerifySellFunctinality extends TestBaseClass 
{
	@Test
	public void VerifySellFunctinality() throws InterruptedException
	{
		Home_DashBoard_POMPage hp=new Home_DashBoard_POMPage(driver);
		hp.sendNameSearchBox("ADANIPOWER");
		hp.sellStock("ADANIPOWER");
		//hp.clickOnSellS();
		//hp.clickOnBuyCancel();
	}
}
