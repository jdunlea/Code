/*PropertyNode.java This node class creates the node objects to be stored in the 
 * linked list
 */
package cs310dunlea;

/**
 * Version 1.0
 *
 * @author jeff
 */
public class PropertyNode {
    
    private Property property;
    private PropertyNode nextNode;

    /**
     * This is the constructor for the property list
     *
     * @param property
     */
    public PropertyNode(Property property) {
        this.property = property;
        this.nextNode = null;
    }

    /**
     * This method returns property attributes
     *
     * @return property
     */
    public Property getProperty() {
        return property;
    }

    /**
     * This method sets the property object
     *
     * @param property
     */
    public void setProperty(Property property) {
        this.property = property;
    }

    /**
     * This method will return the next node in the list
     *
     * @return nextNode
     */
    public PropertyNode getNextNode() {
        return nextNode;
    }

    /**
     * This method will set the next node in the list
     *
     * @param nextNode
     */
    public void setNextNode(PropertyNode nextNode) {
        this.nextNode = nextNode;
    }
    
}
