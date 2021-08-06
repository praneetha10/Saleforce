@import
Feature: import data to lead
  I want to import data to file
@importdata
Scenario: click on import
Given user should be on lead page
When click on import and add csv file
Then user should see the data
             

