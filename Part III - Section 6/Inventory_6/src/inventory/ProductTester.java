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
 * 5/25/2023
 * 
 * Oracle Academy - Java Fundamentals
 * Section 6: Creating an Inventory Project
 * 
 */
public class ProductTester {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
        // add a Scanner called in 
        Scanner in = new Scanner(System.in);
        int maxSize = -1; // Variable to store the number of products to add, initialized to an invalid value

        do {
            try {
                System.out.println("Enter the number of products you would like to add:");
                System.out.println("Enter 0 (zero) if you do not wish to add products.");

                maxSize = in.nextInt(); // get user's input

                if (maxSize < 0) {
                    System.out.println("Incorrect value entered. Please enter a positive number or 0.");
                }
            } catch (InputMismatchException e) {
                System.out.println("Incorrect data type entered!"); // Display an error message for incorrect data type
                in.nextLine();
                maxSize = -1; // Set maxSize to an invalid value to repeat the loop
            }
        } while (maxSize < 0); // Repeat the loop until a valid number of products is entered

        if (maxSize == 0) {
            System.out.println("No product required!"); // If no products are required, display a message and exit the program
        } else {
            // Create an array to store the products
            Product[] products = new Product[maxSize];

            for (int i = 0; i < maxSize; i++) {
                in.nextLine(); 

                // Get input from the user for each field of a product
                System.out.println("Enter item number for product " + (i + 1) + ":");
                int itemNumber = in.nextInt();

                System.out.println("Enter item name for product " + (i + 1) + ":");
                String itemName = in.next();

                System.out.println("Enter quantity in stock for product " + (i + 1) + ":");
                int quantityInStock = in.nextInt();

                System.out.println("Enter item price for product " + (i + 1) + ":");
                double itemPrice = in.nextDouble();

                // Create a new Product object with the user's input and add it to the products array
                products[i] = new Product(itemNumber, itemName, quantityInStock, itemPrice);
            }

            // Display the information for each individual product in the products array
            for (int i = 0; i < maxSize; i++) {
                System.out.println("Product " + (i + 1) + ":\n" + products[i].toString() + "\n");
            }
        }

        in.close(); // Close the scanner
    }
}
        
        
        

