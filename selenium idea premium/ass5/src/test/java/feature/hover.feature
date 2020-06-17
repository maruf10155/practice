Feature: hovwer on an item

  @tag1
  Scenario: hover test
    Given user visits automationpractice.com
    When browser is fullscreen
    And user hovers on an item
    Then user should see "Add to cart"

  @tag2
  Scenario: hover test
    Given user visits automationpractice.com
    When browser is fullscreen
    And user hovers on an item
    Then user should see "Quick view" (one)
    When user clicks on "Quick view"
    Then user will see a popup