package Pages;

import java.io.FileInputStream;
import java.io.FileNotFoundException;

import org.apache.poi.ss.usermodel.DataFormatter;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;

import com.aventstack.extentreports.Status;

import base.Base;
import elements.webtoleadformele;

public class Webtoleadform extends Base
{
	public void openurl()
	{
		PageFactory.initElements(driver, webtoleadformele.class);
		
		driver.navigate().to(p.getProperty("url2"));
		driver.manage().window().maximize();
	}
	public void excelsheet() throws Exception
	{
		
		FileInputStream fi=new FileInputStream("C:\\Users\\prane\\git\\salesforce\\Saleforce\\src\\test\\resources\\Book1.xlsx");
		 Workbook wb=WorkbookFactory.create(fi);
		 Sheet sheet=wb.getSheet("Sheet1");
		 int nour=sheet.getPhysicalNumberOfRows();
		 System.out.println(nour);
		 for(int i=1;i<2;i++)
		 {
			 DataFormatter df=new DataFormatter();
			 String slaution=df.formatCellValue(sheet.getRow(i).getCell(0));
			 String fn=df.formatCellValue(sheet.getRow(i).getCell(1));
			 String ln=df.formatCellValue(sheet.getRow(i).getCell(2));
			 String email=df.formatCellValue(sheet.getRow(i).getCell(3));
			 String city=df.formatCellValue(sheet.getRow(i).getCell(4));
			 String mobile=df.formatCellValue(sheet.getRow(i).getCell(5));
			 String fax=df.formatCellValue(sheet.getRow(i).getCell(6));
			 String zip=df.formatCellValue(sheet.getRow(i).getCell(7));
			 String country=df.formatCellValue(sheet.getRow(i).getCell(8));
			 String state=df.formatCellValue(sheet.getRow(i).getCell(9));
			 
			 Select s=new Select(webtoleadformele.dropdown);
			 Thread.sleep(5000);
			 webtoleadformele.dropdown.click();
			 s.selectByVisibleText(slaution);
			 webtoleadformele.dropdown.click();
			 webtoleadformele.firstname.sendKeys(fn);
			 webtoleadformele.lastname.sendKeys(ln);
			 webtoleadformele.email.sendKeys(email);
			 webtoleadformele.city.sendKeys(city);
			 webtoleadformele.mobile.sendKeys(mobile);
			 
			 
			 
			 webtoleadformele.fax.sendKeys(fax);
			 webtoleadformele.zip.sendKeys(zip);
			 webtoleadformele.country.sendKeys(country);
			 webtoleadformele.state.sendKeys(state);
		 }
		}
	 public void clicksumit() throws Exception
	 {
		 Thread.sleep(5000);
		 webtoleadformele.senddata.submit();
		exttest=report.createTest("submit form");
		exttest.log(Status.PASS, "submit form test passed");
	 }
}
