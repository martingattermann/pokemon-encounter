package de.martingattermann.pokemonEncounter.services;

import java.util.HashMap;
import java.util.HashSet;
import de.martingattermann.pokemonEncounter.entities.Pokemon;
import de.martingattermann.pokemonEncounter.entities.Attack;
import de.martingattermann.pokemonEncounter.entities.Type;
import org.springframework.stereotype.Service;

@Service
public class PokemonService {
    private HashMap<String, Pokemon> pokemonMap;

    public PokemonService() {
        // Initialize and populate the Pokemon HashMap
        pokemonMap = new HashMap<>();

        HashSet<Attack> loadingAttacks = new HashSet<>();
        loadingAttacks.add(new Attack(Type.ELECTRIC, "Thunderbolt",90));
        loadingAttacks.add(new Attack(Type.ELECTRIC, "Thunderpunch",70));

        //Create direct Attack
        Attack quickAttack = new Attack(Type.ELECTRIC, "Shock", 40);

        //Create types
        HashSet<Type> pokemonTypes = new HashSet<>();
        pokemonTypes.add(Type.ELECTRIC);

        createPokemon("Pikachu", 25, pokemonTypes, quickAttack, loadingAttacks);
    }

    public Pokemon findPokemonByName(String name) {
        return pokemonMap.get(name);
    }

    public void createPokemon(String name, int number, HashSet<Type> types, Attack directAttack, HashSet<Attack> loadAttacks) {
        Pokemon newPokemon = new Pokemon(name, number, types, directAttack, loadAttacks);
        pokemonMap.put(name, newPokemon);
    };
}