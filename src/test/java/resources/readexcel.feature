Feature:
  @excel
  Scenario: Read Excel file
    Given I am reading a Excel file "car_data.xlsx"
    Given I enter first registration no from excel sheet as "registrationNo"
    When I click on continue button on service page
    Then I should see  first registration no's make as "THWAITES"
    And I should see first cars's colour is "YELLOW"
    And I should see page contain Url as "https://vehicleenquiry.service.gov.uk/ConfirmVehicle"
    When I click No search again button on page
    And click on continue button
    Then I should see page contain Url as "https://vehicleenquiry.service.gov.uk/ViewVehicle"
    Given I enter second reg,no from excel sheet as "registrationNo"
    When I click on continue button on service page
    Then I should see  first registration no's make as "VAUXHALL"
    And I should see first cars's colour is "GREY"
    And I should see page contain Url as "https://vehicleenquiry.service.gov.uk/ConfirmVehicle"
    When I click No search again button on page
    And click on continue button

#