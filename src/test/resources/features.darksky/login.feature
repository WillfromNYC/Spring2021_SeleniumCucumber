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
    Given : I am on facebook