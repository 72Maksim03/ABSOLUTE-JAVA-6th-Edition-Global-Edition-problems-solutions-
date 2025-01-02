/**
 * Create a class called Vehicle that has the manufacturer’s name (type String),
 * number of cylinders in the engine (type int), and owner (type Person given
 * next). Then, create a class called Truck that is derived from Vehicle and has the
 * following additional properties: the load capacity in tons (type double since it may
 * contain a fractional part) and towing capacity in pounds (type int). Be sure your
 * class has a reasonable complement of constructors, accessor and mutator methods,
 * and suitably defined equals and toString methods. Write a program to test all
 * your methods.
 *  The definition of the class Person follows. Completing the definitions of the
 * methods is part of this programming project.
 * public class Person
 * {
 *  private String name;
 *  public Person()
 *  {...}
 *  public Person(String theName)
 *  {...}
 *  public Person(Person theObject)
 *  {...}
 *  public String getName()
 *  {...}
 *  public void setName(String theName)
 *  {...}
 *  public String toString()
 *  {...}
 *  public boolean equals(Object other)
 *  {...}
 * }
 * */
public class Main {
    public static void main(String[] args) {
        Truck truck1 = new Truck("Ford", 8, new Person("Person"), 45.6, 6);
        Truck truck2 = new Truck("Ford", 8, new Person("Person"), 45.6, 6);

        System.out.println("Truck1:\n" + truck1);
        System.out.println("Truck2:\n" + truck2);
        System.out.println(truck1.equals(truck2));

        truck2.setOwner(new Person("Person2"));
        System.out.println(truck1.equals(truck2));
    }
}
