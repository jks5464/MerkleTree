import java.util.*;

abstract class Operations {

	public abstract ArrayList<String> applyAll(ArrayList<String> x, int y);
	
	public abstract ArrayList<String> apply(ArrayList<String> x, int y, int index);
	
	public void printContent(ArrayList<String> x) {
		for(int i = 0; i < x.size(); i++) {
			System.out.println(x.get(i));
		}
	}
}
