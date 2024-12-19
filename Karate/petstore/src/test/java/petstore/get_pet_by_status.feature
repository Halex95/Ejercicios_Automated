Feature: Consultar mascotas por estatus

  Background:
    * url baseUrl
    * path 'pet/findByStatus'

  Scenario: Obtener mascotas con estatus "sold"
    Given param status = 'sold'
    When method GET
    Then status 200
    And match response[*].status contains 'sold'
