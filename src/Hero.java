package src;

public class Hero extends Character {
    private int level = 1;
    private int experience = 0;
    private float money = 0.0f;
    private Item[] inventory = new Item[5];

    // Methods
    public void fight(Enemy evil){
        double stamina = Math.random();
        double damage = attackPower;
        if (stamina < 0.5) {
            attackPower = this.getAttackPower() * 2;
        } else if (stamina < 0.9) {
            attackPower = this.getAttackPower() * 3;
        } else {
            attackPower = this.getAttackPower();
        }
        System.out.println("Damage caused: " + damage + " hp.");
    }

    public int useItem(int i){
        // use first item by adding to your health the amount of healing power it has
        //print to the console how much you were healed, the character name, and name of item
        // ex: A 'potion' healed Johnny by 15 hp
        System.out.println("A " + i + " healed " + name + " by" + Item.healingPower + " hp.");
    }

    public void levelUp(){
        if (this.experience > 20) {
            this.level += 1;
            System.out.println("Level up");
        }
    }

    public boolean addToInventory(Item item) {
        // Add to inventory
    }

    public String showInventory() {
        // Show inventory
    }

    // Display hero's info
    public String info() {
        return "Name: " + this.name + "\nHealth: " + this.health + "\nAttack Power:" + attackPower + "\nIs Alive" + isAlive + "Money: " + this.money + "\nExperience: " + this.experience + "\nLevel:" + level + "\ninventory:" + inventory.toString();
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

    // Constructors
    public Hero(double health, double attackPower, boolean isAlive){
        super(health, attackPower, isAlive);
        // Then add one Potion to the inventory (i.e. newItem('Potion',20))
    }


}
