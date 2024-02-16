package edu.ucalgary.oop;

 

import java.util.regex.*;

 

public class MedicalRecord {

 

    private Location location;

 

    private String treatmentDetails;

 

    private String dateOfTreatment;

 

    private static final String REGEX = "^(\\d{4})-(\\d{2})-(\\d{2})$";

 

    private static final Pattern PATTERN = Pattern.compile(REGEX);

 

    public MedicalRecord(Location location, String treatmentDetails, String dateOfTreatment) throws IllegalArgumentException {

        Matcher match = PATTERN.matcher(dateOfTreatment);

        boolean matchFound = match.find();

 

        if (matchFound) {

            this.location = location;

            this.treatmentDetails = treatmentDetails;

            this.dateOfTreatment = dateOfTreatment;

        } else {

            throw new IllegalArgumentException("IllegalArgumentException: Not a valid format for date: " + dateOfTreatment);

        }

 

 

    }

 

    public void setLocation(Location location) {

        this.location = location;

    }

 

    public Location getLocation() {

        return this.location;

    }

 

    public void setTreatmentDetails(String treatmentDetails) {

        this.treatmentDetails = treatmentDetails;

    }

 

    public String getTreatmentDetails() {

        return this.treatmentDetails;

    }

 

    public void setDateOfTreatment(String dateOfTreatment) throws IllegalArgumentException{

        Matcher match = PATTERN.matcher(dateOfTreatment);

        boolean matchFound = match.find();

 

        if (matchFound) {

            this.dateOfTreatment = dateOfTreatment;

        } else {

            throw new IllegalArgumentException("IllegalArgumentException: Not a valid format for date: " + dateOfTreatment);

        }

    }

 

    public String getDateOfTreatment() {

        return this.dateOfTreatment;

    }

}