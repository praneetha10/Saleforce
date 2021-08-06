package Testsuit;

import Pages.editlead;
import Pages.lead;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class Editleadstepdef4 
{
	public editlead ed=new editlead ();
	public lead le=new lead();
	@Given("user is on newleadpage")
	public void click_leadoption() throws Exception
	{
		le.click_Lead();
	}
	 @When("^click on delete option \"([^\"]*)\"$")
	public void clickDelete(String x) throws Exception
	{
		ed.clickDelete(x);
	}
	@Then("Lead should be deleted")
	public void deleted_Lead() throws Exception
	{
		ed.validateDelete();
		le.click_Lead();
	}
	@Given("^user is on editpage \"([^\"]*)\" to \"([^\"]*)\"$")
    public void user_is_on_editpage(String x,String y) throws Exception 
 	{
		 ed.editPage(x, y);
    }
	@Then("^Lead should Edited$")
    public void lead_should_edited() throws Throwable 
    {
    	
      
    }
    @Given("^user is on Leadpage$")
    public void user_is_on_leadpage() 
    {
    	
       
    }

    @When("^click on next stages$")
    public void click_on_next_stages() throws Exception 
    {
    	
       ed.covert();
    }

    @Then("^Lead is converted into lead$")
    public void lead_is_converted_into_lead()
    {
        
    }

    

}
