package Dummy;

import java.time.Duration;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Scanner;

import org.openqa.selenium.By;
import org.openqa.selenium.NoSuchElementException;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.support.ui.ExpectedCondition;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.FluentWait;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Dummy11 {

	public static void main(String[] args) throws Exception
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("enter your name to be click");
		String s1=sc.nextLine();
		
		Scanner sc1=new Scanner(System.in);
		System.out.println("enter new name");
		String s2=sc.nextLine();
		
		ChromeOptions co=new ChromeOptions();
		String[] s=new String[] {"enable-automation"};
		co.setExperimentalOption("excludeSwitches",s);
		co.addArguments("--disable-notifications");
		Map<String, Object> prefs = new HashMap<String, Object>();
		prefs.put("credentials_enable_service", false);
		prefs.put("profile.password_manager_enabled", false);

		co.setExperimentalOption("prefs", prefs);
		WebDriverManager.chromedriver().setup();
		ChromeDriver driver=new ChromeDriver(co);
		driver.manage().window().maximize();
		FluentWait<ChromeDriver> wait=new FluentWait<ChromeDriver>(driver);
		wait.withTimeout(Duration.ofSeconds(60));
		wait.pollingEvery(Duration.ofMillis(2000));
		wait.ignoring(NoSuchElementException.class);
		driver.navigate().to("https://login.salesforce.com/?locale=eu");
		driver.findElement(By.xpath("//input[@name='username']")).sendKeys("praneetha.mullapudi-cgwp@force.com");
		driver.findElement(By.xpath("//input[@id='password']")).sendKeys("Pranee.10");
		driver.findElement(By.xpath("//input[@id='Login']")).click();
	
		wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//span[text()='Close']//parent::button"))).click();
		
		WebElement e=driver.findElement(By.xpath("//span[text()='Leads']/parent::a"));
		driver.executeScript("arguments[0].click();", e  );
		ExpectedCondition<List<WebElement>> ec=ExpectedConditions.numberOfElementsToBeMoreThan(By.xpath("//tbody//tr//following::th//a"), 0);
		List<WebElement> rows=wait.until(ec);
		for(WebElement item:rows)
		{
			String x=item.getText();
			if(s1.equals(x))
			{
				item.click();
				wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//button[text()='Edit']"))).click();
				ExpectedCondition<WebElement> ec2=ExpectedConditions.visibilityOfElementLocated(By.xpath("//input[@name='firstName']"));
				wait.until(ec2).clear();
				wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//input[@name='firstName']"))).sendKeys(s2);
				wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//button[text()='Save']"))).click();
			}
		}
		
		
	}

}
