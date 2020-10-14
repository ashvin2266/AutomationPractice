Feature:
  @api
  Scenario:

    When I trigger GET request with "empty" headers with city as "Bracknell"
    Then I should see response code as 200
    Then I should see response message as "OK"
#    Then I should see response body as"$.suggestions[0].name" is "Bracknell"



  @post
  Scenario:
    When I trigger availability POST Request with "availabilities.json" as a postbody
    Then I should see response code as 200
    Then I should see response message as "OK"