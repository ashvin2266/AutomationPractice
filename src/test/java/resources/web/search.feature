Feature: Search
  @search
  Scenario Outline:
  #    Given I am on homepage
    When I click search button on home page
    Then I  should see the search page url as "https://www.primark.com/en/search"
    Given I search Item  as "<items>"
    When I click search button
#    Then I should see the page title as "title"
   Then I should see search page heading is "<heading>"

    Examples:
      | items  |heading|
      | jeans   |Search Results for ‘jeans’|
      | T-shirt |Search Results for ‘T-shirt’|
      | jacket  |Search Results for ‘jacket’|
      | Shirt   |Search Results for ‘Shirt’|