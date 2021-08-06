package Dummy;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedCondition;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.FluentWait;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Dummy8 {

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
		driver.findElement(By.xpath("//input[@name='username']")).sendKeys("praneethabatch251-a8h1@force.com");
		driver.findElement(By.xpath("//input[@id='password']")).sendKeys("Pranee.10");
		driver.findElement(By.xpath("//input[@id='Login']")).click();
		Thread.sleep(6000);
		WebElement e=driver.findElement(By.xpath("//span[text()='Leads']/parent::a"));
		driver.executeScript("arguments[0].click();", e  );
		Thread.sleep(5000);
		driver.findElement(By.xpath("//a[text()='pranitha']")).click();
		Thread.sleep(5000);
		for(int i=1;i<=3;i++)
		{
			Thread.sleep(2000);
			WebElement e1=driver.findElement(By.xpath("//span[text()='Mark Status as Complete']//parent::button"));
			driver.executeScript("arguments[0].click();",e1);
		}
		driver.findElement(By.xpath("(//span[text()='Convert']//parent::button)[1]")).click();
		driver.findElement(By.xpath("//button[text()='Go to Leads']")).clear();
		
	}

}
