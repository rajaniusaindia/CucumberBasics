@epic101
Feature: Login with multiple accounts

  @sprint01 @QA
  Scenario Outline: Login with valid credentials
    Given I navigate to actimind website
    When I am on the login page of the application

    Then I entered "<username>" username
    And I entered "<password>" password
    And I clicked on login button

    Then I "<status>" successfully logged in

  Examples:
  | username | password | status |
  | valid | valid | should not |
  | valid | invalid | should be |
  | invalid | valid | should not |
  | invalid | invalid | should not |
  | valid |  | should not |

