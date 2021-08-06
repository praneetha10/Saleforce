package Dummy;

import java.awt.Robot;
import java.awt.Toolkit;
import java.awt.datatransfer.DataFlavor;
import java.awt.datatransfer.StringSelection;
import java.awt.event.KeyEvent;
import java.time.Duration;
import java.util.ArrayList;
import java.util.List;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.interactions.Action;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.FluentWait;
import org.openqa.selenium.support.ui.Select;
import org.sikuli.script.Screen;

import elements.Convertlead;
import elements.Leadeles;
import elements.Webtoleadelem;
import io.github.bonigarcia.wdm.WebDriverManager;

public class Dummy4 {

	public static void main(String[] args) throws Exception
	{
		ChromeOptions co=new ChromeOptions();
		String[] s=new String[] {"enable-automation"};
		co.setExperimentalOption("excludeSwitches",s);
		co.addArguments("--disable-notifications");
		WebDriverManager.chromedriver().setup();
		ChromeDriver driver=new ChromeDriver(co);
		driver.manage().window().maximize();
		FluentWait<ChromeDriver> wait=new FluentWait<ChromeDriver>(driver);
		wait.withTimeout(Duration.ofSeconds(20));
		wait.pollingEvery(Duration.ofMillis(1000));
		driver.get("https://login.salesforce.com/?locale=eu");
		driver.findElement(By.xpath("//input[@name='username']")).sendKeys("praneetha.mullapudi-cgwp@force.com");
		driver.findElement(By.xpath("//input[@id='password']")).sendKeys("Pranee.10");
		driver.findElement(By.xpath("//input[@id='Login']")).click();
		
		try
		{
			Thread.sleep(10000);
			driver.findElement(By.xpath("//*[name()='svg' and @data-key='setup']")).click();
			Thread.sleep(10000);
			Robot r=new Robot();
			for(int i=0;i<=0;i++)
			{
				r.keyPress(KeyEvent.VK_DOWN);
				r.keyRelease(KeyEvent.VK_DOWN);
				Thread.sleep(3000);
				r.keyPress(KeyEvent.VK_ENTER);
				r.keyRelease(KeyEvent.VK_ENTER);
			}
			Thread.sleep(10000);
			Set<String> s1=driver.getWindowHandles();
			ArrayList<String>a=new ArrayList<String>(s1);
			driver.switchTo().window(a.get(1));
			Thread.sleep(10000);
			WebElement e=driver.findElement(By.xpath("//input[@placeholder='Quick Find']"));
			e.sendKeys("web-to-lead");
			Thread.sleep(10000);
			List<WebElement>ec=driver.findElements(By.xpath("//ul//descendant::li//child::a[text()]/mark"));
			for(WebElement e1:ec)
			{
				e1.click();
			}
			Thread.sleep(12000);
			driver.switchTo().frame(0);
		
			Thread.sleep(6000);
			WebElement e2=driver.findElement(By.xpath("//tbody/tr/descendant::td[@id='topButtonRow']//input[@title='Edit']"));
			e2.click();
			driver.switchTo().defaultContent();
			Thread.sleep(6000);
			
			driver.switchTo().frame(0);
			WebElement e3=driver.findElement(By.xpath("//input[@id='p1']"));
			if(e3.isSelected())
			{
				System.out.println("web-to-lead enabled");
			}
			else
			{
				System.out.println("web-to-lead is diabled");
				e3.click();
			}
			Thread.sleep(10000);
			driver.findElement(By.xpath("(//input[@title='Save'])[1]")).click();
			driver.switchTo().defaultContent();
			Thread.sleep(10000);
			
		    driver.switchTo().frame(0);
		    
			driver.findElement(By.xpath("//input[@title='Create Web-to-Lead Form']")).click();
			Thread.sleep(10000);
			driver.switchTo().frame(0);
			WebElement e11=driver.findElement(By.xpath("//label[text()='Available Fields']"));
			driver.executeScript("arguments[0].scrollIntoView(true);", e11);
			Thread.sleep(10000);
			WebElement e1=driver.findElement(By.name("selectedFields_select_0"));
			Thread.sleep(10000);
			Select s5=new Select(e1);
			Thread.sleep(10000);
			s5.selectByIndex(0);
			s5.selectByIndex(4);
			s5.selectByIndex(5);
			s5.selectByIndex(6);
			s5.selectByIndex(7);
			s5.selectByIndex(8);
			Thread.sleep(10000);
			driver.findElement(By.xpath("//img[@title='Add']/parent::a")).click();
			
			s5.selectByIndex(6);
			for(int i=0;i<=6;i++)
			{
				driver.findElement(By.xpath("//img[@title='Up']/parent::a")).click();
			}
			s5.selectByIndex(8);
			driver.findElement(By.xpath("//img[@title='Down']/parent::a")).click();
			s5.selectByIndex(6);
			driver.findElement(By.xpath("//img[@title='Remove']/parent::a")).click();
			driver.switchTo().defaultContent();
			Thread.sleep(5000);
		}
		catch(Exception ex)
		{
			System.out.println(ex.getMessage());
		}
		
		Thread.sleep(10000);
		WebElement e7=driver.findElement(By.xpath("//input[@id='captchaEnable']"));
		if(e7.isSelected())
		{
			Thread.sleep(6000);
			e7.click();
		}
		else
		{
			System.out.println("Test failed");
		}
		Thread.sleep(10000);
		wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//input[@type='submit' and @value='Generate']"))).click();
		Thread.sleep(10000);
		driver.switchTo().defaultContent();
		Thread.sleep(10000);
		driver.switchTo().frame(0);
		Thread.sleep(10000);
		WebElement e1=driver.findElement(By.xpath("//h2[text()='Create a Web-to-Lead Form']"));
		driver.executeScript("arguments[0].scrollIntoView(true);", e1);
		Keys.chord(Keys.CONTROL+"a");
		String s8=Keys.chord(Keys.CONTROL+"b");
		Thread.sleep(10000);
		Runtime.getRuntime().exec("C:\\Windows\\System32\\notepad.exe");
		StringSelection x=new StringSelection(s8);
		Toolkit.getDefaultToolkit().getSystemClipboard().setContents(x, null);
		Robot r=new Robot();
		Thread.sleep(5000);
		r.keyPress(KeyEvent.VK_CONTROL);
		r.keyPress(KeyEvent.VK_C);
		r.keyRelease(KeyEvent.VK_C);
		r.keyRelease(KeyEvent.VK_CONTROL);
		Thread.sleep(5000);
		String z=(String)Toolkit.getDefaultToolkit().getSystemClipboard().getData(DataFlavor.stringFlavor);
		}
}
