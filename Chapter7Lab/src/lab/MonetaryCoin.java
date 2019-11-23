//made by rebecca zhu 11/20
//purpose is for subclass of the superclass coin

package lab;

public class MonetaryCoin extends Coin{ //inherited from coin super class
	private double value; //instance variable that only monetary coin has, not coin
	
	//constructor for the monetary coin
	public MonetaryCoin(double value) {
		super(); //calls the constructor from the coin class
		this.value = value; //sets the value to the parameter
	}
	
	//returns the value
	public double getValue() {
		return value;
	}

}