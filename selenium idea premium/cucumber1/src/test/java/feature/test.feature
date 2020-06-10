Feature: test feature
  Scenario Outline: testing feature
    Given given name is "<name>"
    When password is "<password>"
    Then print all
  Examples:
    |name|password|
    |qwe|123|
    |asd|4568963|
    |zxc|789|