package Testsuit;

import java.io.FileInputStream;

import org.apache.poi.ss.usermodel.DataFormatter;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;

import Pages.Siginp;
import Pages.Webtoleadform;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class webtoleadformstepdef 
{
	public Webtoleadform wb;
	 @Given("^user is on webtolead form$")
	 public void user_is_on_webtolead_form() throws Throwable 
	 {
		 wb=new Webtoleadform();
		 Siginp sp=new Siginp();
		 sp.setUp();
		 wb.openurl();
	}
	 @When("^enter details from excel and click$")
	 public void enter_details_from_excel_and_click() throws Exception 
	 {
		 wb.excelsheet();
		 wb.clicksumit(); 
	 }
	 @Then("^user details$")
	 public void user_details() throws Throwable 
	 {
		
		
	        
	 }

	 	
	 	
	

}
