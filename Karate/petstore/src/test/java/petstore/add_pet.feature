Feature: Añadir una mascota a la tienda

  Background:
    * url baseUrl
    * path 'pet'
    * def petData =
    """
    {
      "id": 12345,
      "name": "Bobby",
      "status": "available"
    }
    """

  Scenario: Añadir una mascota
    Given request petData
    When method POST
    Then status 200
    And match response.id == 12345
    And match response.name == "Bobby"
    And match response.status == "available"
