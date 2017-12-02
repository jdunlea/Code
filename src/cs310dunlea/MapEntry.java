/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package cs310dunlea;

/**
 * Version 1.0
 * @author jeff
 */
public class MapEntry {

    private String key;                                
    private PropertyNode headNode;
    
    public MapEntry (String licNum,PropertyNode node) {
        key = licNum;
        headNode = node;
    }
   
    /**
     * This method returns a key
     *
     * @return
     */
    public String getKey() {
        return key;
    }

    /**
     * This method sets the key
     *
     * @param key
     */
    public void setKey(String key) {
        this.key = key;
    }

    /**
     * This method gets the head node
     *
     * @return
     */
    public PropertyNode getHeadNode() {
        return headNode;
    }

    /**
     * This method gets the head node
     *
     * @param headNode
     */
    public void setHeadNode(PropertyNode headNode) {
        this.headNode = headNode;
    }
    
    
   
}