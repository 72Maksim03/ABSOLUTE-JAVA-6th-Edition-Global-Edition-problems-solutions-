/**
 * Enhance the definition of the class PartiallyFilledArray (Display 6.5) in the
 * following way: When the user attempts to add one additional element and there
 * is no room in the array instance variable a, the user is allowed to add the element.
 * The object creates a second array that is twice the size of the array a, copies values
 * from the array a to the user’s new array, makes this array (or more precisely its
 * reference) the new value of a, and then adds the element to this new larger array a.
 * Hence, this new class should have no limit (other than the physical size of the computer) to how many numbers it can hold. The instance variable maxNumberOfElements
 * remains and the method getMaxCapacity is unchanged, but these now refer to the
 * currently allocated memory and not to an absolute upper bound. Write a suitable
 * test program.
 *
 * @author Maksim Petrosyan
 * */
public class Main {
    public static void main(String[] args) {
        PartiallyFilledArray parr = new PartiallyFilledArray(2);
        parr.add(1.2);
        parr.add(2.3);
        System.out.println(parr.getElement(0));
        parr.resetElement(1, 3.4);
        System.out.println(parr.getElement(1));
        parr.add(4);
        System.out.println(parr.full());
    }
}
