/**
 * Represents a container with a specific capacity and current quantity
 *
 * @author Maksim Petrosyan
 * */
public class Container {
    private int capacity;
    private int currentQuantity;

    /**
     * Constructs a Container with a specified capacity and an initial current quantity of zero.
     *
     * @param capacity the maximum capacity of the container
     */
    public Container(int capacity){
        this.capacity = capacity;
        currentQuantity = 0;
    }

    /**
     * Constructs a Container with a specified capacity and current quantity.
     *
     * @param capacity the maximum capacity of the container
     * @param currentQuantity the initial quantity in the container
     */
    public Container(int capacity, int currentQuantity){
        this.capacity = capacity;
        this.currentQuantity = currentQuantity;
    }

    /**
     * Constructs a container with the same capacity and current quantity as another container
     *
     * @param other the Container to copy
     * */
    public Container(Container other){
        this.capacity = other.getCapacity();
        this.currentQuantity = other.getCurrentQuantity();
    }

    /**
     * Gets the maximum capacity of the container
     *
     * @return the capacity of the container
     * */
    public int getCapacity(){
        return this.capacity;
    }

    /**
     * Gets the current quantity in the container
     *
     * @return current quantity in the container
     * */
    public int getCurrentQuantity(){
        return this.currentQuantity;
    }

    /**
     * Calculates and returns the remaining caoacity in container
     *
     * @return the remaining capacity of the container
     * */
    public int leftOver(){
        return this.capacity - this.currentQuantity;
    }

    /**
     * Fills the container to its maximum capacity
     * */
    public void full(){
        this.currentQuantity = this.capacity;
    }

    /**
     * Empties the container, setting the current quantity to 0
     * */
    public void empty(){
        this.currentQuantity = 0;
    }

    /**
     * Adds a specified quantity to the container. If the quantity exceeds the container's capacity,
     * a message is displayed and the container is not filled
     *
     * @param quantityToAdd Quantity to fill in container
     * */
    public void fill(int quantityToAdd){
        if(this.currentQuantity + quantityToAdd <= this.capacity){
            this.currentQuantity += quantityToAdd;
        } else{
            System.out.println("Cannot fill the container.");
        }
    }

    /**
     * Transfers a specified quantity from this container to another container. If the quantity to transfer
     * is more than the quantity in this container and if the receiving container can not hold the transfered
     * quantity, a message is displayed and the transfer does not occur
     *
     * @param other the container which should receive quantity
     * @param quantityToTransfer quantity to transfer
     * */
    public void transfer(Container other, int quantityToTransfer){
        if(quantityToTransfer > this.currentQuantity){
            System.out.println("Invalid quantity");
            return;
        }
        if(other.getCurrentQuantity() + quantityToTransfer <= other.getCapacity()){
            this.currentQuantity -= quantityToTransfer;
            other.currentQuantity += quantityToTransfer;
        } else{
            System.out.println("Cannot fill the container.");
        }
    }

    /**
     * Represents container as a string
     *
     * @return String representation of the container
     * */
    public String toString(){
        return "Container [capacity=" + capacity + ", currentQuantity=" + currentQuantity + "]";
    }
}
