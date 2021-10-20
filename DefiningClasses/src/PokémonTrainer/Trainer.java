package PokémonTrainer;

import java.util.ArrayList;
import java.util.List;

public class Trainer {
    private String name;
    private int badges = 0;
    private List<Pokemon> pokemonList;

    public Trainer(String name) {
        this.name = name;
        pokemonList = new ArrayList<>();
    }
}
