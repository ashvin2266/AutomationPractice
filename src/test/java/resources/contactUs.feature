Feature: contact us
  @contact1
  Scenario:contact us with valid detail 1
    When I click on contact us on home page
    Then I should see the url contains "contact"
    Given I selected subject heading as "Customer service"
    Given I enter a valid email as"abg@hotmail.com"
    Given I enter order reference as "A012345"
    Given I enter a message as "Its regarding your product quality"
    Given I attached file
    When I click on send button
    Then I should see url as "http://automationpractice.com/index.php?controller=contact"
    Then I should see the message as "Your message has been successfully sent to our team."
  @contact2
  Scenario:contact us with valid detail 2
    When  I click on contact us on home page
    Given I selected subject heading as "Webmaster"
    Given I enter a valid email as"abg@hotmail.com"
    Given I enter order reference as "A012345"
    Given I enter a message as "Its regarding your product quality"
    Given I attached file
    When I click on send button
    Then I should see the message as "Your message has been successfully sent to our team."
    @contact3
   Scenario: contact us with valid detail 3
    When I click on contact us on home page
    Given I selected subject heading as "Customer service"
    Given I enter a valid email as"abg@hotmail.com"
    Given I enter order reference as ""
    Given I enter a message as "Its regarding your product quality"
    Given I attached file
    When I click on send button
    Then I should see url as "http://automationpractice.com/index.php?controller=contact"
    Then I should see the message as "There is 1 error Invalid email address."
  @contact4
   Scenario: contact us with valid detail 4
    When I click on contact us on home page
    Given I selected subject heading as "Customer service"
    Given I enter a valid email as"abg@hotmail.com"
    Given I enter order reference as "A012345"
    Given I enter a message as ""
    Given I attached file
    When I click on send button
    Then I should see url as "http://automationpractice.com/index.php?controller=contact"
    Then I should see the message as "There is 1 error The message cannot be blank."
    @contact5
  Scenario: contact with valid detail 5
    When  I click on contact us on home page
    Given I selected subject heading as "Webmaster"
    Given I enter a valid email as"abg@hotmail.com"
    Given I enter order reference as " "
    Given I enter a message as "Its regarding your product quality"
    Given I attached file
    When I click on send button
    Then I should see the message as "Your message has been successfully sent to our team."
      @contact6
  Scenario: contact with valid detail 6
    When  I click on contact us on home page
    Given I selected subject heading as "Webmaster"
    Given I enter a valid email as"abg@hotmail.com"
    Given I enter order reference as "A012345"
    Given I enter a message as ""
    Given I attached file
    When I click on send button
    Then I should see the message as "The message cannot be blank.."
  @contact7
  Scenario: contact us with invalid email 7
    When  I click on contact us on home page
    Given I selected subject heading as "Webmaster"
    Given I enter a valid email as"abg mail.com"
    Given I enter order reference as "A012345"
    Given I enter a message as "Its regarding your product quality"
    Given I attached file
    When I click on send button
    Then I should see the message as "There is 1 error Invalid email address."
    @contact8
  Scenario: contact us with invalid email 8
    When  I click on contact us on home page
    Then I should see the url contains "contact"
    Given I selected subject heading as "Customer service"
    Given I enter a valid email as"abg mail.com"
    Given I enter order reference as "A012345"
    Given I enter a message as "Its regarding your product quality"
    Given I attached file
    When I click on send button
    Then I should see the message as "There is 1 error Invalid email address."
    Then I should not see sign Out button
    And i should see sign in button
#    Then I should see Contact Us button
    When I click Browser back button
    Then I should not see the message as a "There is 1 error Invalid email address."
    When I click browser forward button
    Then I should see the message as a "There is 1 error Invalid email address."
   @contact9
  Scenario: contact us without file attached 9
    When  I click on contact us on home page
    Given I selected subject heading as "Webmaster"
    Given I enter a valid email as"abg@hotmail.com"
    Given I enter order reference as "A012345"
    Given I enter a message as "Its regarding your product quality"
    Given I enter without attached file
    When I click on send button
    Then I should see the message as "Your message has been successfully sent to our team."
    @contact10
  Scenario: contact us without file attached 10
    When  I click on contact us on home page
    Given I selected subject heading as "Customer service"
    Given I enter a valid email as"abg@hotmail.com"
    Given I enter order reference as "A012345"
    Given I enter a message as "Its regarding your product quality"
    Given I enter without attached file
    When I click on send button
    Then I should see the message as "Your message has been successfully sent to our team."


