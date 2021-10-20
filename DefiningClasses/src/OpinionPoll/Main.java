package OpinionPoll;

import java.util.*;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class Main {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        int n = Integer.parseInt(scan.nextLine());
        List<Person> persons = new ArrayList<>();

        while (n-->0){
            String[] input = scan.nextLine().split("\\s+");
            String name = input[0];
            int age = Integer.parseInt(input[1]);
            Person person = new Person(name,age);
            persons.add(person);
        }

        persons.stream()
                .filter(person -> person.getAge()>30)
                .sorted(Comparator.comparing(Person::getName))
                .forEach(System.out::println);
    }
}
