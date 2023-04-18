Feature: Login
  I want to login on Shining Carpets
  Background:
    Given I go to login choise
    And the field 'email' is empty
    And the field 'password' is empty

  Scenario:empty fields
    When I click on login and flag is 'true'
    Then field 'email' should be with error
    And field 'password' should be with error

  Scenario: Wrong password
    When he fills in 'email' with 'sulaiman@gmail.com'
    And  be fills in 'password' with '123456'
    And  I click on loain and flag is 'true'
    Then T should see 'E-mail on paseword is incorrect!'

    Scenario: Login successfully
      When he fills in 'email' with 'sualiman@gmail.com'
      And  he fill in 'passowrd' with '123456'
      And  I click on login and flag is 'true'
      Then I should see 'Welcome to Shoning Carpets'