package de.martingattermann.pokemonEncounter.entities;

import java.util.HashSet;
import java.util.HashMap;

public class Pokemon {
    private String name;
    private int number;
    private HashSet<Type> types;
    private Attack directAttack;
    private HashSet<Attack> loadAttacks;

    public Pokemon (String name, int number, HashSet<Type> types, Attack directAttack, HashSet<Attack> loadAttacks) {
        this.name = name;
        this.number = number;
        this.types = types;
        this.directAttack = directAttack;
        this.loadAttacks = loadAttacks;
    }

    public String getName() {
        return name;
    }

    public int getNumber() {
        return number;
    }

    public HashSet<Type> getTypes() {
        return types;
    }

    public Attack getDirectAttack() {
        //Attack attack = directAttack;
        return directAttack;
    }

    public HashSet<Attack> getLoadingAttacks() {
        return loadAttacks;
    }
}