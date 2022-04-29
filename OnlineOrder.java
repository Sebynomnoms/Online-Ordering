import java.util.ArrayList;
import java.util.Scanner;

public class OnlineOrder {

    /**
     * creates an array list to add the items to.
     */
    protected static ArrayList<Menu> itemList = new ArrayList<Menu>();

    /**
     * creates a Scanner for user input.
     */
    protected static Scanner sc = new Scanner(System.in);

    /**
     * A simple method that prints all of the items in the order.
     */
    public static void printAllItems() {
        System.out.println("List of all items:");
        double p1 = 0;
        int i = 1;
        // for each loop to run through things
        for (Menu m1 : itemList) {
            p1 += m1.getPrice();
            System.out.print(i + ". ");
            // uses the toString() method to print the thing
            System.out.println(m1.toString());
            i++;
        } // end of for each loop

        System.out.println("The total: $" + p1);

    } // end of printAllThings method

    /**
     * prints the options for what the user may do.
     */
    public static void printMenu() {
        // shows all options for the user
        System.out.println("**Welcome to Sebastian's Steak House**");
        System.out.print("1. Print the Menu\n2. Add Entree\n3. Add Side"
                + "\n4. Add Drink\n5. Show/Change Order"
                + "\n6. Remove Items\n7. End\n");
        
    } // end of printMenu() method

    /**
     * allows user to add Entrees to their order.
     */
    public static void addUserEntrees() {
        // prints the menu for case 1
        printCase1();
        // gives user option to select one of the foods
        System.out.print("Make your choice please [1-4]: ");
        final int choice = sc.nextInt();
        // creates a new entree based on the users selection
        switchCaseEntree(choice);
    } // end of addUserEntrees method
    
    /**
     * a switch case to create a new entree that the user selected.
     * @param choice int from user
     */
    public static void switchCaseEntree(int choice) {
        // chooses between 4 options
        switch (choice) {
        case 1: // creates a steak object and adds to the list
            Entrees e1 = new Entrees("PepperCorn Cream Flank Steak",
                    "entree");
            itemList.add(e1);
            break;
            // creates a chicken object and adds to the list
        case 2: Entrees e2 = new Entrees("Chicken Piccata", "entree");
            itemList.add(e2);
            break;
            // creates a shrimp object and adds to list
        case 3: Entrees e3 = new Entrees("Shrimp Scampi", "entree");
            itemList.add(e3);
            break;
            // creates a califlower object and adds to the list
        case 4: Entrees e4 = new Entrees("Buffalo Califlower Tacos", "entree");
            itemList.add(e4);
            break;
        default: System.out.println("Invalid Option");
            break;
        } // end of switch case
    } // end of switchCaseEntree method

    /**
     * prints the case options for number 1.
     */
    public static void printCase1() {
        // gives the user options to choose from for their entree
        System.out.println("Entree Options: ");
        System.out.print("1. PepperCorn Cream Flank Steak $14\n2. Chicken "
                + "Piccata $11\n3. Shrimp Scampi $12"
                + "\n4. Buffalo Califlower Tacos $10\n");
        
    } // end of printCase1 method

    /**
     * allows user to add sides to their order.
     */
    public static void addUserSides() {
        // prints the menu for case 2
        printCase2();
        
        // gets user to make a choice on what to add
        System.out.print("Make your choice please [1-4]: ");
        final int choice = sc.nextInt();
        
        // uses the choice to create object and add to the list
        switchCaseSides(choice);
        
    } // end of addUserSides
    
    public static void switchCaseSides(int choice) {
        switch (choice) {
        // creates a side of truffle fries and adds to list
        case 1: Side e1 = new Side("truffle fries", "side");
            itemList.add(e1);
            break;
            // creates a side of mashed potatoes and adds to list
        case 2: Side e2 = new Side("mashed potatoes", "side");
            itemList.add(e2);
            break;
            // creates a side of broccoli and adds to list
        case 3: Side e3 = new Side("broccoli", "side");
            itemList.add(e3);
            break;
            // creates a ceasar side salad and adds to list
        case 4: Side e4 = new Side("ceasar salad", "side");
            itemList.add(e4);
            break;
        default: System.out.println("Invalid Option");
            break;
        } // end of switch case
    } // end of switchCaseSides method

