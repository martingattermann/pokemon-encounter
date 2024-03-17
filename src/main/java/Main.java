import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;

public class Main {
    public static void main(String[] args) {
        //Create loading Attacks
        HashMap<String, Attack> loadingAttacks = new HashMap<>();
        loadingAttacks.put("Electric", new Attack("Thunderbolt",90));
        loadingAttacks.put("Fire", new Attack("Thunderpunch",70));

        //Create direct Attack
        Attack quickAttack = new Attack("Shock", 40);

        //Create types
        HashSet<String> pokemonTypes = new HashSet<>();
        pokemonTypes.add("Electro");

        // Create Pokemon

        Pokemon pokemonName = new Pokemon("Pikachu", 25, pokemonTypes, quickAttack, loadingAttacks);

        //Display Pokemon values
        System.out.println("Name: " + pokemonName.getName());
        System.out.println("Number: " + pokemonName.getNumber());
        System.out.println("Types: ");
        for (String type : pokemonName.getTypes()) {
            System.out.println(type + " ");
        }
        System.out.println("Quick Attack: " + pokemonName.getDirectAttack().getName() + " " + pokemonName.getDirectAttack().getStrength());
        System.out.println("Load Attacks: ");
        for (Map.Entry<String, Attack> entry : loadingAttacks.entrySet()) {
            String type = entry.getKey();
            Attack attack = entry.getValue();
            System.out.println(type + ": " + attack.getName() + " " + attack.getStrength());
        }
    }
}

class Attack {
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

class Pokemon {
    private String name;
    private int number;
    private HashSet<String> types;
    private Attack directAttack;
    private HashMap<String, Attack> loadAttacks;

    public Pokemon (String name, int number, HashSet<String> types, Attack directAttack, HashMap<String,Attack> loadAttacks) {
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

    public Attack getDirectAttack() {
        //Attack attack = directAttack;
        return directAttack;
    }

    public HashMap<String, Attack> getLoadingAttack() {
        return loadAttacks;
    }
}