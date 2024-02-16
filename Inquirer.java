package edu.ucalgary.oop;

// Class representing an inquirer
public class inquirer {
    // Private instance variables to store first name, last name, information, and services phone
    private String FIRST_NAME; // Variable to store the first name of the inquirer
    private String LAST_NAME; // Variable to store the last name of the inquirer
    private String INFO; // Variable to store additional information about the inquirer
    private String SERVICES_PHONE; // Variable to store the phone number of services for the inquirer

    // Constructor to initialize the inquirer object with provided information
    public inquirer(String FIRST_NAME, String LAST_NAME, String INFO, String SERVICES_PHONE){
        this.FIRST_NAME = FIRST_NAME; // Assign the provided first name to the instance variable
        this.LAST_NAME = LAST_NAME; // Assign the provided last name to the instance variable
        this.INFO = INFO; // Assign the provided additional information to the instance variable
        this.SERVICES_PHONE = SERVICES_PHONE; // Assign the provided services phone number to the instance variable
    }

    // Getter method to retrieve the first name of the inquirer
    public String getFirstName() {
        return FIRST_NAME; // Return the first name of the inquirer
    }

    // Getter method to retrieve the last name of the inquirer
    public String getLastName() {
        return LAST_NAME; // Return the last name of the inquirer
    }

    // Getter method to retrieve additional information about the inquirer
    public String getInfo() {
        return INFO; // Return additional information about the inquirer
    }

    // Getter method to retrieve the phone number of services for the inquirer
    public String getServicesPhone() {
        return SERVICES_PHONE; // Return the phone number of services for the inquirer
    }

}
