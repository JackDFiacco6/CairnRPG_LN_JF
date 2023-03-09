package src;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

public class BossTest {

    @Test
    public void testConstructor() {
        Boss boss = new Boss(100, 10, true);
        assertEquals("Capy Boss", boss.getName(), "Boss's name should be Capy Boss");
        assertEquals(100, boss.getHealth(), "Boss's health should be 100");
        assertEquals(10, boss.getAttackPower(), "Boss's attack power should be 10");
        assertTrue(boss.isAlive(), "Boss should be alive");
        assertEquals(3, boss.getUltrasLeft(), "Initial ultrasLeft should be 3");
    }

    @Test
    public void testFight() {
        Boss boss = new Boss(100, 10, true);
        Hero hero = new Hero(100, 5, true);
        boss.fight(hero);
        assertTrue(hero.getHealth() < 100, "Hero's health should be less than 100 after the fight");
    }

}
