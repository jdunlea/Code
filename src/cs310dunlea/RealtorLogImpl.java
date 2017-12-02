/*
 *This class will create the realtor array list and hash set, add realtors,  
 *and display the objects in the list
 */
package cs310dunlea;

/**
 * Version 3.0
 * @author jeff
 */
public class RealtorLogImpl {
    
    private final int MAX_SIZE;
    private int currSize;
    private Realtor[] realtorHashSet;
    
    /**
     * This constructor creates the empty array and hash set
     * 
     */
    public RealtorLogImpl(){
        
        MAX_SIZE = 23;
        
        realtorHashSet = new Realtor[MAX_SIZE];
        
        for (int idx = 0; idx < (MAX_SIZE - 1); idx++){
            realtorHashSet[idx] = null;
        }
    }
    
    /**
     * This method processes the adding of a realtor object
     *
     * @param realtor
     */
    public void addRealtor(Realtor currRealtor) {
        
        boolean found = false;
        int hashCode = currRealtor.hashCode();
        hashCode = hashCode % (MAX_SIZE - 1);
        
        while (!found) {
            if (realtorHashSet[hashCode] == null) {
                realtorHashSet[hashCode] = currRealtor;
                found = true;
                currSize++;
            }
            else {
                hashCode++;
                if (hashCode > realtorHashSet.length) {
                hashCode = 0;
                }
            }
        }
    }    

    /**
     * This method processes clearing the realtor hash set
     *
     */
    public void clearAllRealtor()
    {
        for (int i = 0; i < (MAX_SIZE - 1); i++)
            realtorHashSet[i] = null;
    }
    
    /**
     * This method will check for duplicate 
     *
     * @param currRealtor
     * @return
     */
    public Realtor realtorFound(String licNum) {
        int idx;
        Realtor retRealtor = null;
        
        for (idx = 0; idx < (MAX_SIZE - 1); idx++)
        
            if((realtorHashSet[idx] != null) &&
                    (realtorHashSet[idx].getLicenseNumber().equals(licNum))){
                
                retRealtor = realtorHashSet[idx];   
            }
        return retRealtor;
        
    }   
    /**
     * This method will check to see if the hash set is empty
     *
     * @return
     */
    public boolean isEmpty() {
        
        boolean retValue = false;
 
        if (currSize == 0) {
            retValue = true;
        }
        
        return retValue;
    }
    
    /**
     * This method will display the data stored in the hash
     *
     */
    public void printHash() {
 
        System.out.println("Realtor Hash Table: ");
        
        for (int idx = 0;idx < (MAX_SIZE - 1);idx++) {
            
            if (realtorHashSet[idx] != null) {
                
                String fullName = realtorHashSet[idx].getFirstName() + " " +
                        realtorHashSet[idx].getLastName();
                System.out.println("        Index = " + idx + " contains Realtor "
                        + realtorHashSet[idx].getLicenseNumber() + ", " + 
                        fullName);
            }
            else{
                System.out.println("        Index " + idx + " is empty");
            }
        }
    }    

}
    
