Feature: Login Functionality

  Scenario: Successful Login
    Given User is on login page
    When User enters valid username and password
    And Clicks login button
    Then User should be redirected to homepage
