
@registration
Feature: Registration
    @Registration
    Scenario:
  #  Given I go  to URL as "https://www.d3dsecurity.co.uk"
    When I click on Register button on home page
    Then I should see the Register page url as "https://www.d3dsecurity.co.uk/register/"
    Given I enter valid First name as "First test"
    Given I enter valid Last name as "Last test"
    Given I enter valid Email id as "abg@hotmail.com"
    Given I enter valid password as "Abcd123"
    Given I enter confirm password as"Abcd123"
    When I click Register button on Register page
  #  Then I see Account page with login
    Then I should see error as "First name is not valid"
    @Registration
    Scenario:
  #      Given I go  to URL as "https://www.d3dsecurity.co.uk"
        When I click on Register button on home page
        Then I should see the Register page url as "https://www.d3dsecurity.co.uk/register/"
        Given I enter valid First name as ""
        Given I enter valid Last name as "Last test"
        Given I enter valid Email id as "abg@hotmail.com"
        Given I enter valid password as "Abcd123"
        Given I enter confirm password as"Abcd123"
        When I click Register button on Register page
        Then i should see error message as "first name is not valid"
    Scenario:
   #     Given I go  to URL as "https://www.d3dsecurity.co.uk"
        When I click on Register button on home page
        Then I should see the Register page url as "https://www.d3dsecurity.co.uk/register/"
        Given I enter valid First name as "First test"
        Given I enter valid Last name as ""
        Given I enter valid Email id as "abg@hotmail.com"
        Given I enter valid password as "Abcd123"
        Given I enter confirm password as"Abcd123"
        When I click Register button on Register page
        Then i should see error message as "last name is not valid"
        @smoke
    Scenario:
  #      Given I go  to URL as "https://www.d3dsecurity.co.uk"
        When I click on Register button on home page
        Then I should see the Register page url as "https://www.d3dsecurity.co.uk/register/"
        Given I enter valid First name as "First test"
        Given I enter valid Last name as "last test"
        Given I enter valid Email id as " "
        Given I enter valid password as "Abcd123"
        Given I enter confirm password as"Abcd123"
        When I click Register button on Register page
        Then i should see error message as "Username is not valid"




