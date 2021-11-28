@Trips
Feature: Search flight details
  I want to use this template for my flight details search

  @OnewayTrip
  Scenario: Search One way flight details
    Given I am on makemytrip
    When I perform one way search
      | From | Delhi  |
      | To   | Mumbai |
    Then Search results should be display availabe flights

  @RoundTrip
  Scenario: Search round way flight details
    Given I am on makemytrip
    When I perform roundtrip search
      | From | Mumbai |
      | To   | Delhi  |
    Then Search results should be display availabe flights