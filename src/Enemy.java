package src;

public class Enemy extends Character {
    private int magicPoints;
    private int magicPower = 30;

    public Enemy(String name, double health, double attackPower, boolean isAlive) {
        super(name, health, attackPower, isAlive);
    }

    public Enemy(double health, double attackPower, boolean isAlive) {
        super("Evil Capy", health, attackPower, isAlive);
    }


}
