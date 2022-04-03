/*
 * three int instance variables: pounds, shillings and pence.
a no argument constructor (i.e., Purse()) that initializes the instance variables to 0.
a mutator  method void addPounds(int poundsToAdd)
a mutator  method void addShillings(int shillingsToAdd)  You may assume shillingsToAdd is less than 20.  Note that if addShillings increases the number of shillings to 20 or more, the pounds value should be increased until shillings is less than 20.
a mutator  method void addPence(int penceToAdd)  You may assume penceToAdd is less than 12.  Note that if addPence increases the number of pence to 12 or more, the shillings value should be increased until pence is less than 12.
an accessor method int getPounds() that returns the number of pounds in the purse
an  accessor  method int getShillings() that returns the number of shillings (<20) in the purse.
an  accessor  method int getPence() that returns the number of pence (<12) in the purse.  
a mutator method void spend(int poundsToRemove, int shillingsToRemove, int penceToRemove) that removes the specified amount of money from the purse.  You may assume the purse has sufficient total funds to cover the withdrawal, though you may have to break a pound into shillings, or a shilling into pence.
an accessor method String toString() that returns a String representation of the purse (such as "pounds 3, shillings 10, pence 5")
 */
public class Purse {

	private int pounds, shillings, pence;
	
	// Purse(){} is not needed, java automatically creates this. 
	Purse(){
		
	}
	
	public void addPounds(int poundsToAdd) {
		
		pounds += poundsToAdd;
	}
	
	public void addShillings(int shillingsToAdd) {
		if(shillingsToAdd >= 20) {
			pounds++;
			shillings -= shillingsToAdd;
		}
		shillings += shillingsToAdd;
	}
	
	public void addPence(int penceToAdd) {
		
		pence += penceToAdd;
	}
	
	public int getPounds() {
		return pounds;
	}
	
	public int getShillings() {
		return shillings;
	}
	
	public int getPence() {
		return pence;	
	}
	
	public void spend(int poundsToRemove, int shillingsToRemove, int penceToRemove) {
		
	}
	
	public String toString() {
		return "Pounds: " + pounds + " Shillings: " + shillings + " Pence: " + pence;
	}
}
