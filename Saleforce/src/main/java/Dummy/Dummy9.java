package Dummy;

import java.time.Duration;
import java.util.List;
import java.util.Scanner;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.support.ui.ExpectedCondition;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.FluentWait;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Dummy9
{
	public static void main(String[] args) throws Exception 
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("enter a name to click");
		String s1=sc.nextLine();
		ChromeOptions co=new ChromeOptions();
		String[] s=new String[] {"enable-automation"};
		co.setExperimentalOption("excludeSwitches",s);
		co.addArguments("--disable-notifications");
		WebDriverManager.chromedriver().setup();
		ChromeDriver driver=new ChromeDriver(co);
		driver.manage().window().maximize();
		FluentWait<ChromeDriver> wait=new FluentWait<ChromeDriver>(driver);
		wait.withTimeout(Duration.ofSeconds(60));
		wait.pollingEvery(Duration.ofMillis(2000));
		driver.navigate().to("https://login.salesforce.com/?locale=eu");
		driver.findElement(By.xpath("//input[@name='username']")).sendKeys("praneetha.mullapudi-cgwp@force.com");
		driver.findElement(By.xpath("//input[@id='password']")).sendKeys("Pranee.10");
		driver.findElement(By.xpath("//input[@id='Login']")).click();
		wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//span[text()='Close']//parent::button"))).click();
		Thread.sleep(3000);
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
				wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//button[text()='Delete']"))).click();
			}
		}
	}

}
