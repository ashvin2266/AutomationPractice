Feature: Car tax
  @tax
  Scenario:I verify the vehicle is taxed or not
#    Given I go to URL as "https://www.gov.uk/"
    When I click on heading as "Driving and transport"
    Then I should see page contain Url as "https://www.gov.uk/browse/driving"
    When I click on Vehicle tax, MOT and insurance link on driving page
    Then I should see page contain Url as "https://www.gov.uk/browse/driving/vehicle-tax-mot-insurance"
    When I click on check if vehicle is taxed link from related content list
    Then I should see page with title as check if a vehicle is taxed contain url as "https://www.gov.uk/check-vehicle-tax"
    When I click on start button on check if vehicle taxed page
    Given I enter registration number of vehicle as "KW56UXJ"
    When I click on continue button on service page
    Then I should see the page contain "Is this the vehicle you are looking for?"
    When I click No search again button
    And click on continue button
    Then I should see page contain Url as "https://vehicleenquiry.service.gov.uk/?locale=en"

