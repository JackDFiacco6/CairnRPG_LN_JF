package src;

public class Hero extends Character {
    private int level = 1;
    private int experience = 0;
    private float money = 0.0f;
    private Item[] inventory = new Item[5];

    // Constructors
    public Hero(double health, double attackPower, boolean isAlive){
        super(health, attackPower, isAlive);
        // Then add one Potion to the inventory (i.e. newItem('Potion',20))
    }

    public boolean fight(Enemy evil){
        // Decide between using a basic attack that uses attackPower or special attack
        // Then print to console how much damage
    }

    // Getters and setters
    public int getLevel() {
        return level;
    }

    public void setLevel(int level) {
        this.level = level;
    }

    public int getExperience() {
        return experience;
    }

    public void setExperience(int experience) {
        this.experience = experience;
    }

    public float getMoney() {
        return money;
    }

    public void setMoney(float money) {
        this.money = money;
    }

    public Item[] getInventory() {
        return inventory;
    }

    public void setInventory(Item[] inventory) {
        this.inventory = inventory;
    }

    public int useItem(int item){
        System.out.println("Used" + item);
        return item;
    }

    public boolean levelUp(){

    }

}
