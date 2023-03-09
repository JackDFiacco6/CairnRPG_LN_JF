package src;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class WorldTest {

    @Test
    void testConstructor() {
        World world = new World("Fjord of Capybara's", "Laina and Jack");
        assertEquals("Fjord of Capybara's", world.getGameName());
        assertEquals("Capybara Games", world.getPublisher());
    }
}