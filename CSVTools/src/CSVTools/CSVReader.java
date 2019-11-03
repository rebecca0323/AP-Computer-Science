/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package CSVTools;
import java.io.*;
import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author speroa
 */
public class CSVReader {
    private static ArrayList<Entry> items = new ArrayList<Entry>(); 
    private static String aEntry;
    private static String arraySizeString;
    private static String[] entryList = new String[500];
    private static int arraySize;
    private static int index = 0;
    private static int fill = 0;
    
    public static void csvRead(String fileName){
            BufferedReader fileReader = null;
        try{
            String line;
            fileReader = new BufferedReader(new FileReader(fileName));
            fileReader.readLine(); //skips the line that has all the column headings          
      
            //read the file line by line
            while((line = fileReader.readLine()) != null){
                String[] tokens = line.split(",");//get all tokens available in line 
                if (tokens.length > 0 && index < 500){               
                    Entry newEntry = new Entry(Integer.parseInt(tokens[0]), tokens[1], tokens[2]);
                    aEntry = newEntry.toString();
                    entryList[index] = aEntry;
                    items.add(newEntry);
                    index++; 
                } 
            } 
           
        }
        catch(Exception e){
            System.out.println("error");
            e.printStackTrace();
        }

    }  
    
    //sorts the entry array list
    public static void printArray() {
    	Sorts.insertionSort(items);
    	CSVWriter.overwrite("sorted.csv", items); //writes the sorted array list into new file called sorted
    }
    
    
    
   
    
    
}
