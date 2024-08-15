@epic102
Feature: Hotel Booking Feature

  Background:
    Given I navigate to booking website

  @sprint01 @bvt
  Scenario: Booking a room of type "Deluxe"
    When I select the room type as "deluxe"
    And I select the check-in date as "06-2-2024" and check-out date as "06-05-2024"
    And I choose no of guests as 4
    Then I should see "booking-confirmed" message with 1021 as booking id

  @sprint02 @Smoke
  Scenario: Booking a room of type "Standard"
    When I select the room type as "standard"
    And I select the check-in date as "12-10-2024" and check-out date as "12-26-2024"
    And I choose no of guests as 10
    Then I should see "booking-confirmed" message with 1633 as booking id

  @sprint02 @Prod
  Scenario: Booking a room of type "Suite"
    When I select the room type as "Suite"
    And I select the check-in date as "10-25-2024" and check-out date as "10-26-2024"
    And I choose no of guests as 2
    Then I should see "booking-confirmed" message with 1899 as booking id

  @sprint02 @QA
  Scenario: Booking a room of type "Villa"
    When I select the room type as "Villa"
    And I select the check-in date as "10-25-2024" and check-out date as "10-26-2024"
    And I choose no of guests as 2
    Then I should see "booking-rejected" message with 0 as booking id