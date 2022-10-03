package Zerodha_Kite_UtilityClasses;

import java.io.File;
import java.io.IOException;
import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Date;

import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.io.FileHandler;

public class TakeScreenShot 
{
	public static void getScreenShot(WebDriver driver) throws IOException
	{
		Date current =new Date();
		DateFormat dt=new SimpleDateFormat("MM-dd-yy && HH-mm-ss");
		String date=dt.format(current);
		
		TakesScreenshot ts=(TakesScreenshot)driver;
		File source=ts.getScreenshotAs(OutputType.FILE);
		File desti=new File("D:\\SeleniumProccessingData\\Zerodha\\Testing"+date+".png");
		FileHandler.copy(source, desti);
	}
}
