import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import entities.Attack;
import java.util.Scanner;
import entities.Pokemon;
import services.PokemonService;

public class Main {
    public static void main(String[] args) {
        services.PokemonService pokemonService = new services.PokemonService();
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter the name of the Pokemon: ");
        String pokemonName = scanner.nextLine();
        entities.Pokemon foundPokemon = pokemonService.findPokemonByName(pokemonName);
        if (foundPokemon != null) {
            System.out.println("Found Pokemon: " + foundPokemon.getName() + " - Type: " + foundPokemon.getTypes());
        } else {
            System.out.println("Pokemon not found.");
        }
    }
}