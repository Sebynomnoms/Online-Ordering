
/**
 * creates a side item for the customer to purchase.
 * 
 * @author boringsr@miamioh.edu (Sebastian Boring)
 *
 */
public class Side extends Menu {

    /**
     * creates the side as long as the order number.
     * 
     * @param item String is the name of the side dish
     * @param String type of item
     */
    public Side(String side, String t) {
        // super from parent to create the variable
        super(side, t);

    } // end of Side method

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
     * gets the price of the side dish.
     * 
     * @return double price
     */
    public double getPrice() {
        checkItemPrice();
        // returns price of the item
        return this.itemPrice;

    } // end of getPrice method

    @Override
    /**
     * gets the name of the side dish.
     * 
     * @return String name of side dish
     */
    public String returnItem() {
        // returns the name
        return this.orderedItem;

    } // end of returnedItem method

    @Override
    /**
     * gets the type of item which is side
     * 
     * @return String type of item
     */
    public String returnType() {
        // gets order number
        return this.type;

    } // end of returnOrderNum

    @Override
    /**
     * changes the side dish for customer.
     * 
     * @param newItem is string of new side
     */
    public void changeItem(String newSide) {
        // subtracts the price of the old side
        price -= getPrice();
        
        // changes side dish to a different option
        this.orderedItem = newSide;

    } // end of changeItem method

    @Override
    /**
     * adds the price of the side to the total price.
     */
    public void checkItemPrice() {
        // checks for the side item to get price
        if (orderedItem.equals("truffle fries")
                || orderedItem.equals("mashed potatoes")
                || orderedItem.equals("broccoli")) {
            this.itemPrice = 2;
            price += 2;

        } else if (orderedItem.equals("ceasar salad")) {
            this.itemPrice = 3;
            price += 3;

        } else {
            this.itemPrice = 4;
            price += 4;
        } // end of if statement

    } // end of checkItemPrice method
    
    @Override
    /**
     * returns string value of the side.
     * @return string side
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
        if (obj == null || obj.getClass() != Side.class) {
            // returns false because they do not matter
            return false;
            
        } else {
            // assigns a new variable to check for equal
            Side s1 = (Side) obj;
            // returns true if the type and item are the same for each
            return (s1.returnItem().equals(this.orderedItem) 
                    && s1.returnType().equals(this.type));
            
        } // end of if statement

    } // end of equals method

} // end of side class
