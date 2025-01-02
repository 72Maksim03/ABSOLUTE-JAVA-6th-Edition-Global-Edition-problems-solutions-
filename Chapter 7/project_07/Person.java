public class Person {
    private String name;

    public Person(String name){
        this.name = name;
    }
    public Person(){this("No name");}
    public Person(Person otherPerson){this(otherPerson.name);}

    public String getName(){return name;}
    public void setName(String name){this.name = name;}

    public String toString(){return "Person name: " + name;}
    public boolean equals(Object other){
        if (other == null) return false;
        if (other.getClass() != getClass()) return false;
        Person otherPerson = (Person) other;
        return name.equals(otherPerson.getName());
    }
}
