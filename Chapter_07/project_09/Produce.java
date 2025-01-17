public class Produce {
    private String name;

    public Produce(String name){this.name = name;}
    public Produce(){this("No name");}

    public String getName(){return this.name;}
    public void setName(String name){this.name = name;}

    public String toString(){return this.name;}
}
