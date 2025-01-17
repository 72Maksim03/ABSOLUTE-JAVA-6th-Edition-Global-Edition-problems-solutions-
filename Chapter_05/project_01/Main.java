/**
 * Define a class called BookStore to maintain the record of books sold. The store
 * contains three categories of books i.e. “Kids”, “Engineering”, and “Story”. The
 * following details should be maintained for each book.
 *  a. Book category
 *  b. Author
 *  c. Title
 *  d. Publisher
 *  e. Selling price of the book
 *  f. Quantity
 *  Create a constructor that initializes the Store ID and the rest of the details of the
 * book mentioned above. Include a method named trackSalesStatus that will
 * display the total number of books sold by the store (add a static variable that tracks
 * the total number of books sold). Also, include a method to display the quantity
 * available corresponding to each Book ID. Write a main method to test your class.
 *
 * @author Maksim Petrosyan
 * */
public class Main {
    public static void main(String[] args){
        System.out.println("Total books sold: " + BookStore.trackSalesStatus());
        BookStore bs1 = new BookStore("Kids", "Author A", "Title A",
                "Publisher A", 15.99, 100, "1000");
        BookStore bs2 = new BookStore("Engineering", "Author B", "Title B",
                "Publisher B", 25.99, 50, "2000");
        BookStore bs3 = new BookStore("Story", "Author C", "Title C",
                "Publisher C", 10.99, 200, "3000");
        System.out.println("Quantity of book 1: " + bs1.getQuantity());
        System.out.println("Quantity of book 2: " + bs2.getQuantity());
        System.out.println("Quantity of book 3: " + bs3.getQuantity());
        bs1.sellBook(10);
        bs2.sellBook(25);
        bs3.sellBook(50);
        System.out.println("Total books sold: " + BookStore.trackSalesStatus());
        System.out.println("Remaining books" +
                "\n" + bs1.getTitle() + ": " + bs1.getQuantity() +
                "\n" + bs2.getTitle() + ": " + bs2.getQuantity() +
                "\n" + bs3.getTitle() + ": " + bs3.getQuantity());
    }
}
