import java.util.ArrayList;

public class subtractData {
	public ArrayList<String> applyAll(ArrayList<String> x, int y) {
		int intValue;
		for(int i = 0; i < x.size(); i++) {
			intValue = Integer.parseInt(x.get(i));
			intValue = intValue - y;
			x.set(i, String.valueOf(intValue));
		}
		
		return x;
	}
	
	public ArrayList<String> apply(ArrayList<String> x, int y, int index){
		
		int intValue;
		intValue = Integer.parseInt(x.get(index));
		intValue = intValue - y;
		x.set(index, String.valueOf(intValue));
		
		return x;
	}
}
