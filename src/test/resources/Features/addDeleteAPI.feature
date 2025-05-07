Feature: Add and Delete a User via API
  @BE
  Scenario: Add a new user and then delete the same user
    Given I have the user credentials for user
    When I set url "url" and end point "endPoint"
    And I get body for Api call from " DDT.json"
    And I perform "POST" request
    Then I verify that the status code is "200"
    And I store the id of created user
    And I clear All
    And I have the user credentials for user
    When I set url "url" and end point "endPoint"
    And I build body with new ID
    And I perform "Delete" request
    Then I verify that the status code is "200"
