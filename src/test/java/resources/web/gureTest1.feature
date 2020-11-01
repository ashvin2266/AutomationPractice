Feature:User select mobile and check it is in cart
  @guru1
  Scenario:verify selected mobile are sorted by name
    Given I go to Home Page url as "http://live.demoguru99.com/"
    Given I Verify Title of the page
    When  I Click on �MOBILE� menu
    Then I  Verify the  Title of the page
    Given In the list of all mobile
    When I select �SORT BY� dropdown as �name�
    Then I Verify all products are sorted by name
    @guru

  Scenario: verify the cost of product in list page and detail page
    When  I Click on �MOBILE� menu
    Then I  Verify the  Title of the page
    Given In the list of all mobile
    When I select �SORT BY� dropdown as �name�
    Then I Verify all products are sorted by name
    Given I read the price of sony Xperia and note down the price
    When I click on sony xperia mobile
    Then I should see the sony experia mobile detail page
    And I should see the price of sony experia on mobile detail page
    And I compare both price from list page and mobile page
    Then I should see error message is  as "* The maximum quantity allowed for purchase is 500."
    When I click on empty cart button
    Then I should see the message is  as "SHOPPING CART IS EMPTY"
@guru2
  Scenario: compare two product
    When  I Click on �MOBILE� menu
    Then I  Verify the  Title of the page
    Given In the list of all mobile
    When I select �SORT BY� dropdown as �name�
    Then I Verify all products are sorted by name
    When I click on xperia mobile button add to compare
    When I click on add to compare for iphone from mobile list
    Then I should see the pop window is open as a titile "Compare Products "
    And I should see the selected both product in pop window
    When I click on compare button
#    Then I should see pop new windows open


