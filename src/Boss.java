package src;

public class Boss extends Enemy{
    private int ultrasLeft;
    public Boss (double health, double attackPower, boolean isAlive) {
        super("Capy Boss", health, attackPower, isAlive);
        this.ultrasLeft = 3;
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
