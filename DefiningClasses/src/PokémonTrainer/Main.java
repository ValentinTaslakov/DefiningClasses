package PokémonTrainer;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        List<Trainer> trainers = new ArrayList<>();

        String inputDate = scan.nextLine();


        while (!inputDate.equals("Tournament")) {
            String[] information = inputDate.split("\\s+");
            String trainerName = information[0];
            String pokemonName = information[1];
            String pokemonElement = information[2];
            int pokemonHealth = Integer.parseInt(information[3]);



            inputDate = scan.nextLine();
        }
    }
}
