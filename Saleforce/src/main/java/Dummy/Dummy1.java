package Dummy;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Dummy1 {

	public static void main(String[] args) throws Exception
	{
		WebDriverManager.chromedriver().setup();
		ChromeDriver driver=new ChromeDriver();
		driver.get("https://login.salesforce.com/?locale=eu");
		
		driver.findElement(By.xpath("//input[@name='username']")).sendKeys("praneetha.mullapudi-cgwp@force.com");
		driver.findElement(By.xpath("//input[@id='password']")).sendKeys("Pranee.10");
		driver.findElement(By.xpath("//input[@id='Login']")).click();
		Thread.sleep(5000);
		driver.findElement(By.xpath("//span[text()='Leads']/parent::a")).click();
		

	}

}
