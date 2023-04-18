Feature: Notify Customer by Email when Order is Complete

  Scenario: Customer receives an email when the order is complete
    Given a customer has placed an order
    When the order is marked as complete
    Then the system sends an email notification to the customer with the order details

  Scenario: Customer does not receive an email when the order is incomplete
    Given a customer has placed an order
    When the order is marked as incomplete
    Then the system does not send an email notification to the customer