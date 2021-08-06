@webtolead
Feature: Title convert web-to-lead
  I want to use this template for web-to-lead
@Homepage
Scenario: Title of your enter setup
Given user should enter homepage
When click on setup 
Then user entered into setup homepage
@Web-to-Lead
Scenario: Title of your web-to-lead
Given user is on setup homepage
When search for Webtolead "Web-to-Lead"
And click on webtolead
Then user entered setup webtolead
@edit
Scenario: Title of your edit 
Given user is on setup webtolead
When click on edit
Then webtolead enabled click save
@clickcreateForm
Scenario: Title of your create Webtoleadform
Given user is on webtolead settings
When click on create webtolead form
Then user entered create webtolead form
@selectElements
Scenario: select all items
Given user is on webtolead setup page
When select items to get the form
And  enable capcha andclick on generate
Then user entered create webtolead
@copynotepad
Scenario: copy to notepad
Given user is on create webtolead
When copy to notepad
And click finish
Then goto home page





  
 