package Google;

public class Child {
    private String name;
    private String birthday;

    public Child(String []data) {
        this.name = data[2];
        this.birthday = data[3];
    }
    public String toString(){
        return String.format("%s %s"
                ,this.name,this.birthday);
    }
}
