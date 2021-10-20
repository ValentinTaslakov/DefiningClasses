package Google;

public class Car {
    private String model;
    private int speed;

    public Car(String[] data) {
        this.model = data[2];
        this.speed = Integer.parseInt(data[3]);
    }
    public String toString(){
        return String.format("%s %d"
                ,this.model,this.speed);
    }
}
