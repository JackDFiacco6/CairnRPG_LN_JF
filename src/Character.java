package src;

import com.sun.jdi.PathSearchingVirtualMachine;

public class Character {
    public String name;
    public double attackPower;
    public double health;
    public boolean isAlive;

    Character() {
        name = "Capi";
        health = 100;
        attackPower = 80;
        isAlive = true;
    }

    //Constructor
    public Character(String name, double health, double attackPower, boolean isAlive) {
        this.name = name;
        this.health = health;
        this.attackPower = attackPower;
        this.isAlive = isAlive;
    }

    //Getters and setters
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getHealth() {
        return health;
    }

    public void setHealth(double health) {
        this.health = health;
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

    //Methods
    public String info() {
        return "Name: " + name + "\nHealth: " + health + "\nAttack Power:" + attackPower + "\nIs Alive" + isAlive;
    }

    public boolean runAway() {
        double rand = Math.random();
        int rand_int = (int) (rand * 100);

        if (rand_int < 75) {
            System.out.println("Your tried to run away, but could not escape!");
            return false;
        } else {
            System.out.println("You were able to run away!");
            return true;
        }
    }
}