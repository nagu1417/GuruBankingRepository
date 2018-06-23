package basePackage;

import org.testng.annotations.Test;
import org.testng.annotations.BeforeTest;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.util.Properties;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeClass;

public class BaseClass1 {
	 public WebDriver driver;
	
  @Test
  public void f() throws Exception {
  }
  @BeforeClass
  public void beforeTest() throws Exception 
  {
	  	System.out.println("Launching Chrome");	
		System.setProperty("webdriver.chrome.driver","F:\\Selenium downloads\\chromedriver_win32 (1)\\chromedriver.exe");
		System.out.println("Property set");
		driver= new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		driver.manage().window().maximize();
	  
  }

  @AfterClass
  public void afterTest() {
	  //driver.close();
  }

}
