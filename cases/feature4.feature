Feature: Generate Customized Reports About Business

  Scenario: User generates a report about sales for the previous month

    Given the user is logged in to the business application
    And the user has permission to generate reports
    And the user has selected the "Sales Report" option

    When the user selects "Previous Month" as the date range
    And the user selects the desired fields to include in the report
    And the user selects the desired format for the report

    Then the system generates a customized report about sales for the previous month
    And the report includes only the fields selected by the user
    And the report is in the format selected by the user
    And the user is able to download and/or print the report.


