package Pages;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedCondition;
import org.openqa.selenium.support.ui.ExpectedConditions;

import com.aventstack.extentreports.Status;

import base.Base;
import elements.Leadeles;

public class newlead extends Base
{
	public void newLead_Dropdown(String y) throws Exception
	{
		PageFactory.initElements(driver,Leadeles.class);
		wait.until(ExpectedConditions.elementToBeClickable(Leadeles.salitation)).click();
		List<WebElement>e2=driver.findElements(By.xpath("//span[@class='slds-media__body']/span[text()]"));
		driver.executeScript("arguments[0].scrollIntoView(true);", Leadeles.leadowner);
		for(WebElement r:e2)
		{
			
			String x=r.getText();
			if(x.equalsIgnoreCase(y))
			{
				r.click();
			}
		}
		exttest=report.createTest("newlead dropdown slaution");
		exttest.log(Status.PASS, "entered slaution value");
	}
	public void LastName(String y)
	{
		try
		{
			wait.until(ExpectedConditions.visibilityOf(Leadeles.lastname)).sendKeys(y);
			exttest=report.createTest("enter lastname in newleadpage");
			exttest.log(Status.PASS, "lastname in newleadpage test passed");
		}
		catch(Exception ex)
		{
			exttest=report.createTest("enter lastname in newleadpage");
			exttest.log(Status.FAIL,"lastname in newleadpage test failed");
		}
	}
	public void companyName(String y)
	{
		try
		{
			wait.until(ExpectedConditions.visibilityOf(Leadeles.company)).sendKeys(y);
			exttest=report.createTest("enter companyname in newleadpage");
			exttest.log(Status.PASS, "companyname testpassed");
		}
		catch(Exception ex)
		{
			exttest=report.createTest("enter companyname in newleadpage");
			exttest.log(Status.FAIL,"companyname in newlead testfailed");
		}
	}
	public void industry_DropDown(String y) throws Exception
	{
		try
		{
			WebElement e1=wait.until(ExpectedConditions.presenceOfElementLocated(By.xpath("(//input[contains(@aria-owns,'dropdown-element')])[4]//parent::div//following-sibling::div")));
			JavascriptExecutor js=(JavascriptExecutor)driver;
			js.executeScript("arguments[0].click();",e1);
			List<WebElement>ele=e1.findElements(By.xpath("//span[@class='slds-media__body']/span[text()]"));
			System.out.println(ele.size());
			for(WebElement e:ele)
			{
				String x=(String)driver.executeScript("return arguments[0].textContent;", e);
				x=x.trim();
				if(x.equalsIgnoreCase(y))
				{
					JavascriptExecutor js1=(JavascriptExecutor)driver;
					js1.executeScript("arguments[0].click();",e);
				}
			}
			exttest=report.createTest("industry dropdown in newlead");
			exttest.log(Status.PASS, "industrydropdown testpassed");
		}
		catch(Exception ex)
		{
			exttest=report.createTest("industry dropdown in newlead");
			exttest.log(Status.PASS, "industrydropdown testfailed");
		}
		
	}
	public void clickSave() throws Exception
	{
		wait.until(ExpectedConditions.elementToBeClickable(Leadeles.clicksave)).click();
	}
	public boolean createLeadPage()
	{
		try
		{
			ExpectedCondition<WebElement>ec=ExpectedConditions.visibilityOf(Leadeles.enteredleadpage);
			exttest=report.createTest("new_leadDisplaypage");
			exttest.log(Status.PASS, "entered new lead page");
			return true;
		}
		catch(Exception ex)
		{
			exttest=report.createTest("new_lead_page");
			exttest.log(Status.FAIL,"Entered new lead page");
			return false;
		}
	}
}