    /**
     * prints the case options for #2.
     */
    public static void printCase2() {
        // prints the side options for user to choose
        System.out.println("Side Options: ");
        System.out.print("1. Truffle Fries $2\n2. Mashed Potatoes $2"
                + "\n3. Broccoli $2\n4. Ceasar Salad $3\n");
        
    } // end of printCase2 method

    /**
     * allows user to add drinks to their order.
     */
    public static void addUserDrinks() {
        // prints the menu for case 3
        printCase3();
        // gets the user to enter a choice and uses for switch case
        System.out.print("Make your choice please [1-3]: ");
        final int choice = sc.nextInt();
        switch (choice) {
        // creates a soda and adds to list
        case 1: Drink e = new Drink("soda", "drink");
            itemList.add(e);
            break;
            // creates lemonade and adds to list
        case 2: Drink e1 = new Drink("lemonade", "drink");
            itemList.add(e1);
            break;
            // creates a water and adds to list
        case 3: Drink e2 = new Drink("water", "drink");
            itemList.add(e2);
            break;
        default: System.out.println("Invalid Option");
            break;
        } // end of switch case

    } // end of addUserSides

    /**
     * prints case options for #3.
     */
    public static void printCase3() {
        // prints the options for drinks to add
        System.out.println("Drink Options: ");
        System.out.print("1. Soda $2\n2. Lemonade $2"
                + "\n3. Water (Free)\n");

    } // end of printCase3

    /**
     * shows the order and allows for change.
     */
    public static void showOrder() {
        // creates a loop to show and change the order
        do {
            // prints all items in the added list and asks for changes
            printAllItems();
            System.out.print("Change any options [Y/N]: ");
            final String choice = sc.next();
            
            // checks if user wants to change any items
            if (choice.toLowerCase().equals("y")) {
                // runs the method to change the order
                ifStatement();
                
            } else {
                // exits out of the loop
                return;
                
            } // end of if statement
            
            return;

        } while (true); // end of do while

    } // end of showOrder method

    /**
     * gives user change to change their order.
     */
    public static void ifStatement() {
        // asks user to choose which spot needs changed
        System.out.println("Enter index (each item is a new one): ");
        final int c = sc.nextInt();
        
     // checks the type of the item chosen
     checkType(c);
        
    } // end of ifStatement method
    
    /**
     * checks the type of the item chosen and changes it.
     * @param c int is index of choice
     */
    public static void checkType(int c) {
        // checks if c -1 is an entree
        if (itemList.get(c - 1).returnType().equals("entree")) {
            // changes the entree and gives options
            changeEntree(c);

        } else if (itemList.get(c - 1).returnType().equals("side")) {
            // changes the side and gives options
            changeSide(c);
        } else if (itemList.get(c - 1).returnType().equals("drink")) {
            // changes the drink and gives options
            changeDrink(c);
            
        } // end of if statement
        
    } // end of checkType method

    /**
     * allows user to change their entree.
     * 
     * @param c int number to change
     */
    public static void changeEntree(int c) {
        printCase1();
        System.out.println("Enter num to change to: ");
        int choice = sc.nextInt();
        
        // switches the entree based on the choice
        switchEntree(choice, c);

    } // end of changeEntree Method
    
    /**
     * changes the entree to a different option.
     * @param choice int from user
     * @param c is index at where the change will occur
     */
    public static void switchEntree(int choice, int c) {
     // gets the choice from user and edits index of that object
        switch (choice) {
        case 1: // changes the item to steak
            itemList.get(c - 1).changeItem("PepperCorn Cream Flank Steak");
            break;
        case 2: // changes the item to chicken
            itemList.get(c - 1).changeItem("Chicken Piccata");
            break;
        case 3: // changes the item to shrimp
            itemList.get(c - 1).changeItem("Shrimp Scampi");
            break;
        case 4: // changes the item to califlower
            itemList.get(c - 1).changeItem("Buffalo Califlower Tacos");
            break;
        default:
            System.out.println("Invalid Option");
            break;

        } // end of switch case
        
    } // end of switchEntree method

