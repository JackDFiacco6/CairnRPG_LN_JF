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
}
