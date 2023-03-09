package src;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class CharacterTest {

    @Test
    void testCharacterInfo1() {
        Character character = new Character("Mr.Capy", 100, 80, true);
        assertEquals("Name: Capi\nHealth: 100.0\nAttack Power:80.0\nIs Alivetrue", character.info());
    }

    @Test
    void testCharacterInfo2() {
        Character character = new Character("Mrs.Capy", 50, 30, false);
        assertEquals("Name: Bob\nHealth: 50.0\nAttack Power:30.0\nIs Alivefalse", character.info());
    }

    @Test
    void testRunAway1() {
        Character character = new Character("Mr.Capy", 100, 80, true);
        assertTrue(character.runAway());
    }

    @Test
    void testRunAway2() {
        Character character = new Character("Mr.Capy", 100, 80, true);
        assertFalse(character.runAway());
    }
}