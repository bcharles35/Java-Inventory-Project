/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package inventory;
import java.util.Scanner;
import java.util.InputMismatchException;

/**
 *
 * @author barbaracharles
 * 6/16/2023
 * 
 * Oracle Academy - Java Fundamentals
 * Section 7: Creating an Inventory Project Part 1
 * 
 */
public class ProductTester {

    public static void main(String[] args) {
        
        // create a scanner object for keyboard input
        Scanner in = new Scanner(System.in);
        
        int maxSize, menuChoice;
        
        maxSize = getNumProducts(in);
        if(maxSize == 0) {
            // Display a no products message if zero is entered
            System.out.println("No products required!");    
        } else {
            Product[] products = new Product[maxSize];
            addToInventory(products, in);
            do {
                menuChoice = getMenuOption(in);
                executeMenuChoice(menuChoice, products, in);
            } while(menuChoice != 0);
        } // end if
         
    } // end Main
    
    
public static void addToInventory(Product[] products, Scanner in) {
    System.out.println("Adding products to inventory...");
    
    for (int i = 0; i < products.length; i++) {
        System.out.println("Enter details for product " + (i + 1));
        
        // Get product information from user input
        System.out.print("Enter the item number: ");
        int number = in.nextInt();
        in.nextLine(); // Clear the newline character from the previous input
        
        // Get product information from user input
        System.out.print("Enter the name of the product: ");
        String name = in.nextLine();
//        in.nextLine();

        System.out.print("Enter the quantity in stock: ");
        int qty = in.nextInt();
        
        double price = 0.0;
        boolean validInput = false;
        while (!validInput) {
            try {
                System.out.print("Enter the price of the product: ");
                price = in.nextDouble();
                validInput = true;
            } catch (InputMismatchException e) {
                System.out.println("Invalid input. Please enter a valid price.");
                in.nextLine(); // Clear the input buffer
            }
        }
        
            // Create a new Product object and store it in the array
            products[i] = new Product(number, name, qty, price);
    }
    
    System.out.println("Inventory updated!");
}

    
    
    // method to get the maximum number of product from user
    public static int getNumProducts(Scanner in) {
        System.out.println("Enter the maximum number of products: ");
        int maxSize = in.nextInt();
        return maxSize;
    } // end getNumProducts()
    
    
    //method to display the menu and get user's choice
    public static int getMenuOption(Scanner in) {
        int menuChoice;
        
        System.out.println("\n1. View Inventory");
        System.out.println("2. Add Stock");
        System.out.println("3. Deduct Stock");
        System.out.println("4. Discontinue Stock");
        System.out.println("0. Exit");
        System.out.println("Please enter a menu option: ");
        
        try {
            menuChoice = in.nextInt();
        } catch (Exception e) {
            menuChoice = -1; // force reprompt
            in.nextLine();
        }
        
        return menuChoice;
    } // end getMenuOption()
    
  
    // method to display the index value and name of each product
    public static int getProductNumber(Product[] products, Scanner in) {
        int productChoice = -1;
        
        System.out.println("Product List: ");
        for (int i = 0; i < products.length; i++) {
            System.out.println(i + ". " + products[i].getItemName());
        }
        System.out.print("Enter the product number: ");
        try {
            productChoice = in.nextInt();
            if (productChoice < 0 || productChoice >= products.length) {
            productChoice = -1; // invalid choice
        }
        } catch (Exception e) {
            in.nextLine();
        }
        return productChoice;
    } // end getProductNumber()
    
    // Method to add stock values to each identified product
    public static void addInventory(Product[] products, Scanner scanner) {
        int productChoice = getProductNumber(products, scanner);
        if (productChoice != -1) {
            System.out.println("Enter the quantity to add: ");
            int updateValue = scanner.nextInt();
            scanner.nextLine(); // Clear scanner buffer
            products[productChoice].addToInventory(updateValue);
            System.out.println("Stock updated successfully!");
        } else {
            System.out.println("Invalid product choice!");
        }
    } // end addInventory()
    
    
        // Method to execute the selected menu choice
    public static void executeMenuChoice(int menuChoice, Product[] products, Scanner scanner) {
        switch (menuChoice) {
            case 1:
                System.out.println("View Product List:");
                displayInventory(products);
                break;
            case 2:
                System.out.println("Add Stock:");
                addInventory(products, scanner);
                break;
            case 3:
                System.out.println("Deduct Stock:");
                deductInventory(products, scanner);
                break;
            case 4:
                System.out.println("Discontinue Stock:");
                discontinueInventory(products, scanner);
                break;
            case 0:
                System.out.println("Exiting...");
                break;
            default:
                System.out.println("Invalid menu option!");
                break;
        }
    } // end executeMenuChoice
    
        // Method to display the inventory
    public static void displayInventory(Product[] products) {
        System.out.println("Inventory:");
        for (Product product : products) {
            System.out.println(product);
        }
    } // end displayInventory()
    
        // Method to deduct stock values from each identified product
    public static void deductInventory(Product[] products, Scanner scanner) {
        int productChoice = getProductNumber(products, scanner);
        if (productChoice != -1) {
            System.out.println("Enter the quantity to deduct: ");
            int deductQty = scanner.nextInt();
            products[productChoice].deductFromInventory(deductQty);
        } else {
            System.out.println("Invalid product choice!");
        }
    } // end deductInventory
    
        // Method to discontinue a product
    public static void discontinueInventory(Product[] products, Scanner scanner) {
        int productChoice = getProductNumber(products, scanner);
        if (productChoice != -1) {
            products[productChoice].setActive(false);
            System.out.println("Product discontinued.");
        } else {
            System.out.println("Invalid product choice!");
        }
    } // end discontinueInventory()

    
    
} // end ProductTester
    
