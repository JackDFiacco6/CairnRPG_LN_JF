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

    //getter and setters
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getHealth() {
        return healingPower;
    }

    public void setHealth(double health) {
        this.healingPower = health;
    }

    public double getAttackPower() {
        return attackPower;
    }

    public void setAttackPower(float attackPower) {
        this.attackPower = attackPower;
    }

    public boolean isAlive() {
        return isAlive;
    }

    public void setAlive(boolean alive) {
        isAlive = alive;
    }
}