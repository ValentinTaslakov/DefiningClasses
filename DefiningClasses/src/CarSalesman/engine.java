package CarSalesman;

public class engine {
    private String engineModel;
    private int power;
    private int displacement;
    private String efficiency;

    public engine(String engineModel,int power){
        this.engineModel = engineModel;
        this.power = power;
        this.displacement = 0;
        this.efficiency = "n/a";
    }
    public engine(String engineModel,int power,int displacement){
        this(engineModel,power);
        this.displacement = displacement;
    }
    public engine(String engineModel,int power,String efficiency){
        this(engineModel,power);
        this.efficiency = efficiency;
    }
    public engine(String engineModel,int power,int displacement,String efficiency){
        this(engineModel,power);
        this.displacement = displacement;
        this.efficiency = efficiency;
    }

    public String getEngineModel() {
        return engineModel;
    }

    public int getPower() {
        return power;
    }

    public int getDisplacement() {
        return displacement;
    }

    public String getEfficiency() {
        return efficiency;
    }

    public String toString(){
        String displacementPrint;
        if (displacement == 0){
            displacementPrint = "n/a";

        }else {
            displacementPrint = displacement +"";
        }
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append(engineModel).append(":").append("\n")
                .append("Power: ").append(power).append("\n")
                .append("Displacement: ").append(displacementPrint).append("\n")
                .append("Efficiency: ").append(efficiency);
        return stringBuilder.toString();
    }
}
