// Members: Justin Siu and Austin Pitts
// Class: CSCE 314 Section 502
// Project: Merkle Trees Final Project
/* Description: This project will take two folders of files of selected data type 
 from the user and compare them. User is then able to modify arrays of values based 
 on their data type. It will then tell the user which files from the two folders do 
 not match. This application is similar to github and how it compares the files in 
 your local repository to the server repository. The files of each database will be 
 hashed and compared to each other through the use of merkle trees. When there is a 
 mismatch, the program will output which files are not the same.
*/

import java.util.Arrays;
import java.util.*;

public class Driver {

	public static void main(String[] args) {
		
		//User input 2 files
		
		ArrayList<String> arrlist = new ArrayList<String>();
		ArrayList<String> arrlist2 = new ArrayList<String>();
		
		arrlist.add("1");
		arrlist.add("2");
		arrlist.add("3");
		arrlist.add("4");
		arrlist.add("5");
		
		arrlist2.add("1");
		arrlist2.add("2");
		arrlist2.add("3");
		arrlist2.add("4");
		arrlist2.add("5");

		hashFunction y = new hashFunction();
		System.out.println(y.hasher(arrlist));
		System.out.println(y.hasher(arrlist2));

	}

}
