package src;

public class Boss extends Enemy{
    private int ultrasLeft;
    public Boss (double health, double attackPower, boolean isAlive) {
        super("Capy Boss", health, attackPower, isAlive);
        this.ultrasLeft = 3;
    }

    // Fight
    public boolean fight(Hero hero) {
        double stamina = Math.random();
        if (randomValue < 0.5 || ultrasLeft >= 1) {
            attackPower = this.getAttackPower() * 8;
        } else {
            attackPower = this.getAttackPower();
        }
    }

    // Getters and Setters
    public int getUltrasLeft () {
        return ultrasLeft;
    }

    public void setUltrasLeft (int ultrasLeft){
        this.ultrasLeft = ultrasLeft;
    }

    // Display Boss info
    public String info() {
        return "Name: " + this.name + "\n" +
                "Health: " + this.health +
                "\nAttack Power:" + attackPower +
                "\nIs Alive:" + isAlive +
                "\nUltras left :" + ultrasLeft;
    }

}
