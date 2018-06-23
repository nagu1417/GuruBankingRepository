package testCasesPackage;

import org.testng.ITestResult;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterTest;
import org.testng.annotations.Test;
import org.openqa.selenium.WebDriver;
import org.testng.annotations.Test;

import ConfigPackage.Config;
import basePackage.BaseClass1;
import pagesPackage.GuruLoginPage;
import utilityPackage.ExcelReader;
import utilityPackage.Util;

public class Test1 extends BaseClass1 
{
	Util ut=new Util();
	Test1()throws Exception
	{
		System.out.println("Constructor");
	}
	Config c1=new Config();
	ExcelReader ER1=new ExcelReader();
  @Test
  public void f() throws Exception  
  {
	 // driver.get("http://www.demo.guru99.com/V4/");
	  System.out.println("URL:"+c1.getData("URl"));
	  
	  
	  ER1.readExcelData("F:\\Selenium Workspace\\GuruBanking\\src\\testDataPackage", "TestData.xlsx");
	  System.out.println("CellValue1:"+ER1.getExcelData("Sheet1", 1, 1));
	  System.out.println("CellValue2:"+ER1.getExcelData("Sheet1", 1, 2));
	  
	  driver.get(c1.getData("URl"));
	  Thread.sleep(4000);
	  GuruLoginPage gl=new GuruLoginPage(driver);
	  gl.LoginToApplication(ER1.getExcelData("Sheet1", 1, 1),ER1.getExcelData("Sheet1", 1, 2));
	 // gl.VerifyLoginSuccess("Welcome To Manager's Page of Guru99 Bank");
	  gl.VerifyLoginSuccess("Welcome To Manager's Page of Guru99 Banking page");
	 
  }
 @AfterMethod
  public void afterTest(ITestResult itr) throws Exception 
  {
	if(ITestResult.FAILURE==itr.getStatus())  
	{
		ut.takeascreenshot(driver, itr.getName());
	}
  }
}
