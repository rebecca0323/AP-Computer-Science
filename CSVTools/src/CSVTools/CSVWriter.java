/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package CSVTools;

import java.io.*;
import java.util.*;

/**
 *
 * @author speroa
 */
public class CSVWriter {     
    //CSV file header 
    private static final String fileHeader = "insert headers here";
    private static boolean newFile = false;
    
	//creates a new entry from user input
    public static void csvWrite(String fileName){
        
        try{
            //set up file and entry to be written
            File file = new File(fileName);
            // calls inputEntry to create a new card from user inputs 
            Entry newEntry = inputEntry();  
            //used the toCSVString method in Card to make a string sutable for adding to the csv 
            String newEntryContent = newEntry.toCSVString();

            //checks if a file with that name exists  
            if(!file.exists()){ 
                //creates teh file if it does not already exist 
                file.createNewFile();
                //on true this will be used to add the header 
                newFile = true;  
            }
            //make a new filewriter object
            FileWriter fW = new FileWriter(file,true);
            //make a bufferdwriter since it will be faster for these transactions
            BufferedWriter bW = new BufferedWriter(fW);
            //check if the file was just created
            if(newFile == true){
                //if it was add the file header
                bW.write(fileHeader);
                //set newfile to false so the header does not get added each line
                newFile = false;
            }
            //writed a new line 
            bW.write(System.getProperty("line.separator"));
            //writed teh contents of the new card 
            bW.write(newEntryContent);
            //closes the file 
            bW.close();
            //message to the user letting them know everythign worked 
            System.out.println("operation successfull file saved");   
        }
        //catches an exception and prints the stack 
        catch(IOException e){
            System.out.println("IO Exception has occurred");
            e.printStackTrace();
        }
    }
    
	//makes new file based on sorted array list
    public static void overwrite(String fileName, ArrayList<Entry> e){
        
        try{
            //set up file and entry to be written
            File file = new File(fileName);
            
            //checks if a file with that name exists  
            if(!file.exists()){ 
                //creates teh file if it does not already exist 
                file.createNewFile();
                //on true this will be used to add the header 
                newFile = true;  
            }
            
            //loops through each entry item in the array list
        	for(int i = 0; i < e.size(); i++) {
        		String newEntryContent = e.get(i).toCSVString();
        		 FileWriter fW = new FileWriter(file,true);
                 //make a bufferdwriter since it will be faster for these transactions
                 BufferedWriter bW = new BufferedWriter(fW);
                 //check if the file was just created
                 if(newFile == true){
                     //if it was add the file header
                     bW.write(fileHeader);
                     //set newfile to false so the header does not get added each line
                     newFile = false;
                 }
                 //writed a new line 
                 bW.write(System.getProperty("line.separator"));
                 //writed teh contents of the new card 
                 bW.write(newEntryContent);
                 //closes the file 
                 bW.close();
        	}
            //message to the user letting them know everythign worked 
            System.out.println("operation successfull file saved");   
        }
        //catches an exception and prints the stack 
        catch(IOException error){
            System.out.println("IO Exception has occurred");
            error.printStackTrace();
        }
    }
    
    //users inputs for the entry object
    public static Entry inputEntry(){ 
        Scanner usrInput = new Scanner(System.in);
        
        System.out.println("Input your age:");
        int entryNumber = usrInput.nextInt();
        usrInput.nextLine();
		
        System.out.println("Input your first name:");
        String charOne = usrInput.nextLine();
        
		System.out.println("Input your last name:");
        String charTwo = usrInput.nextLine();
        
        Entry newEntry = new Entry(entryNumber, charOne, charTwo);
        
        return newEntry;    
    }
}
