package src;

public class Item {
    private String name;
    private int healingPower;

    Item () {
        name = "Flask of crimson tears";
        healingPower = 25;
    }
    //Constructor
    public Item(String name, int healingPower) {
        this.name = name;
        this.healingPower = healingPower;
    }
    //Getters and setters
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getHealingPower() {
        return healingPower;
    }

    public void setHealingPower(int healingPower) {
        this.healingPower = healingPower;
    }
    public String Info(){
        return "Item name: " + name + ", Healing Power: " + healingPower;
    }
}
