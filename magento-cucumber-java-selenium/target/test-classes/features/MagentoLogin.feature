Feature: Test login functionality for Magento

  Scenario Outline: Check login is successful with valid credentials
    Given browser is opened
    And user navigates to homepage
    When user clicks on sign in
    Then user is on login page
    When user enters valid username <username> and password <password>
    Then user is navigated to homepage

    Examples: 
      | username         | password  |
      | abcd_123@xyz.com | @Bcd#123$ |
