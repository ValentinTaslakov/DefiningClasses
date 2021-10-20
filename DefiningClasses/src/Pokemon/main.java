package Pokemon;

import java.util.*;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class main {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        Map<String,Trainer> trainers = new LinkedHashMap<>();

        String input = scan.nextLine();
        while (!input.equals("Tournament")){
            String[] information = input.split("\\s+");
            String trainerName = information[0];
            String pokemonName = information[1];
            String pokemonElement = information[2];
            int pokemonHealth = Integer.parseInt(information[3]);

            Pokemon pokemon = new Pokemon(pokemonName,pokemonElement,pokemonHealth);
            trainers.putIfAbsent(trainerName,new Trainer(trainerName));
            trainers.get(trainerName).getPokemonList().add(pokemon);

            input = scan.nextLine();
        }
        String elements = scan.nextLine();
        while (!elements.equals("End")){

            getPokemon(trainers,elements);

            elements = scan.nextLine();
        }
      trainers
               .entrySet()
               .stream()
               .sorted((e1,e2)->
                       Integer.compare(e2.getValue().getBadges()
                               ,e1.getValue().getBadges()))
              .forEach(s -> System.out.printf("%s %s%n"
                      ,s.getKey(),s.getValue().toString()));

    }



    private static void getPokemon(Map<String, Trainer> trainers, String elements) {

        for (Map.Entry<String,Trainer> entry: trainers.entrySet()) {

                if (pokemonContainsElement(entry.getValue().getPokemonList(),elements)){
                    entry.getValue().setBadges();
                }else {
                    entry.getValue()
                            .getPokemonList()
                            .forEach(p ->p.setHealth());
                    entry.getValue()
                            .getPokemonList()
                            .removeIf(pokemon -> pokemon.getHealth() <= 0);
                }

        }

    }

    private static boolean pokemonContainsElement(List<Pokemon> pokemonList, String elements) {
        boolean isTrue = false;
        for (Pokemon pokemon:pokemonList) {
            if (pokemon.getElement().equals(elements)){
                isTrue = true;
            }
        }
        return isTrue;
    }
}
