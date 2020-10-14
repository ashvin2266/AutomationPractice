
@star
Feature:
  @star1
  Scenario:
    When I click on my account button at home page
    Then I should see the login page contain url as "https://bookings.startours.co.uk/Secure/User/Login?ReturnUrl=%2fSecure%2fUser"
    When I click on a register button on login page
    Then I should see register page contain title as "new user account"
    Given I select title is as "Mr"
    Given I enter first name is as "test1"
    Given I enter Surname is  as "test2"
    Given I enter postcode as"tw4 5eu"
    When I click a find address button
#    Then I should see the list of house no
    Given I select House no is as "35 Avondale Gardens,Hounslow "
    Given I enter valid email address as "xyzabc@gmail.com"
    Given I enter confirm email address as "xyzabc@gmail.com"
    Given I enter day time Tel No as "1234567890"
    Given I enter Evening Tel No as "1234567890"
    Given I enter Mobile no is as "1234567890"
    Given  I enter Fax No as "1234567890"
    Given I choose prefered contact method as "email"
    Given I enter a valid password is as "Abcd12345"
    Given I enter a confirm password as "Abcd12345"
    When I click on creat Account button
#    Then I should see my account page Url as "https://bookings.startours.co.uk/Secure/User"
    Then I should see error message  as "The e-mail address you have specified is already in use."

    @star2
    Scenario: When i enter valid email and password for login
      When I click on my account button at home page
      Then I should see the login page contain url as "https://bookings.startours.co.uk/Secure/User/Login?ReturnUrl=%2fSecure%2fUser"
      Given I enter valid email address is as "xyzabc@gmail.com"
      Given I enter a valid password  as "Abcd12345"
      When I click on login button
      Then I should see my account page url is as "https://bookings.startours.co.uk/Secure/User"
      And I should see page title as "Star Tours"
      @star3
      Scenario: search for holidays
        When I click on dropdown box on home page
        Then I should see the all holiday list for selection
        Given I choose holiday from list is as "UK Holidays"
        When I click on when would you like to travel drop box
        Then I should see list of months
        Given I choose from list as "October 2019"
        When I click on how many passenger drop box
        Then I should see list of how many passengers is displayed
        Given I choose  passenger no, from list as "5"
        When I click on search button on this page
        Then I should see the message is as "Found 29 results between 08/10/2019 and 31/10/2019 for 5 passengers"
        And I should see the heading of the page is "Search Results"
