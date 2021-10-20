package Pokemon;



import java.util.ArrayList;
import java.util.List;

public class Trainer {
    private String name;
    private  int badges = 0 ;
    private List<Pokemon> pokemonList;

    public Trainer(String name) {
        this.name = name;
        pokemonList = new ArrayList<>();

    }

    public String getName() {
        return name;
    }

    public int getBadges() {
        return badges;
    }

    public List<Pokemon> getPokemonList() {
        return pokemonList;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setBadges() {
         badges++;
    }

    public void setPokemonList(List<Pokemon> pokemonList) {
        this.pokemonList = pokemonList;
    }
    public String toString(){
        return  String.format("%d %d"
                ,getBadges(),getPokemonList().size());
    }

}
