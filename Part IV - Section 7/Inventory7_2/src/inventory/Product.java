package inventory;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author barbaracharles
 * 6/16/2023
 * 
 * Oracle Academy - Java Fundamentals
 * Section 7: Creating an Inventory Project Part 2
 * 
 */


public class Product {
    
    // instance field declarations
    private String itemName;
    private double itemPrice;
    private int numInStock;
    private int itemNum;
    private boolean active;
    private boolean discontinued;
    
    // default constructor
    public Product() {
        // initialize fields to default values
        this.itemName = "";
        this.itemPrice = 0.0;
        this.numInStock = 0;
        this.itemNum = 0;
        active = true;
        this.discontinued = false;
    }
    
    // constructor with parameters
    public Product(int number, String name, int qty, double price) {
        // initialize fields with parameter values
        this.itemNum = number;
        this.itemName = name;
        this.numInStock = qty;
        this.itemPrice = price;
        active = true;
    }
    
    // method to add to inventory
    public void addToInventory(int quantity) {
        if (active && !discontinued) {
            numInStock += quantity;
            System.out.println(quantity + " items added to inventory.");
        } else {
            System.out.println("Cannot add stock to a discontinued product line.");
        }
    }
    
    // method to deduct from inventory
    public void deductFromInventory(int quantity) {
        if (active && !discontinued) {
            if (numInStock >= quantity) {
                numInStock -= quantity;
                System.out.println(quantity + " items deducted from inventory.");
            } else {
                System.out.println("Insufficient stock.");
            }
        } else {
            System.out.println("Product line is discontinued or inactive.");
        }
    }
    
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
    
    // getter/setter for active/inactive
    public boolean isActive() {
        return active;
    }
    
    public void setActive(boolean active) {
        this.active = active;
    }
    
    // getter/setter for discontinued
    public boolean isDiscontinued() {
        return discontinued;
    }
    
    public void setDiscontinued(boolean discontinued) {
        this.discontinued = discontinued;
    }
    
    // Method to set the quantity
    public void setQuantity(int quantity) {
        this.numInStock = quantity;
    }
    
    // Method to get the quantity
    public int getQuantity() {
        return numInStock;
    }
    
    // create method for inventory value
    public double getValue() {
        return itemPrice * numInStock;
    }
    
    // Override toString()
    public String toString() {
        String status = isActive() ? "Active" : "Discontinued";
        String productInfo = "";
        productInfo += "\nItem Number: " + getItemNum();
        productInfo += "\nName: " + getItemName();
        productInfo += "\nQuantity in stock: " + getNumInStock();
        productInfo += "\nPrice: " + getItemPrice();
        productInfo += "\nStock Value: " + getValue();
        productInfo += "\nProduct Status: " + status;
        productInfo += "\nDiscontinued: " + discontinued;
        productInfo += "\n------------------";
        return productInfo;
    }
}

