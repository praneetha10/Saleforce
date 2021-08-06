package Testsuit;

import java.util.ArrayList;

import org.testng.Assert;
import org.testng.Reporter;

import com.aventstack.extentreports.Status;

import Pages.Dropdowns;
import Pages.Siginp;
import Pages.lead;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class Validatedropdowndef6 
{
	public Siginp sp;
	@Given("^user is on createnew lead page$")
    public void user_is_on_createnew_lead_page() throws Exception 
	{
		lead le=new lead();
		sp=new Siginp();
		
		le.click_Lead();
		le.click_New();
    }

    @When("^validate dropdown of Industries$")
    public void validate_dropdown_of_industries() throws Throwable 
    {
    	try
    	{
			Dropdowns dd=new Dropdowns();
			ArrayList<String> actual=dd.validateIndustryActual();
			System.out.println(actual);
			ArrayList<String> expected=dd.validateIndustryExpected();
			System.out.println(expected);
			for(int i=0;i<actual.size();i++)
			{
				if(actual.get(i).equals(expected.get(i)))
				{
					Reporter.log(" Element are matched");
				}
				else
				{
					Reporter.log("Elements are not matched");
				}
			}
			
			
		}
    	catch(Exception ex)
		{
			
		}
    }

    @Then("^users should on lead page$")
    public void users_should_on_lead_page()
    {
    	sp.teadDown();
        
    }
    @Given("^user is on createnew leadpage$")
    public void user_is_on_createnew_leadpage() 
    {
    	
      
    }

    @When("^validate dropdown of Leadsource$")
    public void validate_dropdown_of_leadsource() 
    {
       
    }

    @Then("^user should on lead page$")
    public void user_should_on_lead_page() 
    {
      
    }

    
}


