/**
 * Programming Project 7.8 required rewriting the solution to Programming Project 4.10
 * with inheritance. Redo or do Programming Project 7.8, but instead define the Pet
 * class as an abstract class. The acepromazine() and carprofen() methods should
 * be defined as abstract methods.
 *  In your main method, define an array of type Pet and add two instances of cats
 * and two instances of dogs to the array. Iterate through the array and output how
 * much carprofen and acepromazine each pet would require.
 *
 * @author Maksim Petrosyan
 * */
public class Main {
    public static void main(String[] args) {
        Pet cat1 = new Cat("Cat1", 2, 2.3);
        Pet dog1 = new Dog("Dog1", 3, 8.8);
        Pet cat2 = new Cat("Cat2", 1, 1.5);
        Pet dog2 = new Dog("Dog2", 1, 10.5);

        Pet[] pets = {cat1, dog1, cat2, dog2};
        for (Pet pet : pets)
            System.out.println(pet.petType() + " " + pet.getName() + " needs " +
                    pet.carprofen() + " mg carprofen " + pet.acepromazine() + " mg acepromazine");
    }
}
