package Dummy;

import java.awt.Robot;
import java.awt.Toolkit;
import java.awt.datatransfer.DataFlavor;
import java.awt.datatransfer.StringSelection;
import java.awt.event.KeyEvent;
import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedCondition;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.FluentWait;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.sikuli.script.Screen;



import elements.Leadeles;
import io.github.bonigarcia.wdm.WebDriverManager;

public class Dummy2 {

	public static void main(String[] args) throws Exception
	{
		WebDriverManager.chromedriver().setup();
		ChromeDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		FluentWait<ChromeDriver> wait=new FluentWait<ChromeDriver>(driver);
		wait.withTimeout(Duration.ofSeconds(20));
		wait.pollingEvery(Duration.ofMillis(1000));
		driver.get("https://login.salesforce.com/?locale=eu");
		
		driver.findElement(By.xpath("//input[@name='username']")).sendKeys("praneetha.mullapudi-cgwp@force.com");
		driver.findElement(By.xpath("//input[@id='password']")).sendKeys("Pranee.10");
		driver.findElement(By.xpath("//input[@id='Login']")).click();
		Thread.sleep(6000);
		WebElement e=driver.findElement(By.xpath("//span[text()='Leads']/parent::a"));
		driver.executeScript("arguments[0].click();", e);
		/*JavascriptExecutor js=(JavascriptExecutor)driver;
		js.executeScript("arguments[0].click();",e);*/
		Thread.sleep(6000);
		driver.findElement(By.xpath("//div[@title='New']/parent::a")).click();
		Thread.sleep(6000);
		WebElement e3=driver.findElement(By.xpath("//input[@name='salutation']"));
		e3.click();
		Thread.sleep(5000);
		List<WebElement>ec=driver.findElements(By.xpath("//span[@class='slds-media__body']/span[text()]"));
		System.out.println(ec.size());
		for(WebElement e2:ec)
		{
			String x=e2.getText();
			System.out.println(x);	
		}
		
		/*Robot r=new Robot();
		for(int i=0;i<=ec.size();i++)
		{
			try
			{
			
				e3.click();
				r.keyPress(KeyEvent.VK_DOWN);
				r.keyRelease(KeyEvent.VK_DOWN);
				Thread.sleep(3000);
				r.keyPress(KeyEvent.VK_ENTER);
				r.keyRelease(KeyEvent.VK_ENTER);
				String x=ec.get(i).getText();
				System.out.println(x);
			}
			catch(Exception ex)
			{
				
			}
			
		}*/
			
	}

}
