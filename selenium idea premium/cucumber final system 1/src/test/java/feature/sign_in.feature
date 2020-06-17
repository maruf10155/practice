@sign_in
Feature: login test

  @positive_test
  Scenario: positive test
    Given go to website
    And goto login page
    When user inputs valid user name "zxc123" and password "123456"
    Then user see find a flight page
    When user clicks log-off
    Then user will log out

  @negative_test
  Scenario Outline: negative test
    Given go to website
    And goto login page
    When user inputs valid user name "<user>" and password "<pass>"
    Then user stays on log on page
    Examples:
    |user|pass|
    |zxcqwer|123456|
    |maruf  |asdfghjkl|
    |love  |love |
