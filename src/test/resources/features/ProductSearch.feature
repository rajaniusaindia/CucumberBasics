@epic102
Feature: Product Search Feature
  @sprint012 @QA @UAT
  Scenario: Search for a product "Apple MacBookPro"
    Given I navigate to amazon website
    When I search for a product "Apple MacBook Pro" with price 1000
    Then I should see the product "Apple MacBook Pro" is displayed

  @sprint013 @QA @UAT
  Scenario: Search for a product "Apple MacBookPro Air"
    Given I navigate to amazon website
    When I search for a product "Apple MacBook Air" with price 800
    Then I should see the product "Apple MacBook Air" is displayed

  @sprint013 @Prod
  Scenario: Search for a product "Iphone 15 Pro Max"
    Given I navigate to amazon website
    When I search for a product "Iphone 15 Pro Max" with price 2000
    Then I should see the product "Iphone 15 Pro Max" is displayed
