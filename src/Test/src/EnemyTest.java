package src;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

public class EnemyTest {

    @Test
    public void testConstructor1() {
        Enemy enemy = new Enemy(100, 10, true);
        assertEquals("Evil Capy", enemy.getName());
        assertEquals(100, enemy.getHealth());
        assertEquals(10, enemy.getAttackPower());
        assertTrue(enemy.isAlive());
    }

    @Test
    public void testConstructor2() {
        Enemy enemy = new Enemy("Evil capy", 50, 5, true);
        assertEquals("Evil capy", enemy.getName());
        assertEquals(50, enemy.getHealth());
        assertEquals(5, enemy.getAttackPower());
        assertTrue(enemy.isAlive());
    }

    @Test
    public void testFight() {
        Hero hero = new Hero(100, 20, true);
        Enemy enemy = new Enemy(50, 5, true);
        double heroHealthBefore = hero.getHealth();
        enemy.fight(hero);
        double heroHealthAfter = hero.getHealth();
        double expectedDamage = enemy.getAttackPower();
        assertTrue(heroHealthAfter < heroHealthBefore);
        assertTrue(heroHealthBefore - heroHealthAfter == expectedDamage);
    }

    @Test
    public void testGetMagicPoints() {
        Enemy enemy = new Enemy(100, 10, true);
        enemy.setMagicPoints(20);
        assertEquals(20, enemy.getMagicPoints());
    }

    @Test
    public void testSetMagicPoints() {
        Enemy enemy = new Enemy(100, 10, true);
        enemy.setMagicPoints(20);
        assertEquals(20, enemy.getMagicPoints());
        enemy.setMagicPoints(30);
        assertEquals(30, enemy.getMagicPoints());
    }

}
