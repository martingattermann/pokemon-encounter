package entities;

public class Attack {
    private String name;
    private int strength;

    public Attack(String name, int strength) {
        this.name = name;
        this.strength = strength;
    }

    public String getName() {
        return name;
    }

    public int getStrength() {
        return strength;
    }
}