Feature: Login

  /**
  * Task1: (darksky.net)
  *
  * 1. Open darksky page
  * 2. Scroll to Today timeline
  * 3. Click the + button
  * 4. Verify tempValues (low and high) on timeline is same as tempValue in the Today's detail
  *
  */
  Scenario: Open darksky website to check today's time, and verify the temp values of low and high at the top home screen are the same the temp value in there
    Given  I am on Darksky homepage
    When get the low and high temp
    And I scroll down and click on Time Machine
    And I get today low and high temp
    Then I verify front page temps equal to Time machine today's temps