
/**
 * creates a entree item for the customer to purchase.
 * @author boringsr@miamioh.edu (Sebastian Boring)
 *
 */
public class Entrees extends Menu {

    /**
     * creates the entree as long as the order number.
     * @param item String is the name of the item.
     * @param String type of item
     */
    public Entrees(String entree, String t) {
        // super from parent to create the variable
        super(entree, t);
       
    } // end of entrees method

    @Override
    /**
     * returns the price of the meal.
     * @return double is total cost
     */
    public double getTotalPrice() {
        // returns the calculated price
        return price;
        
    } // end of getPrice method
    
    @Override
    /**
     * gets the price of the entree.
     * @return double price
     */
    public double getPrice() {
        checkItemPrice();
        // returns price of the item
        return this.itemPrice;
    }

    @Override
    /**
     * gets the name of the entree item.
     * @return String name of entree
     */
    public String returnItem() {
        // returns the name
        return this.orderedItem;
        
    } // end of returnedItem method

    @Override
    /**
     * gets the item type which is entree.
     * @return String type of item
     */
    public String returnType() {
        // gets order number 
        return this.type;
        
    } // end of returnOrderNum

    @Override
    /**
     * changes the entree for customer.
     * @param newItem is string of new choice
     */
    public void changeItem(String newItem) {
        // subtracts the price of the old entree
        price -= getPrice();
        
        // changes entree to a different option
        this.orderedItem = newItem;
        
    } // end of changeItem method

    @Override
    /**
     * adds the price of the entree to the total price.
     */
    public void checkItemPrice() {
        // switch case to find price of the item
        switch (orderedItem.toLowerCase()) {
            case ("peppercorn cream flank steak"):
                price += 14;
                this.itemPrice = 14;
                break;
            case ("chicken piccata"):
                price += 11;
                this.itemPrice = 11;
                break;
            case ("shrimp scampi"):
                price += 12;
                this.itemPrice = 12;
                break;
            case ("buffalo califlower tacos"):
                price += 10;
                this.itemPrice = 10;
                break;
            default:
                price += 10;
                this.itemPrice = 10;
                break;
            
        } // end of switch case
        
    } // end of checkItemPrice method

    @Override
    /**
     * returns string value of the entree.
     * @return string entree
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
        if (obj == null || obj.getClass() != Entrees.class) {
            // returns false because they do not matter
            return false;
            
        } else {
            // assigns a new variable to check for equal
            Entrees e1 = (Entrees) obj;
            // returns true if the type and item are the same for each
            return (e1.returnItem().equals(this.orderedItem) 
                    && e1.returnType().equals(this.type));
            
        } // end of if statement

    } // end of equals method

    
} // end of Entrees class
