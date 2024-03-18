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
            for (Map.Entry<String, Attack> entry : foundPokemon.getLoadingAttacks().entrySet()) {
                String type = entry.getKey();
                Attack attack = entry.getValue();
                System.out.println(type + "=" + attack.getName() + " (Strength: " + attack.getStrength() + ")");
            }
        } else {
            System.out.println("Pokemon not found.");
        }
    }
}