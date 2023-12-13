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
 * Section 7: Creating an Inventory Project Part 2
 * 
 */



import java.util.Scanner;
//import java.util.InputMismatchException;

public class ProductTester {

    public static void main(String[] args) {
        
        // Create a scanner object for keyboard input
        Scanner in = new Scanner(System.in);
        
        int maxSize, menuChoice;
        
        maxSize = getNumProducts(in);
        if (maxSize == 0) {
            // Display a no products message if zero is entered
            System.out.println("No products required!");    
        } else {
            Product[] products = new Product[maxSize];
            int stockChoice = getProductType(in);
            addToInventory(products, in, stockChoice);
            do {
                menuChoice = getMenuOption(in);
                executeMenuChoice(menuChoice, products, in);
            } while (menuChoice != 0);
        } // end if
         
    } // end Main
    
    
    // Method to get the maximum number of products from the user
    public static int getNumProducts(Scanner in) {
        System.out.println("Enter the maximum number of products: ");
        int maxSize = in.nextInt();
        return maxSize;
    } // end getNumProducts()    
    
    
    // Method to display the product type options and get the user's choice
    public static int getProductType(Scanner in) {
        int stockChoice = -1;
        
        while (stockChoice < 1 || stockChoice > 2) {
            System.out.println("Select the product type:");
            System.out.println("1: CD");
            System.out.println("2: DVD");
            System.out.print("Please enter the product type: ");

            if (in.hasNextInt()) {
                stockChoice = in.nextInt();
                in.nextLine(); // Clear the newline character from the input buffer

                if (stockChoice < 1 || stockChoice > 2) {
                    System.out.println("Only numbers 1 or 2 allowed!");
                }
            } else {
                System.out.println("Invalid input. Please enter a valid number.");
                in.nextLine(); // Clear the invalid input from the buffer
            }
        }
        
        return stockChoice;
    } // end getProductType()
    
    
    // Method to display the menu and get the user's choice
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
    
    
    public static void addToInventory(Product[] products, Scanner in, int stockChoice) {
        System.out.println("Adding products to inventory...");

        for (int i = 0; i < products.length; i++) {
            System.out.println("Enter details for product " + (i + 1));
            System.out.print("Enter the item number: ");
            int number = in.nextInt();
            in.nextLine();

            System.out.print("Enter the name of the product: ");
            String name = in.nextLine();

            System.out.print("Enter the quantity in stock: ");
            int qty = in.nextInt();

            System.out.print("Enter the price of the product: ");
            double price = in.nextDouble();
            in.nextLine(); // Clear the newline character from the previous input

            if (stockChoice == 1) {
                addCDToInventory(products, i, number, name, qty, price, in);
            } else if (stockChoice == 2) {
                addDVDToInventory(products, i, number, name, qty, price, in);
            }
        }

        System.out.println("Inventory updated!");
    }

    public static void addCDToInventory(Product[] products, int index, int number, String name, int qty, double price, Scanner in) {
        System.out.print("Please enter the CD name: ");
        String cdName = in.nextLine();

        System.out.print("Please enter the artist name: ");
        String artist = in.nextLine();

        System.out.print("Please enter the record label name: ");
        String recordLabel = in.nextLine();

        System.out.print("Please enter the number of songs: ");
        int numSongs = in.nextInt();
        in.nextLine(); // Clear the newline character from the previous input

        products[index] = new CD(number, cdName, qty, price, artist, numSongs, recordLabel);
    }

    public static void addDVDToInventory(Product[] products, int index, int number, String name, int qty, double price, Scanner in) {
        System.out.print("Please enter the DVD name: ");
        String dvdName = in.nextLine();

        System.out.print("Please enter the film studio name: ");
        String filmStudio = in.nextLine();

        System.out.print("Please enter the age rating: ");
        String ageRating = in.nextLine();

        System.out.print("Please enter the length in minutes: ");
        int lengthInMinutes = in.nextInt();
        in.nextLine(); // Clear the newline character from the previous input

        products[index] = new DVD(number, dvdName, qty, price, lengthInMinutes, filmStudio, ageRating);
    }

    // Method to display the index value and name of each product
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
            scanner.nextLine(); // Clear scanner...

            // Update the quantity of the selected product
            Product selectedProduct = products[productChoice];
            selectedProduct.setQuantity(selectedProduct.getQuantity() + updateValue);
            System.out.println("Stock added successfully!");
        } else {
            System.out.println("Invalid product number!");
        }
    } // end addInventory()
    
    
    // Method to deduct stock values from each identified product
    public static void deductInventory(Product[] products, Scanner scanner) {
        int productChoice = getProductNumber(products, scanner);
        if (productChoice != -1) {
            System.out.println("Enter the quantity to deduct: ");
            int updateValue = scanner.nextInt();
            scanner.nextLine(); // Clear scanner...

            // Update the quantity of the selected product
            Product selectedProduct = products[productChoice];
            int currentQuantity = selectedProduct.getQuantity();
            if (updateValue <= currentQuantity) {
                selectedProduct.setQuantity(currentQuantity - updateValue);
                System.out.println("Stock deducted successfully!");
            } else {
                System.out.println("Insufficient stock. Deduction not possible!");
            }
        } else {
            System.out.println("Invalid product number!");
        }
    } // end deductInventory()
    
    
    // Method to discontinue a product by setting its quantity to 0
    public static void discontinueInventory(Product[] products, Scanner scanner) {
        int productChoice = getProductNumber(products, scanner);
        if (productChoice != -1) {
            Product selectedProduct = products[productChoice];
            selectedProduct.setQuantity(0);
            System.out.println("Product discontinued successfully!");
        } else {
            System.out.println("Invalid product number!");
        }
    } // end discontinueInventory()

} // end class ProductTester
