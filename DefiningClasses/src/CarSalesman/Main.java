package CarSalesman;

import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        int enginesNumber = Integer.parseInt(scan.nextLine());
        Map<String,engine> engines = new LinkedHashMap<>();

        while (enginesNumber -->0){

            String[] engineDate = scan.nextLine().split("\\s+");
            engine engine = findEngineDate(engineDate);
            engines.put(engineDate[0], engine);

        }

        int carNumber = Integer.parseInt(scan.nextLine());
        List<car> cars = new ArrayList<>();

        while (carNumber -->0){
            String[] carDate = scan.nextLine().split("\\s+");
            car car = findCarDate(carDate,engines);
            cars.add(car);
        }
        cars.forEach(System.out::println);
    }

    private static car findCarDate(String[] carDate, Map<String, engine> engines) {
        car car = null;
        String model = carDate[0];
        engine engine = engines.get(carDate[1]);

        if (carDate.length == 4){
            int weight = Integer.parseInt(carDate[2]);
            String color = carDate[3];
            car = new car(model,engine,weight,color);

        }else if (carDate.length == 3){
            try {
                int weight = Integer.parseInt(carDate[2]);
                car = new car(model,engine,weight);
            }catch (NumberFormatException e){
                String color = carDate[2];
                car = new car(model,engine,color);
            }
        }else if (carDate.length == 2){
            car = new car(model,engine);
        }
        return car;
    }

    private static engine findEngineDate(String[] engineDate) {
        engine engine = null;
        String engineModel = engineDate[0];
        int power = Integer.parseInt(engineDate[1]);

        if (engineDate.length == 4){
            int displacement = Integer.parseInt(engineDate[2]);
            String efficiency = engineDate[3];
            engine = new engine(engineModel,power,displacement,efficiency);

        }else if (engineDate.length == 3){
            try {
                int displacement = Integer.parseInt(engineDate[2]);
                engine = new engine(engineModel,power,displacement);
            }catch (NumberFormatException e){
                String efficiency = engineDate[2];
                engine = new engine(engineModel,power,efficiency);
            }
        }else if (engineDate.length == 2){
            engine = new engine(engineModel,power);
        }
        return engine;
    }
}
