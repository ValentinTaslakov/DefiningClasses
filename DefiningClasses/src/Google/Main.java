package Google;

import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        Person person = null;
        Map<String,Person> persons = new HashMap<>();

        String input = scan.nextLine();

        while (!input.equals("End")){
            String[] data = input.split("\\s+");

            persons = getPersonObject(data,persons);


            input = scan.nextLine();
        }
        String nameToPrintData = scan.nextLine();

        System.out.println(persons.get(nameToPrintData));
    }

    private static Map<String, Person> getPersonObject(String[] data, Map<String, Person> persons) {

        String personName = data[0];
        String personObject = data[1];

        switch (personObject){
            case "company":
                Company company = new Company(data);
                persons.putIfAbsent(personName,new Person(personName,company));
                persons.get(personName).setCompany(company);
                break;
            case "pokemon":
                Pokemon pokemon = new Pokemon(data);
                persons.putIfAbsent(personName,new Person(personName));
                persons.get(personName).getPokemonList().add(pokemon);
                break;
            case "parents":
                Parent parent = new Parent(data);
                persons.putIfAbsent(personName,new Person(personName));
                persons.get(personName).getParents().add(parent);
                break;
            case "children":
                Child child = new Child(data);
                persons.putIfAbsent(personName,new Person(personName));
                persons.get(personName).getChildren().add(child);
                break;
            case "car":
                Car car = new Car(data);
                persons.putIfAbsent(personName,new Person(personName,car));
                persons.get(personName).setCar(car);
                break;
        }


        return persons;
    }




}
