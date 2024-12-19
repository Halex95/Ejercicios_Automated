Feature: Actualizar el nombre y estatus de una mascota

  Background:
    * url baseUrl
    * path 'pet'
    * def updatedPetData =
    """
    {
      "id": 12345,
      "name": "Max",
      "status": "sold"
    }
    """

  Scenario: Actualizar la mascota
    Given request updatedPetData
    When method PUT
    Then status 200
    And match response.id == 12345
    And match response.name == "Max"
    And match response.status == "sold"
