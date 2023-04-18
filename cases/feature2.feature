Feature: Information for the product



  Scenario: empty information
    When user click on save and flag is 'true'
    Then the field 'Name' shoud be an eppor
    And the field 'Quantity' shoud be an error the field 'Size' shoud be an eppon
    And the field 'Colon' shoud be an error
    And the field 'Price' shoud be an error

  Scenario:  a successful insert
    Given user is on the page
    When user click on insert and flag is "true"
    And he fill in the field 'Name' with "carpet"
    And he fill in the field 'Quantity' with "2"
    And he fill in the field 'Size' with "2"
    And he fill in the field 'Color' with "red"
    And he fill in the field 'Price' with "100"
    And he press on 'save' and flag is "true"
    Then the user should see the message "The product was saved"


    Scenario Outline: errors with input
      When user click on insert and flag is 'true'
      And he fill in the field 'Name' with '<name>'
        And he fill in the field 'Quantity' with '<quantity>'
        And he fill in the field 'Size' with '<size>'
        And he fill in the field 'Color' with '<color>'
        And he fill in the field 'Price' with '<price>'
        And he press on 'save' and flag is 'true'
        Then the user should see the message '<message>'

      Examples:
      | name | quantity | size | color | price | message               |
      |carpet| 2        | 2    | red   | 100   | The product was saved |
      |carpet| 2        | 2    | red   | 100   | The product was saved |
      |ground| 2        | 2    | red   | 100   | The product was saved |
      |carpet| 2        | 2    | red   | 100   | The product was saved |

