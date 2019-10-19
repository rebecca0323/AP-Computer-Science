//Made by Rebecca Zhu 9/6/19
//Program made as Driver for my Fall Project

package outfit;

public class Theme {
	private String shirt;
	private String bottoms;
	private String hats;
	private String shoes;
	
	//Constructor to make outfit objects
	public Theme(String s, String b, String h, String o) {
		shirt = s;
		bottoms = b;
		hats = h;
		shoes = o;
	}
	
	public String getShirt() {
		return shirt;
	}
	
	public String getBottoms() {
		return bottoms;
	}
	
	public String getHats() {
		return hats;
	}
	
	public String getShoes() {
		return shoes;
	}
}
