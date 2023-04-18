Feature: Distribute orders to available workers

  Scenario: Assign orders to workers
    Given there are orders to be fulfilled
    And there are workers available to fulfill them
    When the system assigns orders to workers
    Then each worker should have at least one order assigned to them

  Scenario: Monitor progress in real-time
    Given orders have been assigned to workers
    When the manager monitors the progress in real-time
    Then they should be able to see which orders are being worked on and which workers are available

  Scenario: Prioritize orders based on urgency and importance
    Given there are orders with different levels of urgency and importance
    When the system prioritizes the orders
    Then the most urgent and important orders should be assigned to workers first

  Scenario: Balance workload among workers
    Given there are multiple workers available to fulfill orders
    When the system assigns orders to workers
    Then the workload should be distributed evenly among them