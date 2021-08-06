package Pages;

import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;

import com.aventstack.extentreports.Status;

import base.Base;
import elements.Login;

public class Siginp extends Base
{
	//Operational methods
	public void openBrowser()
	{
		//Launch Site
		PageFactory.initElements(driver,Login.class);
		driver.get(p.getProperty("url"));
		driver.manage().window().maximize();
	}
	public void sigIn() throws Exception
	{
		Login.userid.sendKeys(p.getProperty("username"));
		Login.pwd.sendKeys(p.getProperty("password"));
		Login.login.click();
		exttest=report.createTest("Homepage");//create title
		exttest.log(Status.PASS, "Login passed");
		takeScreenShot("Loginfunction.png");
	}
	public boolean validate_homePage() throws Exception
	{
		try
		{
			Login.homepage.isDisplayed();
			return true;
		}
		catch(Exception ex)
		{
			exttest=report.createTest("Loged in");
			exttest.log(Status.FAIL,"HomePage visiable");
			return false;
		}
	}
	
}
