package Dummy;

import java.time.Duration;
import java.util.List;
import java.util.Scanner;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.StaleElementReferenceException;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.FluentWait;

import elements.Leadeles;
import io.github.bonigarcia.wdm.WebDriverManager;

public class dummy3 {
	public static  String y;

	public static void main(String[] args) throws Exception 
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("enter a name");
		String x1=sc.nextLine();
		sc.close();
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
		Thread.sleep(9000);
		WebElement e=driver.findElement(By.xpath("//span[text()='Leads']/parent::a"));
		driver.executeScript("arguments[0].click();", e);
		Thread.sleep(5000);
		String x=driver.findElement(By.xpath("(//div[@aria-live='polite']/span)[1]")).getText();
		//4 items • 
		
		List<WebElement>ec=driver.findElements(By.xpath("(//tbody//tr//th//descendant::a)"));
		System.out.println(ec.size());
		for(WebElement e3:ec)
		{
			String x4=e3.getText();
		
			if(x4.equals(x1))
			{
				
		     	Thread.sleep(4000);
		     	JavascriptExecutor js1=(JavascriptExecutor)driver;
				js1.executeScript("arguments[0].click();",e3);
				Thread.sleep(9000);
				driver.findElement(By.xpath("//button[text()='Delete']")).click();
				Thread.sleep(3000);
				driver.findElement(By.xpath("//span[text()='Delete']")).click();
					
				
			}
		}
		
	
		
		
	}

}
