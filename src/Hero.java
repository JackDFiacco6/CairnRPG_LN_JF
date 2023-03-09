package src;

public class Hero extends Character {
    private int level = 1;
    private int experience = 0;
    private float money = 0.0f;
    private Item[] inventory = new Item[5];

    // Constructors
    public Hero(double health, double attackPower, boolean isAlive){
        super("Mr. Capy", health, attackPower, isAlive);
        // Then add one Potion to the inventory (i.e. newItem('Potion',20))
        Item potion = new Item("Potion", 10);
    }

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

    public int useItem(int item) {
        // use first item by adding to your health the amount of healing power it has
        // print to the console how much you were healed, the character name, and name of item
        // ex: A 'potion' healed Johnny by 15 hp
        int healingAmount = 0;
        for (int i = 0; i < inventory.length; i++) {
            if (inventory[i] != null) {
                healingAmount += inventory[i].getHealingPower();
                health += inventory[i].getHealingPower();
                System.out.println("A " + item + " healed " + name + " by" + inventory[i].getHealingPower() + " hp.");
            }
        }
        return healingAmount;
    }

    public void levelUp(){
        if (this.experience > 100) {
            this.level += 1;
            this.experience = 0;
            System.out.println("Level up! Experience set back to: 0.");
        }
    }

    public boolean addToInventory(Item item) {
        // Add item to first empty spot in inventory
        // Return false is inventory is full
        for (int i = 0; i < inventory.length; i++) {
            if (inventory[i] == null) {
                inventory[i] = item;
                return true;
            }
        }
        return false;
    }

    public String showInventory() {
        // Return string displaying all items in inventory
        String inventory_items = "";
        for (int i = 0; i < inventory.length; i++) {
            if (inventory[i] != null) {
                inventory_items += inventory[i].getName();
            }
        }
        return inventory_items;

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


}
