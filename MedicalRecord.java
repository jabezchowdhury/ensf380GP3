package edu.ucalgary.oop;

public class MedicalRecord {
    // Instance variables
    private Location location;
    private String treatmentDetails;
    private String dateOfTreatment;

    // Constructor
    public MedicalRecord(Location location, String treatmentDetails, String dateOfTreatment) {
        this.location = location;
        this.treatmentDetails = treatmentDetails;
        this.dateOfTreatment = dateOfTreatment;
    }

    // Getter for location
    public Location getLocation() {
        return this.location;
    }

    // Setter for location
    public void setLocation(Location location) {
        this.location = location;
    }

    // Getter for treatmentDetails
    public String getTreatmentDetails() {
        return this.treatmentDetails;
    }

    // Setter for treatmentDetails
    public void setTreatmentDetails(String treatmentDetails) {
        this.treatmentDetails = treatmentDetails;
    }

    // Getter for dateOfTreatment
    public String getDateOfTreatment() {
        return this.dateOfTreatment;
    }

    // Setter for dateOfTreatment
    public void setDateOfTreatment(String dateOfTreatment) {
        java.text.SimpleDateFormat format = new java.text.SimpleDateFormat("yyyy-MM-dd");
        format.setLenient(false);
        try {
            format.parse(dateOfTreatment);
            this.dateOfTreatment = dateOfTreatment;
        } catch (java.text.ParseException e) {
            throw new IllegalArgumentException("Invalid date format. Expected format is 'yyyy-MM-dd'.");
        }
    }
}