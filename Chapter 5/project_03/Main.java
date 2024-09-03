/**
 * Create a class to represent a container. The class Container should have the following properties.
 *  a. Maximum capacity of the container in liters.
 *  b. Quantity of liquid at any given time in liters.
 *  The following operations can be performed on the containers:
 *  a. Completely fill a container.
 *  b. Completely empty a container.
 *  c. Transfer liquid from one container to another.
 *  Define the class named Container that implements the properties and operations
 * defined above. Create a constructor of the Container class that allows the user to
 * specify the maximum capacity of the container in liters. Initially, assume that all
 * the containers are empty.
 * Also, implement the following methods in the Container class.
 *  a. Quantity to return the current quantity of liquid at any given time in liters.
 *  b. Leftover to return the quantity of liquid that can be filled in the current container before it is full.
 *  c. Full to fill the current container fully.
 *  d. Empty to make the container completely empty.
 *  e. Transfer to transfer a certain amount of liquid from one container to another.
 *  f. displayQuantity to display the current quantity in liters/ milliliters/ kiloliters.
 *  Note: While transferring liquid from one container to another, check the maximum capacity of the container.
 *  Also, include other supporting variables or methods wherever necessary.
 *
 * @author Maksim Petrosyan
 * */
public class Main {
    public static void main(String[] args){
        Container c1 = new Container(60, 10);
        Container c2 = new Container(50, 0);
        System.out.println(c1);
        System.out.println(c2);
        c1.full();
        c2.fill(10);
        c1.transfer(c2, 20);
        System.out.println(c1);
        System.out.println(c2);
    }
}
