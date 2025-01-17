/**
 * This class maintains the record of books sold
 * @author Maksim Petrosyan
 * */
public class BookStore {
    private String bookCategory;
    private String author;
    private String title;
    private String publisher;
    private double price;
    private int quantity;
    private String storeId;
    private static int totalBooksSold = 0;

    /**
     * Constructs BookStore with specified parameters.
     * @param bookCategory Category of the book.
     * @param author Author of the book.
     * @param title Title of the book
     * @param publisher Publisher of the book
     * @param price Price of the book
     * @param quantity Quantity of the books in the store
     * @param storeId Id of the store
     * */
    public BookStore(String bookCategory, String author, String title, String publisher, double price,
                     int quantity, String storeId){
        setBookCategory(bookCategory);
        setAuthor(author);
        setTitle(title);
        setPublisher(publisher);
        setPrice(price);
        setQuantity(quantity);
        setStoreId(storeId);
    }

    /**
     * Modifies the book category.
     * Only allows "Kids", "Engineering", or "Story" as valid categories.
     * The first letter is capitalized, and the rest are in lowercase.
     *
     * @param bookCategory The category of the book.
     */
    public void setBookCategory(String bookCategory){
        if(bookCategory.equalsIgnoreCase("kids") ||
                bookCategory.equalsIgnoreCase("engineering") ||
                bookCategory.equalsIgnoreCase("story")){
            this.bookCategory = bookCategory.substring(0, 1).toUpperCase() + bookCategory.substring(1).toLowerCase();
        } else{
            System.out.println("Book category should be \"Kids\", \"Engineering\" or \"Story\"");
            System.exit(0);
        }
    }

    /**
     * Modifies the author of the book.
     *
     * @param author The author of the book.
     */
    public void setAuthor(String author){
        this.author = author;
    }

    /**
     * Modifies the title of the book.
     *
     * @param title The title of the book.
     */
    public void setTitle(String title){
        this.title = title;
    }

    /**
     * Modifies the publisher of the book.
     *
     * @param publisher The publisher of the book.
     */
    public void setPublisher(String publisher){
        this.publisher = publisher;
    }

    /**
     * Modifies the price of the book.
     * The price must be non-negative.
     *
     * @param price The price of the book.
     */
    public void setPrice(double price){
        if(price < 0){
            System.out.println("Price can not be negative");
            System.exit(0);
        }
        this.price = price;
    }

    /**
     * Modifies the quantity of books in the store.
     * The quantity must be non-negative.
     *
     * @param quantity The quantity of books in the store.
     */
    public void setQuantity(int quantity){
        if(quantity < 0){
            System.out.println("Quantity can not be negative");
            System.exit(0);
        }
        this.quantity = quantity;
    }

    /**
     * Modifies the store ID.
     *
     * @param storeId The store ID.
     */
    public void setStoreId(String storeId){
        this.storeId = storeId;
    }

    /**
     * Retrieves the book category.
     *
     * @return The category of the book.
     */
    public String getBookCategory(){
        return this.bookCategory;
    }

    /**
     * Retrieves the author of the book.
     *
     * @return The author of the book.
     */
    public String getAuthor(){
        return this.author;
    }

    /**
     * Retrieves the title of the book.
     *
     * @return The title of the book.
     */
    public String getTitle(){
        return this.title;
    }

    /**
     * Retrieves the publisher of the book.
     *
     * @return The publisher of the book.
     */
    public String getPublisher(){
        return this.publisher;
    }

    /**
     * Retrieves the price of the book.
     *
     * @return The price of the book.
     */
    public double getPrice(){
        return this.price;
    }

    /**
     * Retrieves the quantity of books in the store.
     *
     * @return The quantity of books in the store.
     */
    public int getQuantity(){
        return this.quantity;
    }

    /**
     * Retrieves the store ID.
     *
     * @return The store ID.
     */
    public String getStoreId(){
        return this.storeId;
    }

    /**
     * Retrieves the total number of books sold by the store.
     *
     * @return The total number of books sold.
     */
    public static int trackSalesStatus(){
        return totalBooksSold;
    }

    /**
     * Sells a specified number of books from the store.
     * If the quantity requested is available, the quantity is reduced and the total books sold is updated.
     * If the requested quantity exceeds the available quantity, an error message is displayed.
     *
     * @param numOfBooksToSell The number of books to sell.
     * */
    public void sellBook(int numOfBooksToSell){
        if(this.quantity >= numOfBooksToSell){
            quantity -= numOfBooksToSell;
            totalBooksSold += numOfBooksToSell;
        } else{
            System.out.println("Available books are " + this.quantity +
                    ", please enter a number less than or equal to number of books in the store");
        }
    }
}
