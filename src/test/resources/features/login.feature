Feature: doing testing
  Scenario: validate login
    Given I am opening sauce page
    Then I enter "standard_user" as username
    Then I enter "secret_sauce" as password
    And I click login button