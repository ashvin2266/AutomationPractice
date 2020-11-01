Feature: create an account
   @create
   Scenario: Verify User can create an new account
      Given I go to Home Page
      When I click on sign in button on home page
      Then I should see create an account in authentication page
      Given I enter valid email address "test01478@gmail.com"
      When I click on create an account button on authentication page
      Then I should see your personal information page
      Given I select "Mrs." as a Title
      Given I enter a valid first name as"first test   "
      Given I enter a valid last name as "last test   "
      Given I enter a valid password as "Abcd12345"
      Given I select  birth date is "1"
      Given I select a month is as "April "
      Given I select a year is "2009"
      When I click a sign up newsletter box
      When I click recieve a special offer box
      Given I enter company name as"ABCD"
      Given I enter address as "PO BOX 98765  "
      Given I enter address line  is as "Kenton Road"
      Given I enter a city as "Barrow"
      Given I select a state as "Alaska"
      Given I enter a zip/postal code is as "99501"
      Given I enter additional information as"abcdefg"
      Given I enter a home phone as"01234567890"
      Given I enter a Mobile phone as"0987654321"
      Given I enter a assign an address alias for future reference as"My address"
      When I click on register button
      Then I should see my account page
      And I verify page title is as "My account - My Store"
      And I verify the heading of page is "My account"




