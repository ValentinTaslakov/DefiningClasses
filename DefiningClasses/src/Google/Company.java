package Google;

public class Company {
    private String name;
    private String department;
    private double salary;

    public Company(String [] data) {
        this.name = data[2];
        this.department = data[3];
        this.salary = Double.parseDouble(data[4]);
    }

    public String toString(){
        return String.format("%s %s %.2f"
                ,this.name,this.department,this.salary);
    }
}
