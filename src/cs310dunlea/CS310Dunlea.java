/* The main method will run the tests for both the property and realtor objects
 */
package cs310dunlea;

import java.io.*;
import java.util.Scanner;

/**
 * Version 5.0
 * @author Jeff Dunlea
 */
public class CS310Dunlea {
    final static String CLEAN_FILENAME = "output/assn4cleanreport.txt";
    static RealtorLogImpl realtorLogImpl = new RealtorLogImpl();
    static PropertyLogImpl propertyLogImpl = new PropertyLogImpl();

    /** The main method contains all the tests, creates the realtor and property
     * objects, and calls the other methods from the main class.
     * 
     * @param args 
     */
    public static void main(String[] args){

        final String INPUT_FILENAME = "input/assn4input.txt";
        processDataFile(INPUT_FILENAME);
        realtorLogImpl.printHash();
        propertyLogImpl.printHash();
        
        System.out.println();
        System.out.println("Generating report...");
        generateReport();
    }
    
    /**
     * This method analyzes a data line and adds to the realtor 
     * array if applicable
     *
     * @param realtor
     * @param dataLine
     */
    public static void newRealtorAddition(Realtor realtor, String [] dataLine){

        Realtor currRealtor = new Realtor(realtor, dataLine);
        realtorLogImpl.addRealtor(currRealtor);

    }
 
    /**
     * This method analyzes a data line and adds to the property
     * array if applicable
     *
     * @param property
     * @param dataLine
     */
    public static void newPropertyAddition(Property propertyObj, 
                String [] dataLine){
        
        Property currProperty = new Property(propertyObj, dataLine);
        propertyLogImpl.addProperty(currProperty);

    }
    /**
     *This method attempts to read the data file, and split the lines and adds
     * the strings to an array
     * 
     * @param INPUT_FILENAME
     */
    private static void processDataFile(String INPUT_FILENAME){
        
        File inFile = new File(INPUT_FILENAME);
        Scanner fileScanner = null;
        
        try{
        fileScanner = new Scanner(inFile);
        }
        catch (FileNotFoundException e){
            System.err.println("File not found exception for file " + 
                    INPUT_FILENAME + " " + e);
            System.exit(1);
        }
        System.out.println("Reading file from input file: " + INPUT_FILENAME);
        System.out.println();
        while (fileScanner.hasNextLine()){
        
            String inputLine = fileScanner.nextLine();
            String [] dataLine = inputLine.split(",");
            
            if(dataLine[0].equals("REALTOR") && 
                dataLine[1].equals("ADD")){
                
                Realtor realtorAddObj = new Realtor();
                newRealtorAddition(realtorAddObj, dataLine); 
            }
            else if( dataLine[0].equals("PROPERTY") && 
                    dataLine [1].equals("ADD")){
            
                Property propertyAddObj = new Property();
                System.out.println(propertyAddObj.toString());                  //debug
                newPropertyAddition(propertyAddObj, dataLine);                  
            }
        }
    }

    /**
     * This method generates the report file
     *
     */
    public static void generateReport(){
        
        PrintImpl.generateReport(realtorLogImpl,
                propertyLogImpl);
    }
}

