package src;

public class Boss {
    private int ultrasLeft;
    public Boss (double health, double attackPower, boolean isAlive) {
        super("Capy Boss", health, attackPower, isAlive);
        this.ultrasLeft = 3;
    }
}
