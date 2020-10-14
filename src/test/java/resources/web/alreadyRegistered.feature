@already
Feature: Already Registered
  @already1
  Scenario:  I enter a valid detail
    Given I go to Home Page
    When I click on a sign in button on home page
    Then I should see Already Registered in authentication page title as"Login - My Store"
    Given I enter a valid email as "abg@hotmail.com"
    Given I enter a valid password as "123abc"
    When I click on sign in button
    Then I should see my account page Url as"http://automationpractice.com/index.php?controller=my-account"
    And verify the page title of account page is "My account - My Store"
  @already2
  Scenario:  I enter a valid email and invalid password detail
    Given I go to Home Page
    When I click on a sign in button on home page
    Then I should see Already Registered in authentication page title as"Login - My Store"
    Given I enter a valid email as "abg@hotmail.com"
    Given I enter a valid password as ""
    When I click on sign in button
    Then I should see error message as "Password is required."
  @already3
    Scenario: Scenario:  I enter a Invalid email and valid password detail
      Given I go to Home Page
      When I click on a sign in button on home page
      Then I should see Already Registered in authentication page title as"Login - My Store"
      Given I enter a valid email as ""
      Given I enter a valid password as "123abc"
      When I click on sign in button
      Then I should see error message as "An email address required."
  @already4
  Scenario: Scenario:  I enter a valid detail
    Given I go to Home Page
    When I click on a sign in button on home page
    Then I should see Already Registered in authentication page title as"Login - My Store"
    Given I enter a valid email as "abghotmail.com"
    Given I enter a valid password as "Abcd123"
    When I click on sign in button
    Then I should see error message as "Invalid email address."
  @already5
  Scenario:  I enter a valid detail
    Given I go to Home Page
    When I click on a sign in button on home page
    Then I should see Already Registered in authentication page title as"Login - My Store"
    Given I enter a valid email as "abg@hotmail.com"
    Given I enter a valid password as "abcd"
    When I click on sign in button
    Then I should see error message as "Invalid password."
  @already6
  Scenario:  I enter a valid detail
    Given I go to Home Page
    When I click on a sign in button on home page
    Then I should see Already Registered in authentication page title as"Login - My Store"
    Given I enter a valid email as "abghotmail.com"
    Given I enter a valid password as "abcd"
    When I click on sign in button
    Then I should see error message as "Invalid email address."
   @already7
  Scenario:  I enter a valid detail
     Given I go to Home Page
     When I click on a sign in button on home page
     Then I should see Already Registered in authentication page title as"Login - My Store"
     Given I enter a valid email as ""
     Given I enter a valid password as ""
     Given I enter a valid password is  as "<password>"
     When I click on sign in button
     Then I should see error message as "An email address required."
  @already8
  Scenario Outline: I enter valid detail
    Given I go to Home Page
    When I click on a sign in button on home page
    Then I should see Already Registered in authentication page title as"Login - My Store"
    Given I enter a valid email as "<email>"
    When I click on sign in button
    Then I should see error message as "<message>"
    Examples:
      | email           | password |  message               |
      | abg@hotmail.com |          | Password is required.       |
      |                 | Abcd123  | An email address required.  |
      | abghotmail.com  | Abcd123  | Invalid email address.      |
      | abg@hotmail.com | abcd     | Password is required.       |
      | abghotmail.com  | abcd     | Invalid email address.      |
      |                 |          | An email address required.  |
  @data
  Scenario:enter data by data table
    Given I go to Home Page
    When I click on a sign in button on home page
    Then I should see Already Registered in authentication page title as"Login - My Store"
    Given I enter below details;
      | email           | password |
      | abg@hotmail.com | 123abc  |
      |cde@hotmail.com  |cde1234   |

    When I click on sign in button
    Then I should see my account page Url as"http://automationpractice.com/index.php?controller=my-account"




