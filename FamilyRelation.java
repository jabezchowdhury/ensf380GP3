package edu.ucalgary.oop;

// Class representing family relations between disaster victims
public class FamilyRelation {

    // Private instance variables to store references to two disaster victims and the relationship between them
    private DisasterVictim personOne; // Reference to the first disaster victim
    private String relationshipTo; // String representing the relationship between personOne and personTwo
    private DisasterVictim personTwo; // Reference to the second disaster victim

    // Constructor to initialize the FamilyRelation object with provided information
    public FamilyRelation(DisasterVictim personOne, String relationshipTo, DisasterVictim personTwo) {
        this.personOne = personOne; // Assign the provided first person to personOne
        this.relationshipTo = relationshipTo; // Assign the provided relationship to relationshipTo
        this.personTwo = personTwo; // Assign the provided second person to personTwo
    }

    // Getter method to retrieve the reference to the first disaster victim
    public DisasterVictim getPersonOne() {
        return personOne; // Return the reference to the first person
    }

    // Getter method to retrieve the relationship between personOne and personTwo
    public String getRelationshipTo() {
        return relationshipTo; // Return the relationship between personOne and personTwo
    }

    // Getter method to retrieve the reference to the second disaster victim
    public DisasterVictim getPersonTwo() {
        return personTwo; // Return the reference to the second person
    }

    // Setter method to update the reference to the first disaster victim
    public void setPersonOne(DisasterVictim personOne) {
        this.personOne = personOne; // Set the reference to the first person
    }

    // Setter method to update the relationship between personOne and personTwo
    public void setRelationshipTo(String relationshipTo) {
        this.relationshipTo = relationshipTo; // Set the relationship between personOne and personTwo
    }

    // Setter method to update the reference to the second disaster victim
    public void setPersonTwo(DisasterVictim personTwo) {
        this.personTwo = personTwo; // Set the reference to the second person
    }
   
}
