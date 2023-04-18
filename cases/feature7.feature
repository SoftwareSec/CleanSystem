Feature: Generate Statistics

  Scenario: View statistics for delivered items and payments
    Given the delivery service has completed deliveries
    When the user requests the statistics
    Then the system should display the total number of delivered items
    And the system should display the total amount of cash received
    And the system should display the total amount of payments made
    And the system should display the total amount of debts owed
