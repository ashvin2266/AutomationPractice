Feature:
  @guru

  Scenario: verify item in mobile page can be short by Name
    Given I go to url as "http://live.guru99.com/index.php/"
    Then I should see the title of home page is "Home page"
    And I should see the home page contain text as "THIS IS DEMO SITE FOR   "
    When I click on Mobile button on Home page
    Then I should see mobile page url as "http://live.guru99.com/index.php/mobile.html"
    And I should see the title of page is "Mobile"
    And I should see the list of mobile items
    When I click on short by drop down box
#    Then I should see the list of option
    Given I select option from list as "Name"
    When I click on Name
    Then I should see the list of item by Name