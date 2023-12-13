package inventory;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author barbaracharles
 * 5/8/2023
 * 
 * Oracle Academy - Java Fundamentals
 * Section 4: Creating an Inventory Project
 * 
 */
public class Product {
    
    // instance field declarations
    private String itemName;
    private double itemPrice;
    private int numInStock;
    private int itemNum;
    
    // default constructor
    public Product() {
        // initialize fields to default values
        this.itemName = "";
        this.itemPrice = 0.0;
        this.numInStock = 0;
        this.itemNum = 0;
              
    } // end of default constructor
    
    // constructor with parameters
    public Product(int number, String name, int qty, double price) {
        // initialize fields with parameter values
        this.itemNum = number;
        this.itemName = name;
        this.numInStock = qty;
        this.itemPrice = price;
    } // End of Product constructor with parameters
    
    // getter/setter methods for item name
    public String getItemName() {
        return itemName;
    }
    
    public void setItemName(String itemName) {
        this.itemName = itemName;
    }
    
    
    // getter/setter methods for item price
    public double getItemPrice() {
        return itemPrice;
    }
    
    public void setItemPrice(double itemPrice) {
        this.itemPrice = itemPrice;
    }
    
    // getter/setter for amount in stock
    public int getNumInStock() {
        return numInStock;
    }
    
    public void setNumInStock(int numInStock) {
        this.numInStock = numInStock;
    }
    
    // getter/setter for item number
    public int getItemNum() {
        return itemNum;
    }
    
    public void setItemNum(int itemNum) {
        this.itemNum = itemNum;
    }
    
    
    // Getter/setter methods for itemName, itemPrice, numInStock, and itemNum
    // Override toString()
    public String toString() {
            String productInfo = "";
            productInfo += "\nItem Number: " + getItemNum();
            productInfo += "\nName: " + getItemName();
            productInfo += "\nQuantity in stock: " + getNumInStock();
            productInfo += "\nPrice: " + getItemPrice();
            productInfo += "\n------------------";
            return productInfo;
    } // end toString()
    
} // End of Public class Product
