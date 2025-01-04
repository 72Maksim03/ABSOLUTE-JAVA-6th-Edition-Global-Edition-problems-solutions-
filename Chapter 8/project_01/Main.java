/**
 * In Programming Project 7.3 from Chapter 7, the Alien class was rewritten to use
 * inheritance. The rewritten Alien class should be made abstract because there
 * will never be a need to create an instance of it, only its derived classes. Change this
 * to an abstract class and also make the getDamage method an abstract method. Test
 * the class from your main method to ensure that it still operates as expected.
 *
 * @author Maksim Petrosyan
 * */
public class Main {
    public static void main(String[] args) {
        OgreAlien alien1 = new OgreAlien(100, "Ogre");
        SnakeAlien alien2 = new SnakeAlien(100, "Snake");
        MarshmallowManAlien alien3 = new MarshmallowManAlien(100, "MarshmallowMan");

        AlienPack alienPack = new AlienPack(3);
        alienPack.addAlien(alien1);
        alienPack.addAlien(alien2);
        alienPack.addAlien(alien3);

        System.out.println(alienPack.calculateDamage());
    }
}
