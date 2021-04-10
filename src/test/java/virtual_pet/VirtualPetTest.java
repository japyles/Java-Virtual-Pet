package virtual_pet;

import org.junit.jupiter.api.Test;

public class VirtualPetTest {
    VirtualPetApplication underTest = new VirtualPetApplication();

    @Test
    public void shouldFeedPet {
        String response = menuOption("1");
        assertEquals("1", response);
    }
}
