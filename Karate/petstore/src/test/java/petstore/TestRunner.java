package petstore;

import com.intuit.karate.junit5.Karate;

class TestRunner {

    @Karate.Test
    Karate testPetStore() {
        return Karate.run("add_pet", "get_pet", "update_pet", "get_pet_by_status")
                     .relativeTo(getClass());
    }
}
