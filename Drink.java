
/**
 * creates a drink for the customer to purchase.
 * 
 * @author boringsr@miamioh.edu (Sebastian Boring)
 *
 */
public class Drink extends Menu {

    /**
     * creates the drink as well as the order number.
     * 
     * @param item String is the name of the drink
     * @param String is type of item
     */
    public Drink(String drink, String t) {
        // super from parent to create the variable
        super(drink, t);

    } // end of Drink method
    
    @Override
    /**
     * returns the total price of the meal.
     * 
     * @return double is total cost
     */
    public double getTotalPrice() {
        // returns the calculated price
        return price;

    } // end of getPrice method

    @Override
    /**
     * gets the price of the drink.
     * 
     * @return double price
     */
    public double getPrice() {
        checkItemPrice();
        // returns price of the drink
        return this.itemPrice;

    } // end of getPrice method

    @Override
    /**
     * gets the name of the drink.
     * 
     * @return String name of drink
     */
    public String returnItem() {
        // returns the name
        return this.orderedItem;

    } // end of returnedItem method

    @Override
    /**
     * gets the item type which is drink.
     * 
     * @return String type of item
     */
    public String returnType() {
        // gets order number
        return this.type;

    } // end of returnOrderNum

    @Override
    /**
     * changes the drink for customer.
     * 
     * @param newItem is string of new drink
     */
    public void changeItem(String newDrink) {
        // subtracts the price of the old drink
        price -= getPrice();

        // changes side dish to a different option
        this.orderedItem = newDrink;

    } // end of changeItem method

    @Override
    /**
     * adds the price of the drink to the total price.
     */
    public void checkItemPrice() {
        // checks for the drink to get price
        if (orderedItem.equals("soda") || orderedItem.equals("lemonade")) {
            this.itemPrice = 2;
            price += 2;

        } // end of if statement

    } // end of checkItemPrice method
    
    @Override
    /**
     * returns string value of the Drink.
     * @return string drink
     */
    public String toString() {
        // turns object into string
        String s1 = "The entree: " + this.returnItem();
        s1 += "\nThe price: " + this.getPrice();
        // returns the new string
        return s1;
        
    } // end of toString method
    
    /**
     * gets the Object and sees if they are equal to each other.
     * @param obj is Object inputed by the user
     * @return boolean that returns true or false
     */
    public boolean equals(Object obj) {
        // checks to see if objects are equal
        if (obj == null || obj.getClass() != Drink.class) {
            // returns false because they do not matter
            return false;
            
        } else {
            // assigns a new variable to check for equal
            Drink d1 = (Drink) obj;
            // returns true if the type and item are the same for each
            return (d1.returnItem().equals(this.orderedItem) 
                    && d1.returnType().equals(this.type));
            
        } // end of if statement

    } // end of equals method

} // end of Drink class
