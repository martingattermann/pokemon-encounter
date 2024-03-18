package services;

import java.util.HashMap;
import java.util.HashSet;
import entities.Pokemon;
import entities.Attack;

public class PokemonService {
    private HashMap<String, Pokemon> pokemonMap;

    public PokemonService() {
        // Initialize and populate the Pokemon HashMap
        pokemonMap = new HashMap<>();

        HashMap<String, Attack> loadingAttacks = new HashMap<>();
        loadingAttacks.put("Electric", new Attack("Thunderbolt",90));
        loadingAttacks.put("Fire", new Attack("Thunderpunch",70));

        //Create direct Attack
        Attack quickAttack = new Attack("Shock", 40);

        //Create types
        HashSet<String> pokemonTypes = new HashSet<>();
        pokemonTypes.add("Electro");

        pokemonMap.put("Pikachu", new Pokemon("Pikachu", 25, pokemonTypes, quickAttack, loadingAttacks));
    }

    public Pokemon findPokemonByName(String name) {
        return pokemonMap.get(name);
    }
}