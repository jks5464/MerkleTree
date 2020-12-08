import java.util.*;

abstract class Operations { //abstraction
	//abstract function
	//allows us to do an operation on the entire array
	public abstract ArrayList<String> applyAll(ArrayList<String> x, int y);
	//abstract function
	//allows us to do specific operation on a specific element in the arraylist
	public abstract ArrayList<String> apply(ArrayList<String> x, int y, int index);
	
	//inheritance
	//print the given array
	public void printContent(ArrayList<String> x) {
		for(int i = 0; i < x.size(); i++) {
			System.out.println(x.get(i));
		}
	}
}
