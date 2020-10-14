 @sign
Feature: Sign in
  Scenario:
    Given I GOTO url as "https://www.d3dsecurity.co.uk"
    When I click on log in button on home page
    Then I should see login page URL as"https://www.d3dsecurity.co.uk/login/"
    When I enter username as "david@hotmail.com"
    And I enter password as "David123"
    And I click on log in button on login page
    Then I should see error as "Wrong credentials" page
#    Then I should see log out button
    # Then I should not see log in button