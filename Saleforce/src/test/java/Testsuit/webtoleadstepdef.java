package Testsuit;

import Pages.Siginp;
import Pages.Webtoleadpage;
import base.Base;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class webtoleadstepdef 
{
	    public Base b=new Base();
	    public Siginp sp=new Siginp();
	    public  Webtoleadpage wb =new Webtoleadpage();
	    @Given("^user should enter homepage$")
	    public void user_should_enter_homepage() throws Exception 
	    {
	    	
	    }
	    @When("^click on setup$")
	    public void click_on_setup() throws Exception 
	    {
	    	wb.clicksetup();
	    }
	    @Then("^user entered into setup homepage$")
	    public void user_entered_into_setup_homepage() 
	    {
	    	wb.displaySetupHome();
	    }
	    @Given("^user is on setup homepage$")
	    public void user_is_on_setup_homepage()  
	    {
	    	wb.displaySetupHome();
	    }

	    @When("^search for Webtolead \"(.+)\"$")
	    public void search_for_webtolead(String x) throws Exception
	    {
	    	wb.searchWebtolead(x);
	    }

	    @Then("^user entered setup webtolead$")
	    public void user_entered_setup_webtolead() 
	    {
	        wb.dispalyedHomepage();
	    }

	    @And("^click on webtolead$")
	    public void click_on_webtolead() throws Exception
	    {
	       wb.clickWebtoLead();
	    }
	    @Given("^user is on setup webtolead$")
	    public void user_is_on_setup_webtolead() 
	    {
	    	wb.dispalyedHomepage();
	    }

	    @When("^click on edit$")
	    public void click_on_edit() throws Exception 
	    {
	    	wb.edit();
	    }
	    @Then("^webtolead enabled click save$")
	    public void user_back_to_set_webtolead() throws Exception  
	    {
	    	wb.enableWebtoLead();
	    	wb.saveEdits();
	     }
	    @Given("^user is on webtolead settings$")
	    public void user_is_on_webtolead_settings() 
	    {
	    	wb.dispalyedHomepage();
	    }

	    @When("^click on create webtolead form$")
	    public void click_on_create_webtolead_form() throws Exception 
	    {
	    	wb.click_CreateEdit();
	    }

	    @Then("^user entered create webtolead form$")
	    public void user_entered_create_webtolead_form() 
	    {
	    	wb.displayedCreateForm();
	    }
	    @Given("^user is on webtolead setup page$")
	    public void user_is_on_webtolead_setup_page() throws Throwable {
	       
	    }

	    @When("^select items to get the form$")
	    public void select_items_to_get_the_form() throws Throwable {
	           wb.selectElements();
	    }

	    @Then("^user entered create webtolead$")
	    public void user_entered_create_webtolead() throws Throwable {
	       
	    }

	    @And("^enable capcha andclick on generate$")
	    public void enable_capcha_andclick_on_generate() throws Throwable {
	        wb.capchaenable();
	        wb.clickGenerate();
	    }
	    @Given("^user is on create webtolead$")
	    public void user_is_on_create_webtolead() throws Throwable {
	      
	    }

	    @When("^copy to notepad$")
	    public void copy_to_notepad() throws Throwable 
	    {
	    	wb.GenerateFinish();
	    	wb.saveData();
	        
	    }

	    @Then("^goto home page$")
	    public void goto_home_page() throws Exception  {
	    	wb.clickFinish();
	        
	    }

	    @And("^click finish$")
	    public void click_finish() throws Throwable {
	        
	    }


	 }
