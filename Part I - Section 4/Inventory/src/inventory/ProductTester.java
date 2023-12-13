/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package inventory;

/**
 *
 * @author barbaracharles
 * 5/8/2023
 * 
 * Oracle Academy - Java Fundamentals
 * Section 4: Creating an Inventory Project
 * 
 */
public class ProductTester {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
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
    }
    
}
