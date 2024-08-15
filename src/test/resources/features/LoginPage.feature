@epic100
Feature: Login Feature
    @sprint10 @Smoke
    Scenario: Login with valid credentials
        Given I navigate to actimind website
        When I am on the login page of the application
        Then I entered "valid" username
        And I entered "valid" password
        And I clicked on login button
        Then I "should be" successfully logged in






