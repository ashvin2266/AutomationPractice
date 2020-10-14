@screw

Feature: Registration
  Scenario:
#    Given I go to URL "https://www.screwfix.com"
    When I click on sign in/Register button at home page
    Then I should see sign in /Register page url as"https://www.screwfix.com/loginpage/"
    When I click on Registration button at register page
    Then I should see create a web account page
    Given I enter a valid email address as "zab@hotmail.com"
    When I click on continue button at create a web account page
    Then I should see a registration form at Url as "https://www.screwfix.com/registrationpage/?destination=&loginPagePath=%2Floginpage%2F&_requestid=330592"
    When I select title as "Mr."
    Given I enter valid first name as "first test"
    Given I enter valid last name as "last test"
    When I select profession as "DIY"
    Given I enter my post code is "KT1 2PY"
    When I click on find address button
#    When I  click on ADDRESSES SEARCH RESULTS
    Then I select address as "49 Fairfield Road, KINGSTON ON THAMES, Surrey, KT1  2PY"
    And I choose address as "49 Fairfield Road, KINGSTON ON THAMES, Surrey, KT1  2PY"
#    When I select Country as "United Kingdom"
    Given I enter  password "Abcd1234"
    Given I enter confirm password "Abcd1234"
    When I click on "email" as select contact preferences
    When I click registration now button
#    Then I should see message is as "THANK YOU for saving your details first test"
#    Then I see continue shopping button
    And  I see URL as "https://www.screwfix.com/jsp/registerSuccess.jsp"
