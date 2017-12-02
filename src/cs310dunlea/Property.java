/*Property.java will create a property object for the main class
 */
package cs310dunlea;

import java.util.Objects;

/**
 * Version 5.0
 * @author Jeff Dunlea
 */
public class Property {
    
    private int mLSNumber;
    private String licenseNumber;
    private String streetAddress;
    private String propertyCity;
    private String propertyState;
    private int zipCode;
    private double numOfBedrooms;
    private double numOfBathrooms;
    private boolean sold;
    private double askingPrice;
    
    /**
     * This empty constructor allows for the creation of a Property object with
     * out all the data
     */
     public Property() {}

    /**
     *This constructor creates a Property object with all the data available
     * 
     * @param Property property
     * @param String [] data line
     */
    public Property (Property property, String [] dataLine){
        
        int mLSNumberInput = Integer.parseInt(dataLine[2]);
        int zipCodeInput = Integer.parseInt(dataLine[7]);
        int numOfBedroomsInput = Integer.parseInt(dataLine[8]);
        double numOfBathroomsInput = Double.parseDouble(dataLine[9]);
        double askingPriceInput = Integer.parseInt(dataLine[11]); 
        
        this.mLSNumber = mLSNumberInput;
        this.licenseNumber = dataLine[3];
        this.streetAddress = dataLine[4];
        this.propertyCity = dataLine[5];
        this.propertyState = dataLine[6];
        this.zipCode = zipCodeInput;
        this.numOfBedrooms = numOfBedroomsInput;
        this.numOfBathrooms = numOfBathroomsInput;
        if(dataLine[10].equals("Y")){
       
            this.sold = true;    
        }
        else{
            this.sold = false;
        }
        this.askingPrice = askingPriceInput;
    }

    /**
     * Gets MLS number of the property
     * 
     * @return mLSNumber
     */
    public int getMLSNumber() {
        
        return mLSNumber;
    }

    /**
     *Sets MLS Number for the property
     * 
     * @param mLSNumber
     */
    public void setMLSNumber(int mLSNumber) {
        
        this.mLSNumber = mLSNumber;
    }

    /**
     * Gets License Number of the attached Realtor
     * 
     * @return licenseNumber
     */
    public String getLicenseNumber() {
        
        return licenseNumber;
    }

    /**
     * Sets License Number of attached Realtor
     * 
     * @param licenseNumber
     */
    public void setLicenseNumber(String licenseNumber) {
        
        this.licenseNumber = licenseNumber;
    }

    /**
     *Gets Street Address of the property
     * 
     * @return streedAddress
     */
    public String getStreetAddress() {
        
        return streetAddress;
    }

    /**
     *Sets Street Address of the property
     * 
     * @param streetAddress
     */
    public void setStreetAddress(String streetAddress) {
        
        this.streetAddress = streetAddress;
    }

    /**
     *Gets the city where the property is located
     * 
     * @return propertyCity
     */
    public String getPropertyCity() {
        
        return propertyCity;
    }

    /**
     * Sets the city where the property is located
     *
     * @param propertyCity
     */
    public void setPropertyCity(String propertyCity) {
        
        this.propertyCity = propertyCity;
    }

    /**
     * Gets the state where the property is located
     *
     * @return propertyState
     */
    public String getPropertyState() {
        
        return propertyState;
    }

    /**
     * Sets the state where the property is located
     *
     * @param propertyState
     */
    public void setPropertyState(String propertyState) {
        
        this.propertyState = propertyState;
    }

    /**
     * Gets the zip code of the property
     *
     * @return zipCode
     */
    public int getZipCode() {
        
        return zipCode;
    }

    /**
     * Sets the zip code of the property
     *
     * @param zipCode
     */
    public void setZipCode(int zipCode) {
        
        this.zipCode = zipCode;
    }

    /**
     * Gets the number of bedrooms in the property
     *
     * @return numOfBedrooms
     */
    public double getNumOfBedrooms() {
        
        return numOfBedrooms;
    }

    /**
     * Sets the number of properties in the property
     *
     * @param numOfBedrooms
     */
    public void setNumOfBedrooms(double numOfBedrooms) {
        
        this.numOfBedrooms = numOfBedrooms;
    }

    /**
     * Gets the number of bathrooms in the property
     *
     * @return numOfBathrooms
     */
    public double getNumOfBathrooms() {
        
        return numOfBathrooms;
    }

    /**
     * Sets the number of bathrooms in the property
     *
     * @param numOfBathrooms
     */
    public void setNumOfBathrooms(double numOfBathrooms) {
        
        this.numOfBathrooms = numOfBathrooms;
    }

    /**
     * Returns if the property has been sold
     *
     * @return sold
     */
    public boolean isSold() {
        
        return sold;
    }

    /**
     * Sets if the property has been sold
     *
     * @param sold
     */
    public void setSold(boolean sold) {
        
        this.sold = sold;
    }

    /**
     * Gets the asking price of the property
     *
     * @return askingPrice
     */
    public double getAskingPrice() {
        
        return askingPrice;
    }

    /**
     * Sets the property asking price
     *
     * @param askingPrice
     */
    public void setAskingPrice(double askingPrice) {
        
        this.askingPrice = askingPrice;
    }
    /**
     * This method will compare the property objects
     * 
     * @param Object property
     * @return true or false depending on the input
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
        final Property other = (Property) obj;
        if (this.mLSNumber != other.mLSNumber) {
            return false;
        }
        if (Double.doubleToLongBits(this.numOfBedrooms) != 
                Double.doubleToLongBits(other.numOfBedrooms)) {
            return false;
        }
        if (Double.doubleToLongBits(this.numOfBathrooms) != 
                Double.doubleToLongBits(other.numOfBathrooms)) {
            return false;
        }
        if (this.sold != other.sold) {
            return false;
        }
        if (Double.doubleToLongBits(this.askingPrice) != 
                Double.doubleToLongBits(other.askingPrice)) {
            return false;
        }
        if (!Objects.equals(this.licenseNumber, other.licenseNumber)) {
            return false;
        }
        if (!Objects.equals(this.streetAddress, other.streetAddress)) {
            return false;
        }
        if (!Objects.equals(this.propertyCity, other.propertyCity)) {
            return false;
        }
        if (!Objects.equals(this.propertyState, other.propertyState)) {
            return false;
        }
        return true;
    }
    @Override
    public int hashCode(){
        
        int hash = 0;
        
        hash = this.mLSNumber;
        
        return hash;
    }
    /**
     * This method will display the property characteristics
     */
    @Override
    public String toString() {
        return "Property{" + "mLSNumber= " + mLSNumber + ", licenseNumber= " + 
                licenseNumber + ", streetAddress= " + streetAddress + 
                ", propertyCity= " + propertyCity + ", propertyState= " + 
                propertyState + ", zipCode= " + zipCode + ", numOfBedrooms= " + 
                numOfBedrooms + ", numOfBathrooms= " + numOfBathrooms + ", sold= "
                + sold + ", askingPrice= " + askingPrice + '}';
    }
}
