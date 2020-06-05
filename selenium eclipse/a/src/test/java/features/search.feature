@tag
Feature: search test

  @tag1
  Scenario: google.com search test
    Given user visits google.com
    When user inputs phone
    Then search page should appear