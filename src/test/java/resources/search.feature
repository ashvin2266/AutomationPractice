Feature: Search
  @search
  Scenario:
#    Given I am on homepage
    When I click search button on home page
    Then I  should see the search page url as "https://www.primark.com/en/search"
    Given I search Item  as "jeans"
    When I click search button
#    Then I should see search items as "<items>"
#    Examples:
#      |items|
#      |jeans|
