import java.util.*;

public class hashFunction{

	//private String hashroot;
	
	public String hasher(ArrayList<String> x) {
		
		ArrayList<String> hashedArr = new ArrayList<String>();
		
		for(int i = 0; i < x.size(); i++) {
			hashedArr.add(Integer.toString(x.get(i).hashCode()));
		}
		
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
		else {
			ArrayList<String> arr1 = new ArrayList<String>();
			String concat;
			Boolean cont = true;
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
