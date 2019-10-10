package cse360assign2;

public class AddingMachine {

	private int total;
	private String history;
	
	public AddingMachine () {
		total = 0;  // not needed - included for clarity
		
		history = "0"; // begin strong with initial value
	}
	
	public int getTotal () { //getTotal method should return the current total
		return total;
	}
	
	public void add (int value) { //add the parameter to the total variable
		
		total = total + value; //add value to total
		
		history = history + " + "+value; //record in history
		
	}
	
	public void subtract (int value) { //subtract the parameter from the total variable
		
		total = total - value; //sub value from total
		
		history = history + " - "+value; //record in history
		
	}
		
	public String toString () { //return history of transactions
		return history;
	}

	public void clear() {
	
	}
}
