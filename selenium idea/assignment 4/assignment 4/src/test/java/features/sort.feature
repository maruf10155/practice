@tag
Feature: Sort search ascending order

  @tag1
  Scenario: Serach result will be sorted
    Given User visits amazon.com
    And User inputs iphone in search box
    And Search result will display
    When user Click on drop down menu
    And Clicks on low to high
    Then Search result will be sorted

