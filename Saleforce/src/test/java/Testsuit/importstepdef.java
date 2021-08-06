package Testsuit;

import Pages.Siginp;
import Pages.importdata;
import Pages.lead;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class importstepdef 
{
	public importdata imd;
	@Given("^user should be on lead page$")
    public void user_should_be_on_lead_page() throws Exception 
	{
		Siginp sp=new Siginp();
		imd=new importdata();
		imd.click_import();
	}
	@Then("^user should see the data$")
    public void user_should_see_the_data() throws Exception 
    {
		 imd.clicknext();
      
    }
    @When("^click on import and add csv file$")
    public void click_on_import_and_add_csv_file() throws Exception 
    {
    	 imd.importcsv();
         imd.senddata();
    }

}
