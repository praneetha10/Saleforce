package Pages;

import java.util.ArrayList;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.PageFactory;

import com.aventstack.extentreports.Status;

import base.Base;
import elements.Dropdownsele;

public class Dropdowns extends Base
{
	public ArrayList<String> actual;
	public ArrayList<String> expected;
	
	
	public ArrayList<String> validateIndustryActual()
	{
		PageFactory.initElements(driver, Dropdownsele.class);
		actual =new ArrayList<String>(); 
		WebElement e1=driver.findElement(By.xpath("//label[text()='Company']"));
		driver.executeScript("arguments[0].scrollIntoView(true);", e1);
		WebElement dd=Dropdownsele.dropdown;
		JavascriptExecutor js=(JavascriptExecutor)driver;
		js.executeScript("arguments[0].click();",dd);
		List<WebElement>items=dd.findElements(By.xpath("//span[@class='slds-media__body']/span[text()]"));
		for(WebElement item:items)
		{
			actual.add((String)driver.executeScript("return arguments[0].textContent;", item));
			
		}
		JavascriptExecutor js7=(JavascriptExecutor)driver;
		js7.executeScript("arguments[0].click();",dd);
		exttest=report.createTest("Dropdown");
		exttest.log(Status.PASS, "Dropdown industry actual values");
		return actual;
		
	}
	
	public ArrayList<String> validateIndustryExpected()
	{
		expected =new ArrayList<String>();
		WebElement dd=Dropdownsele.dropdown;
		JavascriptExecutor js4=(JavascriptExecutor)driver;
		js4.executeScript("arguments[0].click();",dd);
		List<WebElement>items=dd.findElements(By.xpath("//span[@class='slds-media__body']/span[text()]"));
		JavascriptExecutor js5=(JavascriptExecutor)driver;
		js5.executeScript("arguments[0].click();",dd);
		for(WebElement item:items)
		{
			try
			{
				JavascriptExecutor js6=(JavascriptExecutor)driver;
				js6.executeScript("arguments[0].click();",dd);
				Thread.sleep(2000);
				if(item.isDisplayed())
				{
					Thread.sleep(4000);
					expected.add(item.getText());
					JavascriptExecutor js7=(JavascriptExecutor)driver;
					js7.executeScript("arguments[0].click();",item);
				}
				exttest=report.createTest("Dropdown");
				exttest.log(Status.PASS, "Dropdown Expected values");
				
			}
			catch(Exception ex)
			{
				exttest=report.createTest("Dropdown");
				exttest.log(Status.FAIL, "Dropdown Expected values");
			}
		
		}
		return expected;
	}
	//Lead source dropdown
	public ArrayList<String> validateLeadSourceddActual()
	{
		ArrayList<String>li=new ArrayList<String>();
		WebElement e1=Dropdownsele.leadsource;
		JavascriptExecutor js=(JavascriptExecutor)driver;
		js.executeScript("arguments[0].click();",e1);
		List<WebElement> e5=e1.findElements(By.xpath("//child::span[@class='slds-media__body']/span"));
		for(WebElement e4:e5)
		{
			actual.add((String)driver.executeScript("return arguments[0].textContent;", e4));
		}
		JavascriptExecutor js5=(JavascriptExecutor)driver;
		js5.executeScript("arguments[0].click();",e1);
		exttest=report.createTest("Dropdown");
		exttest.log(Status.PASS, "Dropdown actual values");
		return li;
	}
	
	public ArrayList<String> validateLeadSourceExpected()
	{
		ArrayList<String>l2=new ArrayList<String>();
		WebElement e1=Dropdownsele.leadsource;
		JavascriptExecutor js4=(JavascriptExecutor)driver;
		js4.executeScript("arguments[0].click();",e1);
		List<WebElement>items=e1.findElements(By.xpath("//span[@class='slds-media__body']/span[text()]"));
		e1.click();
		for(WebElement item:items)
		{
			try
			{
				JavascriptExecutor js7=(JavascriptExecutor)driver;
				js7.executeScript("arguments[0].click();",e1);
				Thread.sleep(2000);
				if(item.isDisplayed())
				{
					Thread.sleep(4000);
					expected.add(item.getText());
					JavascriptExecutor js=(JavascriptExecutor)driver;
					js.executeScript("arguments[0].click();",item);
				}
				
			}
			catch(Exception ex)
			{
				System.out.println(ex.getMessage());
			}
		
		}
		return l2;
		
	}
	

}
