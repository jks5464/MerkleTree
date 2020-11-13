// Parent for type of data the user is dealing with
abstract class dataType {

	private int key; //hash key
	private int values[]; //array of values from input file
	
	public abstract void getValue(int x); //returns value at index x
	public void printValue() { //print the array
		
	}
	
	public int hashing() { //convert array values to hash values and return key value
		
		return 0;
	}
	
	public int getkey() { //return key value
		return key;
	}
	
}
