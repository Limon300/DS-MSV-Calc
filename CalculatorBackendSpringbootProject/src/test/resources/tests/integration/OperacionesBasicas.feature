Feature: Llamar operaciones basicas a la API
  Scenario: client makes call to POST /sumar
    Given the first number is 12
    And the second number is 8
    When the client calls "/sumar"
    Then the client receives status code of 200
    And the client receives result = 20.0

  Scenario: client makes call to POST /restar
    Given the first number is 12
    And the second number is 8
    When the client calls "/restar"
    Then the client receives status code of 200
    And the client receives result = 4.0

  Scenario: client makes call to POST /multiplicar
    Given the first number is 12
    And the second number is 8
    When the client calls "/multiplicar"
    Then the client receives status code of 200
    And the client receives result = 96.0

  Scenario: client makes call to POST /dividir
    Given the first number is 12
    And the second number is 8
    When the client calls "/dividir"
    Then the client receives status code of 200
    And the client receives result = 1.5

  Scenario: client makes call to POST /dividir and tries to divide by 0
    Given the first number is 12
    And the second number is 0
    When the client calls "/dividir"
    Then the client receives status code of 500