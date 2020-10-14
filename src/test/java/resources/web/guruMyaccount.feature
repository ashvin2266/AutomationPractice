Feature:
  @guru3
  Scenario: Verify can create an account in e-Commerce site and can share wishlist to other people using email.
/*  1. Go to http://live.guru99.com/
  2. Click on my account link
  3. Click Create a1. Go to http:n Account link and fill New User information except Email ID
  4. Click Register
  5. Verify Registration is done. Expected account registration done.
  6. Go to TV menu
  7. Add product in your wish list - use product - LG LCD
  8. Click SHARE WISHLIST
  9. In next page enter Email and a message and click SHARE WISHLIST
  10.Check wishlist is shared. Expected wishlist shared successfully. Test Steps:
*/
    When I click on my account link
    Then I should see the create an account page url as "http://live.guru99.com/index.php/customer/account/login/"
    Given I enter first name is a as "test"
    Given I enter middlename is as "test1"
    Given I enter last name is as "test3"
    Given I enter a valid password is a as "abc123"
    Given I enter a confirm password is as "abc123"
    When I click on registration
    Then I should see the message is a as "Thank you for registering with Main Website Store."


