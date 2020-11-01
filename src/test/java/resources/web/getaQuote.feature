@quote
Feature:get a quote

  Scenario:User Get a quote
  Given I go to Home Page url as "https://www.d3dsecurity.co.uk/"
  When I click log in button on Home page
  Given I enter first name as "first quote"
  Given I enter last name as "last quote"
  Given I enter email address as "abg@hotmail.com"
  Given I enter my phone number as"01234567890"
  Given I enter subject as "quote"
  Given I enter message as "free quote"
  Given I enter captcha code shown in page as "6P6H"
  When I click on send message button
  Then verify the error message is as "YOUR ENTERED CODE IS INCORRECT."
  And I should see the error message "Validation errors occurred. Please confirm the fields and submit it again."

