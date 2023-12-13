/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package inventory;
import java.util.Scanner;

/**
 *
 * @author barbaracharles
 * 5/16/2023
 * 
 * Oracle Academy - Java Fundamentals
 * Section 5: Creating an Inventory Project
 * 
 */
public class ProductTester {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
        // add a Scanner called in 
        Scanner in =new Scanner(System.in);
        
        // create tempeary variables to store user's input
        int tempNumber;
        String tempName;
        int tempQty;
        double tempPrice;
      
        
        // prompt user for values
        System.out.println("Please enter item number: ");
        tempNumber = in.nextInt();
        
        System.out.println("Please enter item name: ");
        tempName = in.next();
        
        System.out.println("Plese enter quantity in stock: ");
        tempQty = in.nextInt();
        
        System.out.println("Please enter item price: ");
        tempPrice = in.nextDouble();
        
        // create product object
        Product p1 = new Product(tempNumber, tempName, tempQty, tempPrice);
        
        // print details
        System.out.println("New Product: \n" + p1.toString());
        
/*        
        // create temp variables for p2
        System.out.println("Please enter item number for p2: ");
        tempNumber = in.nextInt();
        
        System.out.println("Please enter item name (p2): ");
        tempName = in.next();
        
        System.out.println("Plese enter quantity in stock (p2): ");
        tempQty = in.nextInt();
        
        System.out.println("Please enter item price(p2): ");
        tempPrice = in.nextDouble();
        
        // create product object
        Product p2 = new Product(tempNumber, tempName, tempQty, tempPrice);
        
        // print details for p2
        System.out.println("New Product: \n" + p2.toString());
*/     

        // call setter to set active to false for p6
        Product p6 = new Product(123, "15mm C Curl 0.05", 5, 5);
        p6.setActive(false);
        
        // print details for p6
        System.out.println("Product 6: \n" + p6.toString());
        
        
 /*       
        
        // create two product objects using default constructor
        Product product1 = new Product();
        Product product2 = new Product();
        
        // setter methods to set instance field values for product1
        product1.setItemName("9-15mm Mix C Curl 0.05");
        product1.setItemPrice(15.0);
        product1.setNumInStock(15);
        product1.setItemNum(12345);

        // setter methods to set instance field values for product2
        product2.setItemName("10mm C Curl 0.05");
        product2.setItemPrice(15.0);
        product2.setNumInStock(5);
        product2.setItemNum(67890);
        
        // print to console first 2 products (default constructor)
        System.out.println("Product 1:\n" + product1.toString() + "\n");
        System.out.println("Product 2:\n" + product2.toString() + "\n");
        
        
        // create next four Product objects using parameters
        Product product3 = new Product(1357, "11mm C Curl 0.05", 5, 15.0);
        Product product4 = new Product(2468, "12mm C Curl 0.05", 21, 15.0);
        Product product5 = new Product(9876, "13mm C Curl 0.05", 7, 15.0);
        Product product6 = new Product(6543, "14mm C Curl 0.05", 9, 15.0);
        
        // print to console last 4 products (6 products total)
        System.out.println("Product 3:\n" + product3.toString() + "\n");
        System.out.println("Product 4:\n" + product4.toString() + "\n");
        System.out.println("Product 5:\n" + product5.toString() + "\n");
        System.out.println("Product 6:\n" + product6.toString() + "\n");
*/
    } // end main
    
} // end class
