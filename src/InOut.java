import java.io.*;
import java.util.*;

public class InOut {
	
	public ArrayList<String> readData(String filename) {
		try {
			ArrayList<String> arrData = new ArrayList<String>();
		    File myObj = new File(filename);
		    Scanner myReader = new Scanner(myObj);
		    while (myReader.hasNextLine()) {
		        String data = myReader.nextLine();
		        //System.out.println(data);
		        arrData.add(data);
		    }
		    myReader.close();
		    return arrData;
		} 
		catch (FileNotFoundException e) {
		    System.out.println("An error occurred.");
		    e.printStackTrace();
		    return null;
		}
	}
	
	public void writeData(String filename, ArrayList<String> x) {
		try {
			  FileWriter myWriter = new FileWriter(filename);
			  for(int i = 0; i < x.size(); i++) {
				  myWriter.write(x.get(i));
			  }
			  myWriter.close();
		  //System.out.println("Successfully wrote to the file.");
		} catch (IOException e) {
			  System.out.println("An error occurred.");
		      e.printStackTrace();
		}
	}
}
