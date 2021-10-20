package Google;

public class Pokemon {
    private String name;
    private String type;

    public Pokemon(String [] data) {
        this.name = data[2];
        this.type = data[3];
    }
    public String toString(){
        return String.format("%s %s"
                ,this.name,this.type);
    }
}
