@Lead
Feature: Create new lead

@Createlead
Scenario: Check the new lead button
Given user should close banner
Given user is on salesforce dashboard page
When click lead object and click New
Then user is on new lead form page

@FillForm
Scenario Outline: Fill the new lead
Given user is on NewLead
When click on new 
When Enter <salutation> and <LastName> and <Company> and <Industry>
Then new lead should be created
And click on new 
Examples:
 |salutation|LastName|Company|Industry|
 |Ms.|swathi|magnitia|Not For Profit|
 |Ms.|praneetha|Tcs|Not For Profit|
@deleteForm
Scenario: Edit the new lead form
Given user is on newleadpage
When click on delete option "swathi"
Then Lead should be deleted
@editForm
Scenario: Fill the edit form
Given user is on editpage "praneetha" to "pranitha"
Then Lead should Edited
@convert
Scenario: convert lead to contact
Given user is on Leadpage
When click on next stages
Then Lead is converted into lead

	

  
  
	
