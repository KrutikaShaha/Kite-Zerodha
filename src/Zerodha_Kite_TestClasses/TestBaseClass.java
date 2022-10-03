package Zerodha_Kite_TestClasses;

import java.io.IOException;
import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;

import Zerodha_Kite_POMClasses.Home_DashBoard_POMPage;
import Zerodha_Kite_POMClasses.TwoPhaseLogInPagePOM;
import Zerodha_Kite_UtilityClasses.TakeScreenShot;



public class TestBaseClass 
{
	WebDriver driver;
	ChromeOptions option;
	@BeforeClass
	public void openingBrowserAndURL() throws InterruptedException, IOException
	{
		ChromeOptions option = new ChromeOptions();
		option.addArguments("--disable-notifications");
		
		System.setProperty("webdriver.chrome.driver",
		         "D:\\Other Softeware\\chromedriver\\chromedriver.exe");

		driver =  new ChromeDriver(option);		
		System.out.println("opening Browser");

		driver.get("https://kite.zerodha.com");		
		System.out.println("Opening URl");
				
		driver.manage().window().maximize();		
		System.out.println("Maximizing Window");
		Thread.sleep(2000);
		
		TakeScreenShot.getScreenShot(driver);
		System.out.println("Taking Screenshot");
		
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
	}

	@BeforeMethod
	public void logINSetUP() throws IOException, InterruptedException
	{
TwoPhaseLogInPagePOM lp=new TwoPhaseLogInPagePOM(driver);
		
		lp.sendUserId();
		System.out.println("Enter User ID");
		
		lp.sendPassword();
		System.out.println("Enter Password");
		
		TakeScreenShot.getScreenShot(driver);
		System.out.println("Taking Screenshot");
		Thread.sleep(2000);
		
		lp.clickOnLOgIN();
		System.out.println("Click on Log In");
		
		lp.sendPin();
		System.out.println("Enter Pin ");
		Thread.sleep(2000);
		
		TakeScreenShot.getScreenShot(driver);
		System.out.println("Taking Screenshot");
		
		lp.clickOnContinue();
		System.out.println("Click on continue");
		Thread.sleep(2000);
		
		TakeScreenShot.getScreenShot(driver);
		System.out.println("Taking Screenshot");
		Thread.sleep(2000);
		
		
	}
	
	@AfterMethod
	public void logOut() throws IOException
	{
		Home_DashBoard_POMPage homepage=new Home_DashBoard_POMPage(driver);
		
		homepage.clickOnProfileDropDown();
		
		System.out.println("Opening Profile Menu");
		
		TakeScreenShot.getScreenShot(driver);
		
		homepage.clickOnLogOut();
		
		System.out.println("Logging Out");
	}
	
	@AfterClass
	public void tearDown()
	{
		driver.close();
		System.out.println("Closing Browser");
	}
	
}
