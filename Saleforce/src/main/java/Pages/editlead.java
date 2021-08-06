package Pages;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.pagefactory.AjaxElementLocatorFactory;
import org.openqa.selenium.support.ui.ExpectedCondition;
import org.openqa.selenium.support.ui.ExpectedConditions;



import com.aventstack.extentreports.Status;

import base.Base;
import elements.Convertlead;
import elements.Leadeles;


public class editlead extends Base
{
	public List<WebElement>ec;
	public int x1;
	
	public void clickDelete(String name) throws Exception 
	{
		AjaxElementLocatorFactory af=new AjaxElementLocatorFactory(driver,50);
		PageFactory.initElements(driver,Convertlead.class);
		PageFactory.initElements(driver,Leadeles.class);
		try
		{
			Thread.sleep(5000);
			ExpectedCondition<List<WebElement>> ec=ExpectedConditions.numberOfElementsToBeMoreThan(By.xpath("//tbody//tr//following::th//a"), 0);
			List<WebElement> rows=wait.until(ec);
			int x1=wait.until(ec).size();
			for(WebElement e:rows)
			{
				String dn=e.getText();
				System.out.println(dn);
				if(name.equals(dn))
				{
					wait.until(ExpectedConditions.visibilityOf(e)).click();
					wait.until(ExpectedConditions.visibilityOf(Leadeles.clickdelete)).click();
					wait.until(ExpectedConditions.visibilityOf(Leadeles.clickdeleteper)).click();
				}
			}
			exttest=report.createTest("delete lead");
			exttest.log(Status.PASS, "delete lead test passed");
		}
		catch(Exception ex)
		{
			ec=Leadeles.clicklead;
			exttest=report.createTest("delete lead");
			exttest.log(Status.FAIL, "delete lead test fail");
		}
	}
	public boolean validateDelete()
	{
			ExpectedCondition<List<WebElement>> ec1=ExpectedConditions.numberOfElementsToBeMoreThan(By.xpath("//tbody//tr//following::th//a"), 0);
			List<WebElement> row=wait.until(ec1);
			int y=wait.until(ec1).size();
			System.out.println(y);
			if(y<x1)
			{
				System.out.println("element got deleted");
				exttest=report.createTest("validate delete");
				exttest.log(Status.PASS, "validate delete lead test passed");
				return true;
			}
			else
			{
				exttest=report.createTest("validate delete");
				exttest.log(Status.FAIL, "element is not deleted");
				return false;
			}
		}
	
	public void editPage(String x,String y) throws Exception
	{
		Thread.sleep(5000);
		List<WebElement> e=Leadeles.clicklead;
		for(WebElement e1:e)
		{
			String x2=e1.getText();
			if(x2.equals(x))
			{
				e1.click();
				wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//button[text()='Edit']"))).click();
				ExpectedCondition<WebElement> ec2=ExpectedConditions.visibilityOfElementLocated(By.xpath("//input[@name='lastName']"));
				wait.until(ec2).clear();
				wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//input[@name='lastName']"))).sendKeys(y);
				wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//button[text()='Save']"))).click();
			}
		}
	}
	
	public void covert() throws Exception
	{
		try
		{
			Thread.sleep(5000);
			/*ExpectedCondition<List<WebElement>> ec=ExpectedConditions.numberOfElementsToBeMoreThan(By.xpath("//div[@aria-label='Path Header']//child::ul//descendant::li[position()>2]"), 0);
			List<WebElement> rows=wait.until(ec);
			for(WebElement e:rows)
			{
				wait.until(ExpectedConditions.elementToBeClickable(e)).click();
			}*/
			for(int i=1;i<=3;i++)
			{
				
					Thread.sleep(2000);
					WebElement e1=driver.findElement(By.xpath("//span[text()='Mark Status as Complete']//parent::button"));
					driver.executeScript("arguments[0].click();",e1);
			}
			wait.until(ExpectedConditions.elementToBeClickable(Convertlead.convert)).click();
			wait.until(ExpectedConditions.elementToBeClickable(Convertlead.gotoelements)).click();
			exttest=report.createTest("convert to contact");
			exttest.log(Status.PASS, "convert to contact test passed");
		}
		catch(Exception ex)
		{
			System.out.println(ex.getMessage());
			exttest=report.createTest("convert to contact");
			exttest.log(Status.FAIL, "convert to contact test passed");
		}
		
	}
}
