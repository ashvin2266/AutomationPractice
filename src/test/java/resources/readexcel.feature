Feature:
  @excel
  Scenario: Read Excel file
    Given I am reading a Excel file "car_data.xlsx"
    When I click on continue button on service page
#    Then I should see the page contain "Is this the vehicle you are looking for?"
    When I click No search again button on page
    And click on continue button
#    Then I should see page contain Url as "https://vehicleenquiry.service.gov.uk/ViewVehicle"