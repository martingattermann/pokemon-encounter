package de.martingattermann.pokemonEncounter.entities;

public class Attack {
    private String name;
    private int strength;
    private Type type;

    public Attack(Type type, String name, int strength) {
        this.type = type;
        this.name = name;
        this.strength = strength;
    }

    public String getName() {
        return name;
    }

    public int getStrength() {
        return strength;
    }

    public Type getType() {
        return type;
    }
}