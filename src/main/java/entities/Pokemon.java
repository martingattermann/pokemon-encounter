package entities;

import java.util.HashSet;
import java.util.HashMap;

public class Pokemon {
    private String name;
    private int number;
    private HashSet<Type> types;
    private entities.Attack directAttack;
    private HashMap<Type, entities.Attack> loadAttacks;

    public Pokemon (String name, int number, HashSet<Type> types, entities.Attack directAttack, HashMap<Type, entities.Attack> loadAttacks) {
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

    public entities.Attack getDirectAttack() {
        //Attack attack = directAttack;
        return directAttack;
    }

    public HashMap<Type, entities.Attack> getLoadingAttacks() {
        return loadAttacks;
    }
}