package de.martingattermann.pokemonEncounter.controllers;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
import de.martingattermann.pokemonEncounter.entities.Pokemon;
import de.martingattermann.pokemonEncounter.services.PokemonService;

@RestController
public class PokemonController {

    private final PokemonService pokemonService;

    public PokemonController(PokemonService pokemonService) {
        this.pokemonService = pokemonService;
    }

    @GetMapping("/pokemon")
    public ResponseEntity<Pokemon> getPokemon(@RequestParam String name) {
        Pokemon foundPokemon = pokemonService.findPokemonByName(name);
        if (foundPokemon != null) {
            return ResponseEntity.ok(foundPokemon);
        } else {
            return ResponseEntity.notFound().build();
        }
    }
}