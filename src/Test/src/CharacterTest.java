package src;

import org.testng.annotations.Test;

import static org.junit.jupiter.api.Assertions.*;

class CharacterTest {
    @Test
    void info() {
        var test_subject = new Character("Capi", 100, 100, true);
        assertEquals("Character name: Capi, Health: 100, Attack Power: 100, Is Alive: True",test_subject.info());
    }
}