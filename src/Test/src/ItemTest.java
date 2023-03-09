package src;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

public class ItemTest {
    @Test
    public void testConstructor1() {
        Item item = new Item();
        assertEquals("Poison", item.getName());
        assertEquals(25, item.getHealingPower());
    }

    @Test
    public void testConstructor2() {
        Item item = new Item("Potion", 50);
        assertEquals("Potion", item.getName());
        assertEquals(50, item.getHealingPower());
    }

    @Test
    public void testItemInfo() {
        Item item = new Item("Potion", 50);
        assertEquals("Item name: Potion, Healing Power: 50", item.Info());
    }

}