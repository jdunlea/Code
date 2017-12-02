/*This class will pull realtor and property data from both arrays, and sort by
 * license number
 */
package cs310dunlea;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.PrintWriter;
import java.util.Scanner;


/**
 * Version 2.0
 * @author jeff
 */
public class PrintImpl {
    
    /**
     *
     * @param realtorLogImpl
     */
    public static void generateReport(RealtorLogImpl realtorLogImpl, 
            PropertyLogImpl propertyLogImpl){
        
        final String INPUT_FILENAME = "input/realtorRequest.txt";
        final String OUTPUT_FILENAME = "output/assn5salesReport.txt";
        File inFile = new File(INPUT_FILENAME);
        Scanner fileScanner = null;
        File outFile = new File(OUTPUT_FILENAME); 
        int idx = 0;
        
        try{fileScanner = new Scanner(inFile);
        
        try (PrintWriter reportFile = new PrintWriter(outFile)) {
        
            while (fileScanner.hasNextLine()){
        
                String inputLine = fileScanner.nextLine();
                String [] dataLine = inputLine.split(" ");
                String licNum = dataLine [0];
                Realtor currRealtor = realtorLogImpl.realtorFound(licNum);
                if(currRealtor == null){
                    reportFile.println("Realtor " + licNum + 
                            "does not exist ");
                }
                else{
                    reportFile.println("Realtor " + currRealtor.getLicenseNumber() +
                            ", " + currRealtor.getFirstName() + " " + currRealtor
                                    .getLastName());
                }
                    for(idx = 1; idx < dataLine.length; idx++){
                    
                        int mLSNum = Integer.parseInt(dataLine[idx]);
                        Property currProperty = propertyLogImpl.findProperty(mLSNum);
                    
                        if(currProperty != null){
                            if(currProperty.isSold())
                                reportFile.println("       Property " + currProperty
                                    .getMLSNumber() + " is SOLD");
                            else{
                                reportFile.println("       Property " + currProperty
                                    .getMLSNumber() + " is available for $ " + 
                                    currProperty.getAskingPrice());
                            }
                        }    
                    }
            }
        reportFile.close();
        System.out.println("Report is located in file: "
                + "output/assn5salesreport.txt");
        }
        
        catch (FileNotFoundException e){
            System.err.println("File not found exception for file " + 
                    INPUT_FILENAME + " " + e);
            System.exit(1);
        }
        } catch (FileNotFoundException ex) {
            System.err.println("File not found exception for file " + 
                    OUTPUT_FILENAME + " " + ex);
            System.exit(1);
        }
    }    
}


