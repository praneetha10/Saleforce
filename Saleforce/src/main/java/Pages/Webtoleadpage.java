package Pages;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.Toolkit;
import java.awt.datatransfer.Clipboard;
import java.awt.datatransfer.DataFlavor;
import java.awt.datatransfer.StringSelection;
import java.awt.event.KeyEvent;
import java.util.ArrayList;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedCondition;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;

import com.aventstack.extentreports.Status;

import base.Base;
import elements.Webtoleadelem;

public class Webtoleadpage extends Base
{
	public void clicksetup() throws Exception
	{
		PageFactory.initElements(driver,Webtoleadelem.class);
		
		wait.until(ExpectedConditions.elementToBeClickable(Webtoleadelem.setup)).click();
		Thread.sleep(4000);
		Robot r=new Robot();
		for(int i=0;i<=0;i++)
		{
			r.keyPress(KeyEvent.VK_DOWN);
			r.keyRelease(KeyEvent.VK_DOWN);
			Thread.sleep(3000);
			r.keyPress(KeyEvent.VK_ENTER);
			r.keyRelease(KeyEvent.VK_ENTER);
		}
	}
	public boolean displaySetupHome()
	{
		try
    	{
    		Webtoleadelem.displaysetup.isDisplayed();
    		exttest=report.createTest("displaySetupHome");
			exttest.log(Status.PASS, "entered setupHome");
			return true;
    	}
    	catch(Exception ex)
    	{
    		exttest=report.createTest("displaySetupHome");
			exttest.log(Status.FAIL,"Entered setupHome page");
			return false;
    	}
	}
	public void searchWebtolead(String x) throws Exception 
	{
		Thread.sleep(3000);
		Set<String> s1=driver.getWindowHandles();
		ArrayList<String>a=new ArrayList<String>(s1);
		driver.switchTo().window(a.get(1));
		Webtoleadelem.find.sendKeys(x);
	}
	public void clickWebtoLead() throws Exception
	{
		
		Webtoleadelem.webtolead.click();
	}
	public boolean dispalyedHomepage()
	{
		try
		{
			Webtoleadelem.webtoleadhome.isDisplayed();
			exttest=report.createTest("setupHome");
			exttest.log(Status.PASS, "Entered setup homepage");
			return true;
		}
		catch(Exception ex)
		{
			exttest=report.createTest("setupHome");
			exttest.log(Status.FAIL, "Entered setup homepage");
			return false;
		}
	}
	public void edit() throws Exception
	{
		driver.switchTo().frame(0);
		Thread.sleep(10000);
		Webtoleadelem.edit.click();
		driver.switchTo().defaultContent();
	}
	public boolean enableWebtoLead()
	{
		try
		{
			driver.switchTo().frame(0);
			Thread.sleep(10000);
			Webtoleadelem.enablelead.isSelected();
			
			
			
			exttest=report.createTest("Selected Web-to-Lead  is not selected");
			exttest.log(Status.PASS, "Selected Web-To-Lead");
			return true;
		}
		catch(Exception ex)
		{
			exttest=report.createTest("enabled Web-To-Lead is not selected");
			exttest.log(Status.FAIL, "not selected Web to lead");
			return false;
		}
	}
	public void saveEdits() throws Exception
	{
		Thread.sleep(5000);
		Webtoleadelem.savelead.click();
		driver.switchTo().defaultContent();
	}
	public void click_CreateEdit() throws Exception
	{
		Thread.sleep(5000);
		driver.switchTo().frame(0);
		Webtoleadelem.clickcreatelead.click();
		Thread.sleep(5000);
		driver.switchTo().frame(0);
		WebElement e11=driver.findElement(By.xpath("//label[text()='Available Fields']"));
		driver.executeScript("arguments[0].scrollIntoView(true);", e11);
	}
	public boolean displayedCreateForm()
	{
		try
		{
			Webtoleadelem.displayedcreateform.isDisplayed();
			exttest=report.createTest("Selected Web-to-Lead  is not selected");
			exttest.log(Status.PASS, "Selected Web-To-Lead");
			return true;
		
		}
		catch(Exception ex)
		{
			exttest=report.createTest("Selected Web-to-Lead  is not selected");
			exttest.log(Status.FAIL, "Selected Web-To-Lead");
			return false;
		}
	}
	public void selectElements() throws Exception
	{
		Thread.sleep(5000);
		WebElement e1=driver.findElement(By.name("selectedFields_select_0"));
		Select s5=new Select(e1);
		Thread.sleep(5000);
		s5.selectByIndex(0);
		s5.selectByIndex(4);
		s5.selectByIndex(5);
		s5.selectByIndex(6);
		s5.selectByIndex(7);
		s5.selectByIndex(8);
		Thread.sleep(5000);
		Webtoleadelem.addele.click();
		Thread.sleep(5000);
		s5.selectByIndex(6);
		for(int i=0;i<=6;i++)
		{
			Webtoleadelem.upele.click();
		}
		Thread.sleep(7000);
		s5.selectByIndex(5);
		for(int i=0;i<=5;i++)
		{
			Webtoleadelem.downele.click();
		}
		Thread.sleep(7000);
		WebElement e9=driver.findElement(By.name("selectedFields_select_1"));
		e9.click();
		Select s6=new Select(e9);
		s6.selectByIndex(8);
		Webtoleadelem.revmoveele.click();
	}
		public boolean capchaenable() throws Exception
		{
			try
			{
				Thread.sleep(8000);
				WebElement e7=Webtoleadelem.capchaenable;
				if(e7.isSelected())
				{
					e7.click();
					exttest=report.createTest("capchaenable test passed");
					exttest.log(Status.PASS, "capchaenable test passed");
					return true;
				}
			}
			catch(Exception ex)
			{
				exttest=report.createTest("capchaenable test failed");
				exttest.log(Status.PASS, "capchaenable test failed");
			}
			return false;
		}
		public void clickGenerate() throws Exception
		{
			Thread.sleep(10000);
			driver.findElement(By.xpath(" //input[@type='submit' and @value='Generate']")).submit();
			Thread.sleep(10000);
			driver.switchTo().defaultContent();
		}
		public void GenerateFinish() throws Exception
		{
			driver.switchTo().frame(0);
			WebElement e1=driver.findElement(By.xpath("//h2[text()='Create a Web-to-Lead Form']"));
			driver.executeScript("arguments[0].scrollIntoView(true);", e1);
			Thread.sleep(10000);
			WebElement e=Webtoleadelem.textarea;
			String s8=e.getText();
			Thread.sleep(10000);
			Runtime.getRuntime().exec("C:\\Windows\\System32\\notepad.exe");
			StringSelection x=new StringSelection(s8);
			Toolkit.getDefaultToolkit().getSystemClipboard().setContents(x, null);
			Robot r=new Robot();
			Thread.sleep(5000);
			r.keyPress(KeyEvent.VK_CONTROL);
			r.keyPress(KeyEvent.VK_V);
			r.keyRelease(KeyEvent.VK_V);
			r.keyRelease(KeyEvent.VK_CONTROL);
			Thread.sleep(5000);
			String z=(String)Toolkit.getDefaultToolkit().getSystemClipboard().getData(DataFlavor.stringFlavor);
		}
		public void saveData() throws Exception
		{
			Robot r=new Robot();
			r.keyPress(KeyEvent.VK_CONTROL);
			r.keyPress(KeyEvent.VK_S);
			r.keyRelease(KeyEvent.VK_S);
			r.keyRelease(KeyEvent.VK_CONTROL);
			Thread.sleep(5000);
			r.keyPress(KeyEvent.VK_ENTER);
			r.keyRelease(KeyEvent.VK_ENTER);
			Thread.sleep(5000);
			String text = "Test2";
			StringSelection x=new StringSelection(text);
			Toolkit.getDefaultToolkit().getSystemClipboard().setContents(x, null);
			String z=(String)Toolkit.getDefaultToolkit().getSystemClipboard().getData(DataFlavor.stringFlavor);
			System.out.println(z);
			r.keyPress(KeyEvent.VK_CONTROL);
			r.keyPress(KeyEvent.VK_V);
			r.keyRelease(KeyEvent.VK_V);
			r.keyRelease(KeyEvent.VK_CONTROL);
			Thread.sleep(5000);
			r.keyPress(KeyEvent.VK_ENTER);
			r.keyRelease(KeyEvent.VK_ENTER);
			Thread.sleep(5000);
			r.keyPress(KeyEvent.VK_ALT);
			r.keyPress(KeyEvent.VK_F4);
		    r.keyRelease(KeyEvent.VK_F4);
		    r.keyRelease(KeyEvent.VK_ALT);
		}
		public void clickFinish() throws Exception
		{
			Thread.sleep(8000);
			driver.findElement(By.xpath("//tbody//tr//td//input[@title='Finished']")).click();
			driver.switchTo().defaultContent();
		}
}
