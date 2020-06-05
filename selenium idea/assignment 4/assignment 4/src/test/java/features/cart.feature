@tag
Feature: Cart function

  @tag1
  Scenario: user can add an item to cart
    Given User visits amazon.com (ver2)
    And serches phone
    And click on first search
    When user click add to cart
    Then a page will appear with showing "Added to cart"