import java.util.*;

public class hashFunction{
	
	//compare two hashcodes
	public static Boolean compare(String A, String B) {
		if(A.equals(B)) {
			return true;
		}
		else {
			return false;
		}
	}
	
	//Uses a merkle tree to get root hash of an array
	public static String hasher(ArrayList<String> x) {
		
		ArrayList<String> hashedArr = new ArrayList<String>();
		
		//hashes each element of the arraylist
		for(int i = 0; i < x.size(); i++) {
			hashedArr.add(Integer.toString(x.get(i).hashCode()));
		}
		
		// Merkle Tree
		// Concatenates every two hashes and hashes that together
		// This is done until we obtain the root hash in the merkle tree
		//if the amount of nodes is positive
		if(hashedArr.size()%2 == 0) {
			ArrayList<String> arr1 = new ArrayList<String>();
			String concat;
			Boolean cont = true;
			while(cont) {
				while(hashedArr.size() > 1) {
					
					concat = hashedArr.get(0) + hashedArr.get(1);
					arr1.add(Integer.toString(concat.hashCode()));
					hashedArr.remove(0);
					hashedArr.remove(0);
				}
				if(arr1.size() < 1) {
					cont = false;
				}
				else {
					for(int i = 0; i < arr1.size(); i++) {
						hashedArr.add(arr1.get(i));
					}
				}
				arr1.clear();
			}		
			return hashedArr.get(0);
		}
		//if the amount of nodes is negative
		else {
			ArrayList<String> arr1 = new ArrayList<String>();
			String concat;
			Boolean cont = true;
			//takes the last node out and implements it back in at the end hash of the merkle tree
			String last = hashedArr.get(hashedArr.size()-1);
			hashedArr.remove(hashedArr.size()-1);
			while(cont) {
				while(hashedArr.size() > 1) {
					
					concat = hashedArr.get(0) + hashedArr.get(1);
					arr1.add(Integer.toString(concat.hashCode()));
					hashedArr.remove(0);
					hashedArr.remove(0);
				}
				
				if(arr1.size() < 1) {
					cont = false;
				}
				else {
					for(int i = 0; i < arr1.size(); i++) {
						hashedArr.add(arr1.get(i));
					}
				}
				arr1.clear();
			}
			concat = hashedArr.get(0) + last;
			
			return Integer.toString(concat.hashCode());
		}
	}
	
	
}
