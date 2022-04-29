

/**
 * creates a menu item for the customer to purchase.
 * 
 * @author boringsr@miamioh.edu (Sebastian Boring)
 *
 */
public abstract class Menu {

    /**
     * gets the price of the menu item.
     */
    protected double itemPrice;
    
    /**
     * gets the total price of the item
     */
    protected double price;
    
    /**
     * is the type of item for the customer.
     */
    protected String type;

    /**
     * Is the item ordered by the customer.
     */
    protected String orderedItem;

    /**
     * Creates an order from the customer.
     * 
     * @param item is string of the item ordered
     * @param String type of item
     */
    public Menu(String item, String t) {
        this.orderedItem = item;
        this.type = t;
    }

    /**
     * gets the total price of the order.
     * @return double price 
     */
    public abstract double getTotalPrice();
    /**
     * gets the price of the certain item.
     * 
     * @return double value of it
     */
    public abstract double getPrice();

    /**
     * prints out the order of the customer.
     */
    public abstract String returnItem();

    /**
     * gets the type of the item of the customer.
     * 
     * @return String type of item
     */
    public abstract String returnType();

    /**
     * allows the customer to change the item they ordered.
     * 
     * @param newItem string of changed order
     */
    public abstract void changeItem(String newItem);

    /**
     * compares the item to other options and finds the price of it to add to
     * the total.
     * 
     * @return double price of item
     */
    public abstract void checkItemPrice();
    
    /**
     * changes the toString method to print the constructors.
     * @return String of the class
     */
    public abstract String toString();

}
