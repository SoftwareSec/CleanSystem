Feature: Generate Invoice for Customer

  As a customer of cleaning services provided by Shining Carpets,
  I want to receive an invoice including delivery information, price, address, and items that I have given to clean.

  Background:
    Given I am logged in to my Shining Carpets account
    And I have items to be cleaned in my possession

  Scenario: Generate Invoice for Cleaning Services
    Given I have provided my delivery information, including my name, address, and phone number
    And I have provided a list of items that I want to be cleaned
    When I select the type of cleaning service and the preferred delivery time
    And I click on the "Generate Invoice" button
    Then I should see the total price of the cleaning services on the invoice
    And the invoice should include the details of the items to be cleaned, such as the name and quantity of each item
    And the invoice should include the delivery information, such as the delivery address and phone number


