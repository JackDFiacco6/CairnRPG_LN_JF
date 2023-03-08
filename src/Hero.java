package src;

public class Hero extends Character {
    private int level = 1;
    private int experience = 0;
    private float money = 0.0f;
    private Item[] inventory = new Item[5];

    public Hero(String name, double health, double attackPower, boolean isAlive){
        super("Fjords of Capybaras", health, attackPower, isAlive);
        // Then add one Potion to the inventory (i.e. newItem('Potion',20))
    }

}
