package src;

public class Enemy extends Character {
    private int magicPoints;
    private int magicPower = 30;

    public Enemy(double health, double attackPower, boolean isAlive) {
        super("Evil Capy", health, attackPower, isAlive);
    }
    public Enemy(String name, double health, double attackPower, boolean isAlive) {
        super(name, health, attackPower, isAlive);
    }

public int getMagicPoints(){
        return magicPoints;
}

    public void setMagicPoints(){
        this.magicPoints = magicPoints;
    }

    // Fight
    public boolean fight(Hero hero){
        double stamina = Math.random();
        if (randomValue < 0.5 || magicPoints >= 30){
            attackPower = this.getAttackPower() * 4;
        } else {
            attackPower = this.getAttackPower();
        }
    }

}
