package edu.ucalgary.oop;

public class DisasterVictim {
    private String firstName;
    private String lastName;
    private String dateOfBirth;
    private String comments;

    private int ASSIGNED_SOCIAL_ID;
    private MedicalRecord[] medicalRecords;
    private FamilyRelation[] familyConnections;
    private String ENTRY_DATE;
    private Supply[] personalBelongings;
    private String gender;
    private static int counter;

    public DisasterVictim(String firstName, String ENTRY_DATE) {
        this.firstName = firstName;
        this.lastName = "";
        this.ENTRY_DATE = ENTRY_DATE;
        this.personalBelongings = new Supply[0];
        this.familyConnections = new FamilyRelation[0];
        this.ASSIGNED_SOCIAL_ID = counter;
        counter++;
        if (ENTRY_DATE.matches("\\d{4}-\\d{2}-\\d{2}")) {
            this.ENTRY_DATE = ENTRY_DATE;
        } else {
            throw new IllegalArgumentException("Entry date must be in the format YYYY-MM-DD");
        }
    }

    public String getFirstName() {
        return firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public String getDateOfBirth() {
        return dateOfBirth;
    }

    public String getComments() {
        return comments;
    }

    public int getAssignedSocialID() {
        return ASSIGNED_SOCIAL_ID;
    }

    public MedicalRecord[] getMedicalRecords() {
        return medicalRecords;
    }

    public FamilyRelation[] getFamilyConnections() {
        return familyConnections;
    }

    public Supply[] getPersonalBelongings() {
        return personalBelongings;
    }

    public String getGender() {
        return gender;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public void setDateOfBirth(String dateOfBirth) {
        if (!dateOfBirth.matches("\\d{4}-\\d{2}-\\d{2}")) {
            throw new IllegalArgumentException("Date of birth must be in the format YYYY-MM-DD");
        }
        this.dateOfBirth = dateOfBirth;
    }

    public void setComments(String comments) {
        this.comments = comments;
    }

    public void setMedicalRecords(MedicalRecord[] medicalRecords) {
        this.medicalRecords = medicalRecords;
    }

    public void setFamilyConnections(FamilyRelation[] familyConnections) {
        this.familyConnections = familyConnections;
    }

    public void setPersonalBelongings(Supply[] personalBelongings) {
        this.personalBelongings = personalBelongings;
    }

    public void setGender(String gender) {
        this.gender = gender;
    }

    public void addPersonalBelonging(Supply supply) {
        Supply[] newPersonalBelongings = new Supply[personalBelongings.length + 1];
        for (int i = 0; i < personalBelongings.length; i++) {
            newPersonalBelongings[i] = personalBelongings[i];
        }
        newPersonalBelongings[personalBelongings.length] = supply;
        personalBelongings = newPersonalBelongings;
    }

    public void removePersonalBelonging(Supply supply) {
        Supply[] newPersonalBelongings = new Supply[personalBelongings.length - 1];
        int j = 0;
        for (int i = 0; i < personalBelongings.length; i++) {
            if (personalBelongings[i] != supply) {
                newPersonalBelongings[j] = personalBelongings[i];
                j++;
            }
        }
        personalBelongings = newPersonalBelongings;
    }

    public void addFamilyConnection(FamilyRelation familyRelation) {
        FamilyRelation[] newFamilyConnections = new FamilyRelation[familyConnections.length + 1];
        for (int i = 0; i < familyConnections.length; i++) {
            newFamilyConnections[i] = familyConnections[i];
        }
        newFamilyConnections[familyConnections.length] = familyRelation;
        familyConnections = newFamilyConnections;
    }

    public void removeFamilyConnection(FamilyRelation familyRelation) {
        FamilyRelation[] newFamilyConnections = new FamilyRelation[familyConnections.length - 1];
        int j = 0;
        for (int i = 0; i < familyConnections.length; i++) {
            if (familyConnections[i] != familyRelation) {
                newFamilyConnections[j] = familyConnections[i];
                j++;
            }
        }
        familyConnections = newFamilyConnections;
    }

    public void addMedicalRecord(MedicalRecord medicalRecord) {
        MedicalRecord[] newMedicalRecords = new MedicalRecord[medicalRecords.length + 1];
        for (int i = 0; i < medicalRecords.length; i++) {
            newMedicalRecords[i] = medicalRecords[i];
        }
        newMedicalRecords[medicalRecords.length] = medicalRecord;
        medicalRecords = newMedicalRecords;
    }

    public String getEntryDate() {
        return ENTRY_DATE;
    }
}
