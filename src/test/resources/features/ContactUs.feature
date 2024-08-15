Feature: Contact Us Feature

  Scenario: Raising the complain
    Given I am on the complain page of the web-shop application
    When I enter the following details on the inquiry box
    # 3 colons and hit enter - called Doc String very common the web applications
    """
    Hi,
I am not able to login to my account
My username: rajaniusaindia@gmail
Requesting you to kindly unlock my account

    """

    Then I should see the success message