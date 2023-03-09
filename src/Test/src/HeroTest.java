package src;

import org.junit.Test;
import static org.junit.Assert.*;

public class HeroTest {

    @Test
    public void testConstructor() {
        Hero hero = new Hero(100, 10, true);
        assertEquals(hero.getName(), "Mr. Capy");
        assertEquals(hero.getHealth(), 100, 0.1);
        assertEquals(hero.getAttackPower(), 10, 0.1);
        assertTrue(hero.isAlive());
        assertEquals(hero.getLevel(), 1);
        assertEquals(hero.getExperience(), 0);
        assertEquals(hero.getMoney(), 0.0f, 0.1);
        assertEquals(hero.getInventory().length, 5);
    }

    @Test
    public void testFight() {
        Hero hero = new Hero(100, 10, true);
        Enemy enemy = new Enemy("Evil Capy", 50, 5, true);
        hero.fight(enemy);
        assertTrue(enemy.getHealth() < 50);
    }

    @Test
    public void testUseItem() {
        Hero hero = new Hero(100, 10, true);
        Item potion = new Item("Potion", 20);
        hero.addToInventory(potion);
        int healingAmount = hero.useItem(0);
        assertEquals(hero.getHealth(), 120, 0.1);
        assertEquals(healingAmount, 20);
    }

    @Test
    public void testLevelUp() {
        Hero hero = new Hero(100, 10, true);
        hero.setExperience(110);
        hero.levelUp();
        assertEquals(hero.getLevel(), 2);
        assertEquals(hero.getExperience(), 0);
    }

    @Test
    public void testAddToInventory() {
        Hero hero = new Hero(100, 10, true);
        Item potion = new Item("Potion", 20);
        assertTrue(hero.addToInventory(potion));
        assertEquals(hero.getInventory()[0], potion);
        assertFalse(hero.addToInventory(potion));
    }

    @Test
    public void testShowInventory() {
        Hero hero = new Hero(100, 10, true);
        Item potion = new Item("Potion", 20);
        Item elixir = new Item("Potion", 30);
        hero.addToInventory(potion);
        hero.addToInventory(elixir);
        String expected = "Potion, Potion";
        String actual = hero.showInventory();
        assertEquals(actual, expected);
    }

    @Test
    public void testInfo() {
        Hero hero = new Hero(100, 10, true);
        Item potion = new Item("Potion", 20);
        hero.addToInventory(potion);
        String expected = "Name: Mr. Capy\nHealth: 100.0\nAttack Power:10.0\nIs Alive:trueMoney: 0.0\nExperience: 0\nLevel:1\ninventory:[Lsrc.Item;@<some hash code>";
        String actual = hero.info();
        assertEquals(actual, expected);
    }
}
