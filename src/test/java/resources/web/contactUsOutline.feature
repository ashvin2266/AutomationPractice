Feature: contact us
  @contact11
  Scenario Outline: :contact us with valid detail
    When I click on contact us on home page
    Given I selected subject heading as "<sub_heading>"
    Given I enter a valid email as"<email>"
    Given I enter order reference as "<order_ref>"
    Given I enter a message as "<message 1>"
    Given I attached file
    When I click on send button
    Then I should see url as "http://automationpractice.com/index.php?controller=contact"
    Then I should see the message as "<message>"
  Examples:
    | sub_heading       | email           | order_ref       | message 1                  | message                                             |
    | Customer service | abg@hotmail.com | A012345         | Its regarding your product | Your message has been successfully sent to our team. |
    | Webmaster        | abg@hotmail.com | A012345         | Its regarding your product | Your message has been successfully sent to our team. |
    | Customer service | abg@hotmail.com   |               | Its regarding your product | Your message has been successfully sent to our team. |
    | Customer service  | abg@hotmail.com | A012345         |                           | The message cannot be blank.                        |
     | Webmaster        | abg@hotmail.com |                | Its regarding your product | Your message has been successfully sent to our team. |
    | Webmaster        | abg@hotmail.com | A012345          |                           | The message cannot be blank                         |
    | Webmaster        | abghotmail.com  | A012345         | Its regarding your product |  Invalid email address.            |
    | Customer service | abghotmail.com  | A012345         | Its regarding your product | Invalid email address.            |
    | Customer service |                 |                 |                            | Invalid email address.             |
    | Webmaster        |                 |                 |                            | Invalid email address.             |

  @contactDataTable
  Scenario:contact us with valid detail
    When I click on contact us on home page
    Given I selected subject heading as
    |Customer service|
    Given I enter a valid detail
      | email           | order_ref | message 1                  |
      | abg@hotmail.com | A012345   | Its regarding your product |
    Given I attached file
    When I click on send button
    Then I should see url as "http://automationpractice.com/index.php?controller=contact"
    Then I should see the message as "Your message has been successfully sent to our team."
