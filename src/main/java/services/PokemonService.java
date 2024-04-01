package services;

import java.util.HashMap;
import java.util.HashSet;
import entities.Pokemon;
import entities.Attack;
import entities.Type;

public class PokemonService {
    private HashMap<String, Pokemon> pokemonMap;

    public PokemonService() {
        // Initialize and populate the Pokemon HashMap
        pokemonMap = new HashMap<>();

        HashMap<Type, Attack> loadingAttacks = new HashMap<>();
        loadingAttacks.put(Type.ELECTRIC, new Attack("Thunderbolt",90));
        loadingAttacks.put(Type.FIRE, new Attack("Thunderpunch",70));

        //Create direct Attack
        Attack quickAttack = new Attack("Shock", 40);

        //Create types
        HashSet<Type> pokemonTypes = new HashSet<>();
        pokemonTypes.add(Type.ELECTRIC);

        createPokemon("Pikachu", 25, pokemonTypes, quickAttack, loadingAttacks);
    }

    public Pokemon findPokemonByName(String name) {
        return pokemonMap.get(name);
    }

    public void createPokemon(String name, int number, HashSet<Type> types, Attack directAttack, HashMap<Type, Attack> loadAttacks) {
        Pokemon newPokemon = new Pokemon(name, number, types, directAttack, loadAttacks);
        pokemonMap.put(name, newPokemon);
    };
}