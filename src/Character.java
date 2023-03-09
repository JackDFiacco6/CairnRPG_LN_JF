package src;

import com.sun.jdi.PathSearchingVirtualMachine;

public class Character {
    public String name;
    public double attackPower;
    public double healingPower;
    public boolean isAlive;

    Character() {
        name = "Capi";
        healingPower = 100;
        attackPower = 80;
        isAlive = true;
    }
    //Constructor
    public Character(String name, double health, double attackPower, boolean isAlive) {
        this.name = name;
        this.healingPower = health;
        this.attackPower = attackPower;
        this.isAlive = isAlive;
    }
}