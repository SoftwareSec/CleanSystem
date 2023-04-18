Feature: Track the Orders and the Status

  Scenario: User tracks the status of an order

    Given the user is logged in to the order tracking system
    And the user has permission to view orders
    And the user has an order to track

    When the user selects the "Track Order" option
    And enters the order number
    And clicks the "Track" button

    Then the system displays the status of the order
    And if the order is in "waiting" status, the system displays the estimated time for treatment
    And if the order is in "in treatment" status, the system displays the progress of the treatment
    And if the order is in "complete" status, the system displays the date and time of completion.