    /**
     * allows user to change side.
     * 
     * @param c int number to change
     */
    public static void changeDrink(int c) {
        // prints the options and asks what to change it to
        printCase2();
        System.out.println("Enter num to change to: ");
        int choice = sc.nextInt();
        
        // calls switchDrink to change the drink
        switchDrink(choice, c);
        
    } // end of changeSide method

    
    public static void switchDrink(int choice, int c) {
        // gets the choice from user and edits index of that object
        switch (choice) {
        case 1: // changes item to soda
            itemList.get(c - 1).changeItem("soda");
            break;
        case 2: // changes item to lemonade
            itemList.get(c - 1).changeItem("lemonade");
            break;
        case 3: // changes item to water
            itemList.get(c - 1).changeItem("water");
            break;
        default:
            System.out.println("Invalid Option");
            break;
        } // end of switch case
        
    } // end of switchDrink method
    
    /**
     * allows user to change drink.
     * @param c int number to change
     */
    public static void changeSide(int c) {
        // prints the options to change the side to
        printCase2();
        
        // asks suer to enter number to change
        System.out.println("Enter num to change to: ");
        int choice = sc.nextInt();
        
        // calls switchSide method to change the item
        switchSide(choice, c);
        
    } // end of changeDrink Method

    public static void switchSide(int choice, int c) {
        // gets the choice from user and edits index of that object
        switch (choice) {
        case 1: // changes item to truffle fries
            itemList.get(c - 1).changeItem("truffle fries");
            break;
            
        case 2: // changes item to mashed potatoes
            itemList.get(c - 1).changeItem("mashed potatoes");
            break;
            
        case 3: // changes item to broccoli
            itemList.get(c - 1).changeItem("broccoli");
            break;
            
        case 4: // changes item to ceasar salad
            itemList.get(c - 1).changeItem("ceasar salad");
            break;
            
        default: // says invalid option
            System.out.println("Invalid Option");
            break;
            
        } // end of switch case
        
    } // end of switchSide method
    
    /**
     * removes an item from the list.
     */
    public static void removeItem() {
        // shows the order and asks to choose what to remove
        showOrder();
        System.out.println("Enter number to remove: ");
        int choice = sc.nextInt();
        
        // removes the choice form the list
        itemList.remove(choice - 1);
        
        // prints the updated list after removing item
        System.out.println("The updated List: ");
        showOrder();
        
    } // end of removeItem method
    
    /**
     * creates a switch case for user to follow.
     * @param choice int from user
     */
    public static void mainSwitchCase(int choice) {
        switch (choice) {
        case 1: // prints the menu
            printMenu();
            break;
        case 2: // adds user entrees
            addUserEntrees();
            break;
        case 3: // adds user sides
            addUserSides();
            break;
        case 4: // adds users drinks
            addUserDrinks();
            break;
        case 5: // changes and shows order
            showOrder();
            break; // removes item from order
        case 6: removeItem();
            break;
        case 7: System.out.println("***Your order has been Placed!***"); 
            return;
        default: // not a choice
            System.out.println("Invalid option.");
        } // end of switch case
    } // end of mainSwitchCase method
    
    /**
     * This method runs the program to show the options for ordering.
     */
    public static void runOrder() {
        // initializes the choice
        int choice;
        do {
            // runs through this loop and gets user input
            printMenu();
            System.out.println("Choose a number [1-7]: ");
            choice = sc.nextInt();
            mainSwitchCase(choice);
            
        } while (choice != 7);
        
    } // end of runOrder method
    
    public static void main(String[] args) {
        runOrder();
    }
    
} // end of OnlineOrder Class
