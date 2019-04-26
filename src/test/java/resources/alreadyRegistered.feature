Feature: Already Registered
  @already
  Scenario:  I enter a valid detail
#    Given I go to URL as "http://automationpractice.com/index.php?"
    When I click on a sign in button on home page
    Then Then I should see Already Registered in authentication page
    Given I enter a valid email as "abg@hotmail.com"
    Given I enter a valid password as "Abcd123"
    When I click on sign in button
    Then I should see my account page Url as"http://automationpractice.com/index.php?controller=my-account"
  @already1
  Scenario:  I enter a valid detail
#    Given I go to URL as "http://automationpractice.com/index.php?"
    When I click on a sign in button on home page
    Then Then I should see Already Registered in authentication page
    Given I enter a valid email as "abg@hotmail.com"
    Given I enter a valid password as ""
    When I click on sign in button
    Then I should see error message as "Password is required."
  @already2
    Scenario: Scenario:  I enter a valid detail
#    Given I go to URL as "http://automationpractice.com/index.php?"
      When I click on a sign in button on home page
      Then Then I should see Already Registered in authentication page
      Given I enter a valid email as ""
      Given I enter a valid password as "Abcd123"
      When I click on sign in button
      Then I should see error message as "An email address required."
  @already3
  Scenario: Scenario:  I enter a valid detail
#    Given I go to URL as "http://automationpractice.com/index.php?"
    When I click on a sign in button on home page
    Then Then I should see Already Registered in authentication page
    Given I enter a valid email as "abghotmail.com"
    Given I enter a valid password as "Abcd123"
    When I click on sign in button
    Then I should see error message as "Invalid email address."
  @already4
  Scenario:  I enter a valid detail
#    Given I go to URL as "http://automationpractice.com/index.php?"
    When I click on a sign in button on home page
    Then Then I should see Already Registered in authentication page
    Given I enter a valid email as "abg@hotmail.com"
    Given I enter a valid password as "abcd"
    When I click on sign in button
    Then I should see error message as "Invalid password."
  @already5
  Scenario:  I enter a valid detail
#    Given I go to URL as "http://automationpractice.com/index.php?"
    When I click on a sign in button on home page
    Then Then I should see Already Registered in authentication page
    Given I enter a valid email as "abghotmail.com"
    Given I enter a valid password as "abcd"
    When I click on sign in button
    Then I should see error message as "Invalid email address."
   @already6
  Scenario:  I enter a valid detail
#    Given I go to URL as "http://automationpractice.com/index.php?"
     When I click on a sign in button on home page
     Then Then I should see Already Registered in authentication page
     Given I enter a valid email as ""
     Given I enter a valid password as ""
     Given I enter a valid password is  as "<password>"
     When I click on sign in button
     Then I should see error message as "An email address required."
  @alreadyR
  Scenario Outline:
    When I click on a sign in button on home page
    Then Then I should see Already Registered in authentication page
    Given I enter a valid email as "<email>"
    When I click on sign in button
    Then I should see error message is as "<error message>"
    Examples:
      | email           | password | error message               |
      | abg@hotmail.com |          | Password is required.       |
      |                 | Abcd123  | An email address required.  |
      | abghotmail.com  | Abcd123  | Invalid email address.      |
      | abg@hotmail.com | abcd     | Password is required.       |
      | abghotmail.com  | abcd     | Invalid email address.      |
      |                 |          | An email address required.  |
  @data
  Scenario:
    When I click on a sign in button on home page
    Then Then I should see Already Registered in authentication page

    Given I enter below details;
      | email           | password |
      | abg@hotmail.com | Abcd123  |

    When I click on sign in button
    Then I should see my account page




