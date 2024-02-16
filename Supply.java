package edu.ucalgary.oop;

public class Supply {
    private String type;
    private int quantity;

    // Constructor
    public Supply(String type, int quantity) {
        this.type = type;
        this.quantity = quantity;
    }

    // Getter for 'type'
    public String getType() {
        return this.type;
    }

    // Setter for 'type'
    public void setType(String type) {
        this.type = type;
    }

    // Getter for 'quantity'
    public int getQuantity() {
        return this.quantity;
    }

    // Setter for 'quantity'
    public void setQuantity(int quantity) {
        this.quantity = quantity;
    }
}