import java.util.*;

public class data implements Comparable<data> {

	private String value;
	
	public data(String x) {
		value = x;
	}
	
	public String getValue() {
		return value;
	}
	
	public void setValue(String x) {
		value = x;
	}
	
	public int compareTo(data x) {
		return this.getValue().compareTo(x.getValue());
	}
}
