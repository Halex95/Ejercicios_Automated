Feature: Consultar la mascota ingresada previamente

  Background:
    * url baseUrl
    * path 'pet'

  Scenario: Obtener una mascota por ID
    Given path '12345'
    When method GET
    Then status 200
    And match response.id == 12345
    And match response.name == "Bobby"
