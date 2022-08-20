Feature: Bill pay Functionalty
  Background:
    Given Navigate to ParaSoft
    When Enter username as "grup6" and password as "123456" and click login button
    Then User should login successfuly
  Scenario Outline: Bill Pay
    When user click bill pay button and enter payee information
    Then enter Payee Name as"<PayeeName>" Amount as "<Amount>"
    And  bill payment should be completed
    Examples:
      | PayeeName | Amount |
      | Elektrik  | 85     |
      | su        | 45     |
      | Dogalgaz  | 120    |