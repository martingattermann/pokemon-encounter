package de.martingattermann.pokemonEncounter.entities;

public class Attack {
    private String name;
    private int strength;
    //private Type type;

    public Attack(String name, int strength) {
        this.name = name;
        this.strength = strength;
        //this.type = type;
    }

    public String getName() {
        return name;
    }

    public int getStrength() {
        return strength;
    }
}