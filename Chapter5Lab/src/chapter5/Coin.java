//Made by Rebecca Zhu on 10/17/19

package chapter5;

//represents a coin with two sides that can be flipped
public class Coin implements Lockable{
	private final int HEADS = 0;
	private final int TAILS = 1;
	
	private int face;
	private int key;
	private boolean locked;
	
	//sets up the coin by flipping it initially
	public Coin() {
		flip();
		locked = false;
	}
	
	//flips the coin by random but only runs if the coin is unlocked
	public void flip() {
		if(locked == false)
			face = (int) (Math.random()*2);
	}
	
	//returns true if the current face of the coin is heads but only runs if the coin is unlocked
	@SuppressWarnings("null")
	public boolean isHeads() {
		if(locked == false)
			return (face == HEADS);
		else
			return (Boolean) null;
	}
	
	//returns the current face of the coin as a String but only runs if the coin is unlocked
	public String toString() {
		if(locked == false) {
			String faceName;
			if(face == HEADS)
				faceName = "HEADS";
			else
				faceName = "TAILS";
			return faceName;
		}
		else
			return "";
	}
	
	// uses the setKey method from the lockable interface and sets the coin's key as the given parameter
	@Override
	public void setKey(int key) {
		this.key = key;
		
	}

	//uses the lock method from the lockable interface and locks coin if the entered key is correct
	@Override
	public void lock(int key) {
		if(key == this.key)
			locked = true;
		else
			locked = false;
		
	}

	//uses the unlock method from the lockable interface and unlocks the coin if the entered key is correct
	@Override
	public void unlock(int key) {
		if(key == this.key)
			locked = false;
		else
			locked = true;
		
	}

	//uses the locked method from the lockable interface and checks if the coin is unlocked or locked
	@Override
	public boolean locked() {
		return locked;
	}
}
