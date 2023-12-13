/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package inventory;

/**
 *
 * @author barbaracharles
 */
public class DVD extends Product {
    private int movieLength;
    private String ageRating;
    private String filmStudio;



    public DVD() {
        super(); // call constructer from Product superclass
        this.movieLength = 0;
        this.ageRating = "";
        this.filmStudio = "";
}
    
    public DVD(int number, String name, int qty, double price, int movieLength, String ageRating, String filmStudio) {
        // call constructor
        super(number, name, qty, price);
        this.movieLength = movieLength;
        this.ageRating = ageRating;
        this.filmStudio = filmStudio;
    }
    
    // getters and setter
    
   public int getMovieLength() {
       return movieLength;
   }
    
   public void setMovieLength() {
       this.movieLength = movieLength;
   }
   
   public String getAgeRating() {
       return ageRating;
   }
   
   public void setAgeRating() {
       this.ageRating = ageRating;
   }
   
   public String getFilmStudio() {
       return filmStudio;
   }
   
   public void setFilmStudio() {
       this.filmStudio = filmStudio;
   }
   
   public double calculateInventoryValue() {
       double price = super.getItemPrice();
       int quantity = super.getNumInStock();
       
       double inventoryValue = price * quantity;
       inventoryValue *= 1.05;
       
       return inventoryValue;
   }
   
   // override toString()
   public String toString() {
       return super.toString() +
               "Movie Length: " + movieLength + " minutes\n" +
               "Age Rating: " + ageRating + "\n" +
               "Film Studio: " + filmStudio + "\n";
   } // end toString()
   
   
} // end DVD class
