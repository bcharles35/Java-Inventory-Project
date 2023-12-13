/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package inventory;

/**
 *
 * @author barbaracharles
 */
public class CD extends Product {
    private String artist;
    private int numSongs;
    private String recordLabel;
    
    public CD() {
        // call default constructor
        super();
        this.artist = "";
        this.numSongs = 0;
        this.recordLabel = "";
    }
    
    public CD(int number, String name, int qty, double price, String artist, int numSongs, String recordLabel) {
        // call Product constructor with parameters
        super(number, name, qty, price);
        this.artist = artist;
        this.numSongs = numSongs;
        this.recordLabel = recordLabel;
    }
    
    // getters/setters
    public String getArtist() {
        return artist;
    }
    
    public void setArtist(String artist) {
        this.artist = artist;
    }
    
    public int getNumSongs() {
        return numSongs;
    }
    
    public String getRecordLabel() {
        return recordLabel;
    }
    
    public void setRecordLabel(String recordLabel) {
        this.recordLabel = recordLabel;
    }
    
    // override toString()
    public String toString() {
        return super.toString() +
                "Artist: " + artist + "\n" +
                "Songs on Album: " + numSongs + "\n" +
                "Record Label: " + recordLabel + "\n";
                    
    } // end toString()
    
    
} // end CD class
