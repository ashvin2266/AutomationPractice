@quote
Feature:get a quote

  Scenario:
#  Given I enter url as "https://www.d3dsecurity.co.uk"
  When I click log in button on Home page
  Given I enter first name as "first quote"
  Given I enter last name as "last quote"
  Given I enter email address as "abg@hotmail.com"
  Given I enter my phone number as"01234567890"
  Given I enter subject as "quote"
  Given I enter message as "free quote"
  Given I enter captcha code shown in page as "6P6H"
  When I click on send message button
  Then I should see the message "Thanks For Inquiry, We will Contact you Soon !!"

