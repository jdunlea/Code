/*This class will create the property node array, add property objects,
 * and create a hash map using the MLS number       
 */
package cs310dunlea;

import java.util.HashMap;

/**
 * Version 3.0
 * @author jeff
 */
public class PropertyLogImpl{
 
    private final int MAX_SIZE = 17;
    private MapEntry[] propertyHashMap = new MapEntry[MAX_SIZE];

    /**
     * This method initializes the array of property nodes as null
     *
     */
    public PropertyLogImpl() {
    
        
        for (int idx = 0; idx < (MAX_SIZE - 1); idx++) {

            propertyHashMap[idx] = null;

            
        }
    }    

    /**
     * This method will add a new propertyNode
     *
     * @param currProperty
     */
    public void addProperty(Property currProperty) {
 
        PropertyNode newPropNode = new PropertyNode(currProperty);
        int hashCode = currProperty.hashCode();
        hashCode = hashCode % (MAX_SIZE - 1);
        
        if (propertyHashMap[hashCode] == null) {
            
            MapEntry mapEntry = new MapEntry(currProperty.getLicenseNumber(),newPropNode);
            propertyHashMap[hashCode] = mapEntry;
        }   
        else{
            
            PropertyNode currPropNode = propertyHashMap[hashCode].getHeadNode();
            System.out.println(hashCode);                                       //debug
            
            if(currPropNode.getNextNode() !=null){ 
                    
                    currPropNode = currPropNode.getNextNode();
                    System.out.println(currPropNode.getProperty().toString());  //debug
                }
            else{
                System.out.println(newPropNode.getProperty().toString());       //debug
                currPropNode.setNextNode(newPropNode);
            }
        }    
    }
    
    /**
     * This method will find a property object based on MLS number
     *
     * @param mLSNum
     * @return
     */
    public Property findProperty(int mLSNum){
        
        Property retProp = null;
        int hash = mLSNum % (MAX_SIZE - 1);
        PropertyNode currNode = propertyHashMap[hash].getHeadNode();
        Property currProp = currNode.getProperty();
        
        if(currProp.getMLSNumber() == mLSNum){
            retProp = currProp;
        }
        else{
            currNode = currNode.getNextNode();
            
            while (currNode != null){
                
                if(currNode.getProperty().getMLSNumber() == mLSNum){ 
                    
                        retProp = currNode.getProperty();
                        break;
                }
            currNode.getNextNode();
            }
        }
        
        return retProp; 
    }
        /**
     * This method will display the data stored in the hash
     *
     */
    public void printHash() {
 
        System.out.println("Realtor Hash Table: ");
        
        for (int idx = 0;idx < (MAX_SIZE - 1);idx++) {
            
            if (propertyHashMap[idx] != null) {

                System.out.println("        Index = " + idx + " contains "
                        + "Properties " + propertyHashMap[idx].getHeadNode()
                                .getProperty().getMLSNumber());
            }
            else{
                System.out.println("        Index " + idx + " is empty");
            }
        }
    }
}
    
