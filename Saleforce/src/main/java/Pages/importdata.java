package Pages;

import java.awt.HeadlessException;
import java.awt.Robot;
import java.awt.Toolkit;
import java.awt.datatransfer.DataFlavor;
import java.awt.datatransfer.StringSelection;
import java.awt.datatransfer.UnsupportedFlavorException;
import java.awt.event.KeyEvent;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;



import base.Base;
import elements.importdataele;

public class importdata extends Base
{
	public void click_import() throws Exception
	{
		PageFactory.initElements(driver,importdataele.class);
		lead le=new lead();
		Set<String> s1=driver.getWindowHandles();
		ArrayList<String>a=new ArrayList<String>(s1);
		driver.switchTo().window(a.get(0));
		le.click_Lead();
		importdataele.clickimport.click();
	}
	public void importcsv() throws Exception
	{
		Thread.sleep(10000);
		driver.switchTo().frame(0);
		Thread.sleep(9000);
		WebElement e=driver.findElement(By.xpath("//a[text()='Standard objects']"));
		driver.executeScript("arguments[0].scrollIntoView(true);",e);
		Thread.sleep(5000);
		wait.until(ExpectedConditions.elementToBeClickable(importdataele.clickleads)).click();
		Thread.sleep(3000);
		wait.until(ExpectedConditions.elementToBeClickable(importdataele.newrecord)).click();
		Thread.sleep(3000);
		wait.until(ExpectedConditions.elementToBeClickable(importdataele.csv)).click();
		Thread.sleep(3000);
		WebElement e1=driver.findElement(By.xpath("//span[text()='Drag CSV file here to upload']"));
		driver.executeScript("arguments[0].scrollIntoView(true);",e1);
		Thread.sleep(3000);
		wait.until(ExpectedConditions.elementToBeClickable(importdataele.choosefile)).click();
	}
	public void senddata() throws Exception
	{
		Robot r=new Robot();
		Thread.sleep(5000);
		String fp="C:\\Users\\prane\\git\\salesforce\\Saleforce\\src\\test\\resources\\Leaddata";
		//take text 
		StringSelection ss=new StringSelection(fp); 
		//copy to clipboard
		Toolkit.getDefaultToolkit().getSystemClipboard().setContents(ss, null);
		String z=(String)Toolkit.getDefaultToolkit().getSystemClipboard().getData(DataFlavor.stringFlavor);
		r.keyPress(KeyEvent.VK_CONTROL);
		r.keyPress(KeyEvent.VK_V);
		r.keyRelease(KeyEvent.VK_V);
		r.keyRelease(KeyEvent.VK_CONTROL);
		Thread.sleep(3000);
		r.keyPress(KeyEvent.VK_TAB);
		r.keyRelease(KeyEvent.VK_TAB);
		for(int i=1;i<=2;i++)
		{
			r.keyPress(KeyEvent.VK_DOWN);
			r.keyRelease(KeyEvent.VK_DOWN);
		}
		r.keyPress(KeyEvent.VK_ENTER);
		r.keyRelease(KeyEvent.VK_ENTER);
		Thread.sleep(3000);
		r.keyPress(KeyEvent.VK_TAB);
		r.keyRelease(KeyEvent.VK_TAB);
		r.keyPress(KeyEvent.VK_ENTER);
		r.keyRelease(KeyEvent.VK_ENTER);
		driver.switchTo().defaultContent();
	}
	public void clicknext() throws Exception
	{
		driver.switchTo().frame(0);
		importdataele.clicknext.click();
		driver.switchTo().defaultContent();
		Thread.sleep(3000);
		driver.switchTo().frame(0);
		importdataele.editfieldclick.click();
		driver.switchTo().defaultContent();
		Thread.sleep(3000);
		driver.switchTo().frame(0);
		importdataele.startimport.click();
		driver.switchTo().defaultContent();
		Thread.sleep(5000);
		driver.switchTo().frame(0);
		importdataele.clickok.click();
		driver.switchTo().defaultContent();
		
	}
}
