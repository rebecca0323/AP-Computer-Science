// Made by Rebecca Zhu on 10/17/19
//purpose is to make the interface that outlines the method for a lockable object

package chapter5;

public interface Lockable {
	public void setKey(int key); //method that will set a value to an object's key
	public void lock(int key); //method that will lock an object if entered key is correct
	public void unlock(int key); //method that will unlock an object if entered key is correct
	public boolean locked(); //method that will return whether an object is locked or unlocked
}
