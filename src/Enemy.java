package src;

public class Enemy extends Character {
    private int magicPoints;
    private int magicPower = 30;

    // Constructor #1
    public Enemy(double health, double attackPower, boolean isAlive) {
        super("Evil Capy", health, attackPower, isAlive);
    }

    // Constructor #2: So that Boss will work later on
    public Enemy(String name, double health, double attackPower, boolean isAlive) {
        super(name, health, attackPower, isAlive);
    }

    // Fight
    public void fight(Hero hero){
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

    public int getMagicPoints(){
            return magicPoints;
    }

    public void setMagicPoints(int i){
        this.magicPoints = magicPoints;
    }

}
