package Zerodha_Kite_TestClasses;

import org.testng.annotations.Test;

import Zerodha_Kite_POMClasses.Buy_POM_page;
import Zerodha_Kite_POMClasses.Home_DashBoard_POMPage;

@Test
public class TC011_VerifyWePlacedCoverOrderOnlyStopLossFieldEnabled extends TestBaseClass
{

	public void VerifyWePlacedCoverOrderOnlyStopLossFieldEnabled() throws InterruptedException
	{
	Home_DashBoard_POMPage hp=new Home_DashBoard_POMPage(driver);
	
	hp.sendNameSearchBox("SBIN");
	System.out.println("Searching SBIN in SearchBox");
	
	hp.buyStockName("SBIN");
	System.out.println("Click On Buy");
	Thread.sleep(2000);
	
	Buy_POM_page buy=new Buy_POM_page(driver);
	buy.clickOnCover();
	Thread.sleep(2000);
	boolean ExpectedResult=true;
	boolean Currentresult=buy.stiplossTriggerPrizeIsEnable();
	System.out.println("Stop Loss Triger Field is Enabled "+Currentresult);
	if(ExpectedResult==Currentresult)
	{
		System.out.println("Test case Passed");
	}
	else
	{
		System.out.println("Test Case Failed");
	}
	
	}
	
}
