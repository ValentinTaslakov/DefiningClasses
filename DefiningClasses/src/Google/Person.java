package Google;

import java.util.ArrayList;
import java.util.List;

public class Person {
    private String name;
    private Company company;
    private Car car;
    private List<Parent> parents;
    private List<Child> children;
    private List<Pokemon> pokemonList;

    public Person(String personName) {
        this.name = personName;
        this.company = null;
        this.car = null;
        parents = new ArrayList<>();
        children = new ArrayList<>();
        pokemonList = new ArrayList<>();
    }
    public Person(String personName ,Car car){
        this(personName);
        this.car = car;
    }
    public Person(String personName ,Company company){
        this(personName);
        this.company = company;
    }

    public String getName() {
        return name;
    }

    public Company getCompany() {
        return company;
    }

    public Car getCar() {
        return car;
    }

    public List<Parent> getParents() {
        return parents;
    }

    public List<Child> getChildren() {
        return children;
    }

    public List<Pokemon> getPokemonList() {
        return pokemonList;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setCompany(Company company) {
        this.company = company;
    }

    public void setCar(Car car) {
        this.car = car;
    }


    public  String toString(){
        String printCompany;
        if (company == null){
           printCompany = "";
        }else {
            printCompany = company.toString()+"\n";
        }
        String printCar;
        if (car == null){
            printCar = "";
        }else {
            printCar = car.toString()+"\n";
        }
        StringBuilder printPokemon = new StringBuilder();
        if (pokemonList.isEmpty()){
            printPokemon.append("");
        }else {
            for (Pokemon poke:pokemonList) {
                printPokemon.append(poke).append("\n");
            }
        }
        StringBuilder printParents = new StringBuilder();
        if (parents.isEmpty()){
            printParents.append("");
        }else {
            for (Parent parent:parents) {
                printParents.append(parent).append("\n");
            }
        }
        StringBuilder printChild = new StringBuilder();
        if (children.isEmpty()){
            printChild.append("");
        }else {
            for (Child child:children) {
                printChild.append(child).append("\n");
            }
        }
        return  String.format("%s%nCompany:%n%sCar:%n%sPokemon:%n%sParents:%n%sChildren:%n%s"
                ,this.name,printCompany,printCar,printPokemon,printParents,printChild);

    }
}
