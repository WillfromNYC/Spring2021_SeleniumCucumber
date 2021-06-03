Feature:

  Scenario: Click create account, fill information and check if sex radio is selected
    Given  I am on facebook homepage
    When click create account
    And I fill out the first name
    And I fill out the last name
    And I fill username/email
    And I fill out password
    And I select the month
    And I select the day
    And I select the year
    Then I verify sex button radio is selected or not

