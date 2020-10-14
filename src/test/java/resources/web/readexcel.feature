Feature:
  @excel
  Scenario: Read Excel file
    Given I am reading a Excel file "car_data.xlsx"
    Given I enter first registration no from excel sheet as "registrationNo"
    When I click on continue button on service page
    Then I should see page contain Url as "https://vehicleenquiry.service.gov.uk/ConfirmVehicle?locale=en"
   Then I should see  first registration no's Make as "THWAITES"
    And I should see first cars's colour is "YELLOW"
    And I should see page contain Url as "https://vehicleenquiry.service.gov.uk/?locale=en"
    When I click No search again button on page
    And click on continue button
    Then I should see page contain Url as "https://vehicleenquiry.service.gov.uk/?locale=en"
    Given I am reading a Excel file "car_data.xlsx"
    Given I enter second registration no from excel sheet as "<registrationNo>"
    When I click on continue button on service page
    Then I should see  first registration no's Make as "VAUXHALL"
    And I should see first cars's colour is "GREY"
    And I should see page contain Url as "https://vehicleenquiry.service.gov.uk/?locale=en"
    When I click No search again button on page
    And click on continue button
    Given I am reading a Excel file "car_data.xlsx"
    Given I enter Third registration no from excel sheet as "<registrationNo>"
    When I click on continue button on service page
    Then I should see  first registration no's Make as "VAUXHALL"
    And I should see first cars's colour is "SILVER"
    And I should see page contain Url as "https://vehicleenquiry.service.gov.uk/ConfirmVehicle"
    When I click No search again button on page
    And click on continue button


#   second method
  @excel1
  Scenario:
    Given I am reading a Excel file "car_data.xlsx"
    Then i should verify registration detail