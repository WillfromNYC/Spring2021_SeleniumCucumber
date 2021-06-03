Feature:

  Scenario: Verify user see "Incorrect email or phone number" error msg when login with no credentials on facebook messenger
    Given  I am on facebook homepage
    When I click messenger link
    And I Click on Log in
    Then I Verify error message 'Incorrect email or phone number' is displayed
