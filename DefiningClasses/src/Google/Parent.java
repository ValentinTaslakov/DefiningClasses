package Google;

public class Parent {
    private String name;
    private String birthday;

    public Parent(String [] data) {
        this.name = data[2];
        this.birthday = data[3];
    }
    public String toString(){
        return String.format("%s %s"
                ,this.name,this.birthday);
    }

}
