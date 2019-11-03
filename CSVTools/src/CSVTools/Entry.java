package CSVTools;

/**
 *
 * @author speroa
 */
//Set,Card Name,Color,Artist,Rareity,Kind,N Own,F Own,N Want,F Want,N Ex,F Ex,CIN
public class Entry {
    private int number;
	private String strNumber;
    private String data1;
    private String data2; 
    
  
    public Entry(int number, String data1, String data2){
        this.number = number;
        this.data1 = data1;
        this.data2 = data2; 
		this.strNumber = String.valueOf(number);
     
    }
    
	//formats entries with spacing to display nicely  
    public String toString(){
        if (strNumber != null){
              while(strNumber.length() < 6){
                strNumber = strNumber + " "; 
              } 
              while(data1.length() < 40){
                data1 = data1 + " "; 
              } 
              while(data2.length() < 40){
                data2 = data2 + " "; 
              }   
        }   
        return number + data1 + data2;    
    }
    
	//makes the entries into strings sutibale to be written to the csv file 
    public String toCSVString(){
        return number + "," + data1 + "," + data2;
    }
    
    public int getNumber(){
        return number;
    }

}