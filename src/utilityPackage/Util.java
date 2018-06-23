package utilityPackage;

import java.io.File;
import java.io.IOException;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;

public class Util {
	
	public void takeascreenshot(WebDriver driver,String fileName) throws Exception
	{
		TakesScreenshot ts=(TakesScreenshot)driver;
		File f1=ts.getScreenshotAs(OutputType.FILE);
		File destFile=new File("F:\\Selenium Workspace\\GuruBanking\\Screenshots\\"+fileName+".jpg");
		FileUtils.copyFile(f1,destFile);
	}

}
