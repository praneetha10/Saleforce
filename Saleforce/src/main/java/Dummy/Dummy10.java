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
import org.openqa.selenium.support.pagefactory.AjaxElementLocatorFactory;
import org.openqa.selenium.support.ui.ExpectedCondition;
	import org.openqa.selenium.support.ui.ExpectedConditions;
	import org.openqa.selenium.support.ui.FluentWait;

	import io.github.bonigarcia.wdm.WebDriverManager;
	public class Dummy10
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
			Thread.sleep(5000);
			wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//span[text()='Close']//parent::button"))).click();
			Thread.sleep(5000);
			WebElement e=driver.findElement(By.xpath("//span[text()='Leads']/parent::a"));
			driver.executeScript("arguments[0].click();", e  );
			ExpectedCondition<List<WebElement>> ec=ExpectedConditions.numberOfElementsToBeMoreThan(By.xpath("//tbody//tr//following::th//a"), 0);
			List<WebElement> rows=wait.until(ec);
			int x1=wait.until(ec).size();
			System.out.println(x1);
			for(WebElement item:rows)
			{
				String x=item.getText();
				if(s1.equals(x))
				{
					item.click();
					wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//button[text()='Delete']"))).click();
					wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//span[text()='Delete']//parent::button"))).click();
				}
			}
			Thread.sleep(5000);
			ExpectedCondition<List<WebElement>> ec1=ExpectedConditions.numberOfElementsToBeMoreThan(By.xpath("//tbody//tr//following::th//a"), 0);
			List<WebElement> row=wait.until(ec1);
			int y=wait.until(ec1).size();
			System.out.println(y);
			if(y<x1)
			{
				System.out.println("element got deleted");
			}
			else
			{
				System.out.println("element is not deleted");
			}
		}
		

	}



