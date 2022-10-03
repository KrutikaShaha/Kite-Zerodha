package Zerodha_Kite_TestClasses;

import org.testng.annotations.Test;

import Zerodha_Kite_POMClasses.Buy_POM_page;
import Zerodha_Kite_POMClasses.Home_DashBoard_POMPage;

public class TC010_VerifyQuantityFieldShouldByDefaultOne extends TestBaseClass
{
	
	@Test
	public void VerifyQuantityFieldShouldByDefaultOne() throws InterruptedException
	{
		Home_DashBoard_POMPage home=new Home_DashBoard_POMPage(driver);
		
		home.sendNameSearchBox("HDFC");
		Thread.sleep(2000);
		System.out.println("Searched HDFC");
		
		home.buyStockName("HDFC");
		Thread.sleep(2000);
		System.out.println("Clicked On Share Buy Button");
		
		Buy_POM_page buy=new Buy_POM_page(driver);
		String ExpectedQuantity="1";
		String CurrentQuantity=buy.checkQuntityBuy();
		//Thread.sleep(2000);
		System.out.println("Buy Deafult Quantity "+CurrentQuantity);
		
		if(ExpectedQuantity.equals(CurrentQuantity))
		{
			System.out.println("Test Case Passed");
		}
		else
		{
			System.out.println("Test Case Failed");
		}
		
		
//		buy.sendQuntity();
//		
//		String Quantity1=buy.checkQuntityBuy();
//	
//		System.out.println("Buy Quantity after sending 2 Quantity "+Quantity1);

		
	}

}
