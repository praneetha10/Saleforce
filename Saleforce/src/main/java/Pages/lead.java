package Pages;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.NoSuchElementException;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.sikuli.script.Screen;

import com.aventstack.extentreports.Status;

import base.Base;
import elements.Leadeles;
import elements.Login;

public class lead extends Base
{
	
	public lead()
	{
		PageFactory.initElements(driver,Leadeles.class);
	}
	public void click_Lead() throws Exception
	{
		try
		{
			JavascriptExecutor js=(JavascriptExecutor)driver;
			js.executeScript("arguments[0].click();",Leadeles.lead);
			exttest=report.createTest("click lead");
			exttest.log(Status.PASS, "click lead");
		}
		catch (Exception ex)
		{
			exttest=report.createTest("no banner");
			exttest.log(Status.FAIL,ex.getMessage());
		}
	}
	public void click_New() throws Exception
	{
		Thread.sleep(2000);
		wait.until(ExpectedConditions.elementToBeClickable(Leadeles.New)).click();
		
	}
	public boolean new_LeadDispalyed()
	{
		try
		{
			Leadeles.newleadpage.isDisplayed();
			exttest=report.createTest("new_leadDisplaypage");
			exttest.log(Status.PASS, "new lead Displayed");
			return true;
		}
		catch(Exception ex)
		{
			exttest=report.createTest("new_LeadDispaly");
			exttest.log(Status.FAIL,"Entered new Lead");
			return false;
		}
	}
	
	
	
}
