package Dummy;

import java.time.Duration;
import java.util.ArrayList;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.FluentWait;

import elements.Dropdownsele;
import io.github.bonigarcia.wdm.WebDriverManager;

public class Dummy5 {

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
		/*JavascriptExecutor js=(JavascriptExecutor)driver;
		js.executeScript("arguments[0].click();",e);*/
		Thread.sleep(8000);
		driver.findElement(By.xpath("//div[@title='New']/parent::a")).click();
		Thread.sleep(5000);
		WebElement e1=driver.findElement(By.xpath("//label[text()='Company']"));
		driver.executeScript("arguments[0].scrollIntoView(true);", e1);
		Thread.sleep(5000);
		ArrayList<String> actual =new ArrayList<String>(); 
		WebElement e2=driver.findElement(By.xpath("((//input[contains(@aria-owns,'dropdown-element')])[4]//parent::div//following-sibling::div)[2]"));
		JavascriptExecutor js=(JavascriptExecutor)driver;
		js.executeScript("arguments[0].click();",e2);
		List<WebElement>ele=e2.findElements(By.xpath("//span[@class='slds-media__body']/span[text()]"));
		System.out.println(ele.size());
		for(WebElement e3:ele)
		{
			actual.add((String)driver.executeScript("return arguments[0].textContent;", e3));
		}
		System.out.println("actualvalues"+actual.toString());
		Thread.sleep(5000);
		
		ArrayList<String> expeted1=new ArrayList<String>();
		WebElement dd=driver.findElement(By.xpath("((//input[@aria-haspopup='listbox'])[4]//parent::div//following-sibling::div)[2]"));
		Thread.sleep(5000);
		List<WebElement>items=dd.findElements(By.xpath("//span[@class='slds-media__body']/span[text()]"));
		System.out.println(items.size());
		
		for(WebElement item:items)
		{
			try
			{
				JavascriptExecutor js3=(JavascriptExecutor)driver;
				js3.executeScript("arguments[0].click();",dd);
				Thread.sleep(5000);
				if(item.isDisplayed())
				{
					expeted1.add(item.getText());
					Thread.sleep(3000);
					JavascriptExecutor js2=(JavascriptExecutor)driver;
					js2.executeScript("arguments[0].click();",item);
				}
				
			}
			catch(Exception ex)
			{
				System.out.println(ex.getMessage());
			}
		}
		
	}

}
