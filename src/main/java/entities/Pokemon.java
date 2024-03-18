package entities;

import java.util.HashSet;
import java.util.HashMap;

public class Pokemon {
    private String name;
    private int number;
    private HashSet<String> types;
    private entities.Attack directAttack;
    private HashMap<String, entities.Attack> loadAttacks;

    public Pokemon (String name, int number, HashSet<String> types, entities.Attack directAttack, HashMap<String, entities.Attack> loadAttacks) {
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

    public HashSet<String> getTypes() {
        return types;
    }

    public entities.Attack getDirectAttack() {
        //Attack attack = directAttack;
        return directAttack;
    }

    public HashMap<String, entities.Attack> getLoadingAttacks() {
        return loadAttacks;
    }
}