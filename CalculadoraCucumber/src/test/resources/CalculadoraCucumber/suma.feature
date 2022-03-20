#Author: your.email@your.domain.com
#Keywords Summary :
#Feature: List of scenarios.
#Scenario: Business rule through list of steps with arguments.
#Given: Some precondition step
#When: Some key actions
#Then: To observe outcomes or validation
#And,But: To enumerate more Given,When,Then steps
#Scenario Outline: List of steps for data-driven as an Examples and <placeholder>
#Examples: Container for s table
#Background: List of steps run before each of the scenarios
#""" (Doc Strings)
#| (Data Tables)
#@ (Tags/Labels):To group Scenarios
#<> (placeholder)
#""
## (Comments)
#Sample Feature Definition Template
@tag
Feature: SumaOk

  Scenario Outline: SumaOK
    Given I have a <suma>
    When I sum <a> and <b> 
    Then The result is <value>

    Examples: 
      | a  | b | value  |
      | 1  | 2 | 4      |
      | 0  | 0 | 0      |
      |-1  |-3 |-4      |
