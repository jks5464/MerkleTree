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

import java.util.*;

public class Driver {

	public static void main(String[] args) {
		
		//User input 2 files
		/*
		ArrayList<String> arrlist = new ArrayList<String>();
		ArrayList<String> arrlist2 = new ArrayList<String>();
		ArrayList<String> arrlist3 = new ArrayList<String>();
		ArrayList<String> arrlist4 = new ArrayList<String>();
		String rootA = "";
		String rootB = "";
		
		arrlist.add("2");
		arrlist.add("4");
		arrlist.add("6");
		arrlist.add("8");
		arrlist.add("10");
		
		arrlist2.add("1");
		arrlist2.add("2");
		arrlist2.add("3");
		arrlist2.add("4");
		arrlist2.add("5");
		
		arrlist3.add("1");
		arrlist3.add("2");
		arrlist3.add("3");
		arrlist3.add("4");
		arrlist3.add("5");
	
		arrlist4.add("1");
		arrlist4.add("2");
		arrlist4.add("3");
		arrlist4.add("4");
		arrlist4.add("5");
		
		// add operation test
		addData a = new addData();
		arrlist2 = a.applyAll(arrlist2, 2);
		rootA = hashFunction.hasher(arrlist);
		rootB = hashFunction.hasher(arrlist2);
		System.out.println(rootA);
		System.out.println(rootB);
		System.out.println(hashFunction.compare(rootA, rootB));
		
		// subtract operation test
		subtractData s = new subtractData();
		arrlist2 = s.applyAll(arrlist2, 2);
		rootA = hashFunction.hasher(arrlist);
		rootB = hashFunction.hasher(arrlist2);
		System.out.println(rootA);
		System.out.println(rootB);
		System.out.println(hashFunction.compare(rootA, rootB));
		
		// multiply operation test
		multiplyData m = new multiplyData();
		arrlist2 = m.applyAll(arrlist2, 2);
		rootA = hashFunction.hasher(arrlist);
		rootB = hashFunction.hasher(arrlist2);
		System.out.println(rootA);
		System.out.println(rootB);
		System.out.println(hashFunction.compare(rootA, rootB));
		
		// divide operation test
		divideData d = new divideData();
		arrlist = d.applyAll(arrlist, 2);
		arrlist2 = d.applyAll(arrlist2, 2);
		rootA = hashFunction.hasher(arrlist);
		rootB = hashFunction.hasher(arrlist2);
		System.out.println(rootA);
		System.out.println(rootB);
		System.out.println(hashFunction.compare(rootA, rootB));
		
		ArrayList<data> dataArray = new ArrayList<data>();
		*/
		
		//Get filenames from user input
		Scanner input = new Scanner(System.in);
		System.out.println("Please enter the first filename");
		
		String filename1 = input.nextLine();
		System.out.println("Filename 1 is = " + filename1);
		
		System.out.println("Please enter the second filename");
		String filename2 = input.nextLine();
		System.out.println("Filename 2 is = " + filename2);

		ArrayList<String> data1 = new ArrayList<String>();
		ArrayList<String> data2 = new ArrayList<String>();
		data1 = InOut.readData(filename1);
		data2 = InOut.readData(filename2);
		
		//Print content of files
		System.out.println("Content of solutions (file 1");
		for(int i = 0; i < data1.size(); i++) {
			System.out.println(data1.get(i));
		}
		
		System.out.println("Content of answer key (file 2)");
		for(int i = 0; i < data2.size(); i++) {
			System.out.println(data2.get(i));
		}
		
		Boolean cont = true;
		
		/*
		ArrayList<Object> operators = new ArrayList<Object>();
		addData a = new addData();
		subtractData s = new subtractData();
		multiplyData m = new multiplyData();
		divideData d = new divideData();
		
		operators.add(a);
		operators.add(s);
		operators.add(m);
		operators.add(d);
		*/
		
		while(cont) {
			System.out.println("Do you want to do any operations on the contents of solutions (file 1)?");
			System.out.println("(1) Add \n(2) Subtract \n(3) Multiply \n(4) Divide \n(5) Skip");
			int operationChoice = Integer.parseInt(input.nextLine());
			
			if(operationChoice == 1 || operationChoice == 2 || operationChoice == 3 || operationChoice == 4) {
				System.out.println("How do you want to do this operation?");
				System.out.println("(1) On all elements \n(2) On 1 element");
				int choice = Integer.parseInt(input.nextLine());
				System.out.println("What integer value do you want to modify the list by?");
				int modifier = Integer.parseInt(input.nextLine());
				if(choice == 1) {
					if(operationChoice == 1) {
						addData x = new addData();
						data1 = x.applyAll(data1, modifier);
					}
					else if(operationChoice == 2) {
						subtractData x = new subtractData();
						data1 = x.applyAll(data1, modifier);
					}
					else if(operationChoice == 3) {
						multiplyData x = new multiplyData();
						data1 = x.applyAll(data1, modifier);
					}
					else if(operationChoice == 4) {
						divideData x = new divideData();
						data1 = x.applyAll(data1, modifier);
					}
				}
				else if(choice == 2) {
					System.out.println("What is the index of the element you want to change (starts at 0)?");
					int index = Integer.parseInt(input.nextLine());
					if(operationChoice == 1) {
						addData x = new addData();
						data1 = x.apply(data1, modifier, index);
					}
					else if(operationChoice == 2) {
						subtractData x = new subtractData();
						data1 = x.apply(data1, modifier, index);
					}
					else if(operationChoice == 3) {
						multiplyData x = new multiplyData();
						data1 = x.apply(data1, modifier, index);
					}
					else if(operationChoice == 4) {
						divideData x = new divideData();
						data1 = x.apply(data1, modifier, index);
					}
				}
				else {
					System.out.println("invalid input");
				}
			}
			else if(operationChoice == 5) {
				cont = false;
			}
			else {
				System.out.println("invalid input");
			}
			
			System.out.println("Content of solutions (file 1)");
			for(int i = 0; i < data1.size(); i++) {
				System.out.println(data1.get(i));
			}
		}
		
		
		System.out.println("Do you want to sort the files?");
		System.out.println("(1) Sort \n(2) No Sort");
		int sorter = Integer.parseInt(input.nextLine());
		if(sorter == 1) {
			//creating collections sortable array
			ArrayList<data> sortable = new ArrayList<data>();
			for(int i = 0; i < data1.size(); i++) {
				data y = new data(data1.get(i));
				sortable.add(y);
			}
			ArrayList<data> sortable2 = new ArrayList<data>();
			for(int i = 0; i < data2.size(); i++) {
				data y = new data(data2.get(i));
				sortable2.add(y);
			}
			
			Collections.sort(sortable);
			Collections.sort(sortable2);
			
			//print content of sorted arrays and put sortable back into data arraylist
			System.out.println("Content of sorted solutions (file 1)");
			for(int i = 0; i < sortable.size(); i++) {
				System.out.println(sortable.get(i).getValue());
				data1.set(i,sortable.get(i).getValue());
			}
			
			System.out.println("Content of sorted answer key (file 2)");
			for(int i = 0; i < sortable2.size(); i++) {
				System.out.println(sortable2.get(i).getValue());
				data2.set(i,sortable2.get(i).getValue());
			}
		}
		
		//Hash and compare the two arraylists
		System.out.println("Used a merkle tree to create root hash for each arraylist");
		System.out.println("Compared the two root hashes\n");
		String rootA = "";
		String rootB = "";
		rootA = hashFunction.hasher(data1);
		rootB = hashFunction.hasher(data2);
		System.out.println("Root hash of the solutions");
		System.out.println(rootA);
		System.out.println("Root hash of the Answer Key");
		System.out.println(rootB);
		System.out.println("");
		
		if(hashFunction.compare(rootA, rootB)) {
			System.out.println("The two arrays are the same");
		}
		else {
			System.out.println("The two arrays are not the same");
		}
		
		input.close();
	}

}
