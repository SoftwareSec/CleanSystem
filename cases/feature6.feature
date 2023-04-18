Feature: Discount Option for Frequent Customers

  Scenario: Eligible customer receives discount

    Given the customer has made transactions with a total amount greater than 400 NIS
    When the customer makes a transaction
    Then the system applies a 10% discount to the transaction
    And the customer pays the discounted amount

  Scenario: Ineligible customer does not receive discount

    Given the customer has made transactions with a total amount less than or equal to 400 NIS
    When the customer makes a transaction
    Then the system does not apply a discount to the transaction
    And the customer pays the full amount
