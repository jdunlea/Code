/*Realtor.java will create a realtor object for the main class
 */
package cs310dunlea;

import java.util.Objects;

/**
 * Version 5.0
 * @author Jeff Dunlea
 */
public class Realtor {
    
    private String licenseNumber;
    private String firstName;
    private String lastName;
    private String phoneNumber;
    private double commissionPercentage;
    
    public Realtor(){}
    
    /**
    * Constructor for the new realtor object
    * 
    * @param commissionPercentageInput - commission amount from realtor
    */
    public Realtor (Realtor realtor, String [] dataLine){
            
            double commissionPercentageInput = Double.parseDouble(dataLine[6]);
            
            this.licenseNumber = dataLine[2];
            this.firstName = dataLine[3];
            this.lastName = dataLine[4];
            this.phoneNumber = dataLine[5];
            this.commissionPercentage = commissionPercentageInput;
    }

    /**
     *@return licenseNumber returns the license number for the realtor object
     */
    public String getLicenseNumber() {
        
        return licenseNumber;
    }

    /**
     * @param licenseNumber License number for the realtor
     */    
    public void setLicenseNumber(String licenseNumber) {
        
        this.licenseNumber = licenseNumber;
    }

    /**
     *@return firstName returns the first name for the realtor object
     */
    public String getFirstName() {
        
        return firstName;
    }

    /**
     * @param firstName first name of the realtor
     */     
    public void setFirstName(String firstName) {
        
        this.firstName = firstName;
    }

    /**
     *@return lastName returns the last name for the realtor object
     */    
    public String getLastName() {
        
        return lastName;
    }

    /**
     * @param lastName last name of the realtor
     */    
    public void setLastName(String lastName) {
        
        this.lastName = lastName;
    }
    /**
     *@return phoneNumber returns the phone number for the realtor object
     */
    public String getPhoneNumber() {
        
        return phoneNumber;
    }

    /**
     * @param phoneNumber phone number for the realtor
     */    
    public void setPhoneNumber(String phoneNumber) {
        
        this.phoneNumber = phoneNumber;
    }

    /**
     *@return commissionPercentage returns the commission for the realtor object
     */    
    public double getCommissionPercentage() {
        
        return commissionPercentage;
    }

    /**
     * @param commissionPercentage commission the realtor received
     */
    public void setCommissionPercentage(double commissionPercentage) {
        
        this.commissionPercentage = commissionPercentage;
    }
    
    /**
     * This equals() will compares all the realtor attribute values
     */
    @Override
    public boolean equals(Object obj) {
        
        if (this == obj) {
            return true;
        }
        if (obj == null) {
            return false;
        }
        if (getClass() != obj.getClass()) {
            return false;
        }
        final Realtor other = (Realtor) obj;
        
        if (Double.doubleToLongBits(this.commissionPercentage) != 
                Double.doubleToLongBits(other.commissionPercentage)) {
            return false;
        }
        if (!Objects.equals(this.licenseNumber, other.licenseNumber)) {
            return false;
        }
        if (!Objects.equals(this.firstName, other.firstName)) {
            return false;
        }
        if (!Objects.equals(this.lastName, other.lastName)) {
            return false;
        }
        if (!Objects.equals(this.phoneNumber, other.phoneNumber)) {
            return false;
        }
        return true;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        
        for ( char c : this.licenseNumber.toCharArray() ){ 
            
            int inc = (int)c;
            hash = hash + inc;
        }
        return hash;
    }
    /**
     * This toString converts all the attributes to a new string
     */
    @Override
    public String toString() {
        
        return "Realtor{" + "licenseNumber= " + licenseNumber + ", firstName= " +
                firstName + ", lastName= " + lastName + ", phoneNumber= " + 
                phoneNumber + ", commissionPercentage= " + commissionPercentage 
                + '}';
    }
}


