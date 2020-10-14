Feature: Holiday search
  @spice
  Scenario:
#    Given I open Url as "https://www.spicejet.com/"
    When I click on Book button on Homepage
    Then I should see the option page contain url as "https://www.spicejet.com/Default.aspx"
#    Given I select one way trip radio button
    When I click on Departure city on home page
    Then I should see the list of departure city
    Given I select the departure city as "Ahmedabad"
    Given i select arrival city as "Bangkok (BKK)"
    Given I select departure date is "26/03/2020"
    When  I click check box on "Family and Friends"
    Given I selected passenger as Adult "4"
    Given I selected currency as "USD"
    When I click on search button


