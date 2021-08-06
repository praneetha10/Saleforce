package Dummy;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.support.ui.ExpectedCondition;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.FluentWait;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Dummy7 {

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
		Thread.sleep(6000);
		WebElement e=driver.findElement(By.xpath("//span[text()='Leads']/parent::a"));
		driver.executeScript("arguments[0].click();", e  );
		Thread.sleep(5000);
		driver.findElement(By.xpath("//div[@title='New']/parent::a")).click();
		Thread.sleep(5000);
		WebElement e1=driver.findElement(By.xpath("//label[text()='Company']"));
		driver.executeScript("arguments[0].scrollIntoView(true);", e1);
		//Dropdown
		Thread.sleep(5000);
		WebElement ite=driver.findElement(By.xpath("(//input[contains(@aria-owns,'dropdown-element')])[5]"));
		
		Thread.sleep(5000);
		List<WebElement>ec=ite.findElements(By.xpath("//parent::div//descendant::div//following::div//span[@class='slds-truncate']"));
		for(WebElement item:ec)
		{
			item.click();
			if(item.isDisplayed())
			{
				String x=item.getText();
				System.out.println(x);
			}
			
		}
	}

}
