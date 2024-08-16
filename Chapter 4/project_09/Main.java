/**
 * Define a class whose objects are records on animal species. The class should have
 * instance variables for the species name, population, and growth rate. The growth
 * rate is a percentage that can be positive or negative and can exceed 100%. Include
 * a suitable collection of constructors, mutator methods, and accessor methods.
 * Include a toString method and an equals method. Include a boolean valued
 * method named endangered that returns true when the growth rate is negative
 * and returns false otherwise. Write a test program (or programs) that tests each
 * method in your class definition.
 *
 * @author Maksim Petrosyan
 * */
public class Main {
    public static void main(String[] args){
        Species specie1 = new Species("sp1", 100000, 10);
        Species specie2 = new Species("sp1", 100000, 10);
        Species specie3 = new Species("sp2", 100000, -10);
        System.out.println(specie1.equals(specie2));
        System.out.println(specie3);
        System.out.println(specie3.endangered());
    }
}
