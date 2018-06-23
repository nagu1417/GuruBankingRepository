package pagesPackage;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.testng.Assert;

public class GuruLoginPage {
	WebDriver driver;
	
	By Username=By.name("uid");
	By Password=By.name("password");
	By Login_Button=By.name("btnLogin");
	By LoginSuccesText=By.xpath("//marquee[@class='heading3']");
	
	public GuruLoginPage(WebDriver d1)
	{
		driver=d1;
	}
	
	public void LoginToApplication(String userid,String pid)
	{
		driver.findElement(Username).sendKeys(userid);
		driver.findElement(Password).sendKeys(pid);
		driver.findElement(Login_Button).click();
	}
	public void VerifyLoginSuccess(String text)
	{
		String strText=driver.findElement(LoginSuccesText).getText();
		System.out.println("strText:"+strText);
		/*if(strText.equalsIgnoreCase("text"))
		{
			System.out.println("Login Succesful");
		}
		else
		{
			System.out.println("Login failed");
		}*/
		
		Assert.assertEquals(strText, text, "Text should match");
	}
}
