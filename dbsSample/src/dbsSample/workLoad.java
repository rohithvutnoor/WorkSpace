package dbsSample;

import java.util.Arrays;
//import java.util.Scanner;

public class workLoad {
	static int val = 10;
	StringBuffer name2;
	String name1;

	workLoad() {
		System.out.println("Value of static 'i' in Constructor " + val + "\n");
		val = 20;
		name2 = new StringBuffer();
	}

	workLoad(String data) {
		System.out.println("Hello from Argumented Constructor: " + data + "\n");
	}

	void greet() {
		System.out.println("Hello");
	}

	static void staticGreet() {
		System.out.println("Hello From Static");
	}

	public void setName(String immutable, StringBuffer mutable) {
		this.name1 = immutable;
		this.name2 = mutable;
	}

	public void getName() {
		System.out.println("\nBefore Change : 1." + name1 + " 2." + name2);
		name1 = "roontuV htihoR";
		name2.reverse();
	}

	public void finalize() {
		System.out.println("Garbage Collected");
	}
	
	public static void main(String[] args) {

		System.out.println("Hai");
/*
		workLoad workObj = new workLoad();

		// Static Function
		staticGreet();

		System.out.println("Static Variable " + val);

		workObj.greet();

		workLoad workObj2 = new workLoad("Hai");

		int l = 10;

		Integer value1 = new Integer(l); // AutoBox
		Integer value2 = new Integer(val);

		System.out.println("Integer " + value1 + "\nWrapped value " + value2);

		int k = value1.intValue();
		System.out.println("AutoUnBox Value: " + k);

		// Call By Reference & Call By Value

		StringBuffer name2 = new StringBuffer("Rohith Vutnoor");
		String name1 = "Rohith Vutnoor";

		System.out.println("\n\n\nBefore Call:  	1. " + name1 + " 2. " + name2);

		workObj2.setName(name1, name2);

		System.out.println("\nAfter Set Call: 1." + name1 + " 2. " + name2);

		workObj2.getName();

		System.out.println("\nAfter Change:   1." + name1 + " 2. " + name2);

		Scanner scan = new Scanner(System.in);

		System.out.println("\n\nPlease enter a value and a string: ");
		int i = scan.nextInt();
		String str = scan.next();

		System.out.println("\nScanned Values: " + i + " " + str);
		System.out.println("\nEnter a value 1 or 2: ");
		int a = scan.nextInt();
		switch (a) {
			case 1: {
				System.out.println("Hello Hai!!");
				break;
			}
			case 2: {
				System.out.println("Good Bye!!");
				break;
			}
			default:
				System.out.println("Done!!");
		}
		
		workLoad w3 = new workLoad();
		workLoad w4 = new workLoad();
		w3 = null;
		w4 = null;
		System.gc();
		
		
		int [] array = new int[10];
		for (int j = 0; j < array.length; j++) {
			System.out.println("Value :"+array[i]);
		}
		int [][] matrix = new int[2][2];
		for (int j1 = 0; j1 < matrix.length; j1++) {
			for (int j2 = 0; j2 < matrix.length; j2++) {
				matrix[j1][j2] = scan.nextInt();
			}
		}
		System.out.println();
		for (int j1 = 0; j1 < matrix.length; j1++) {
			for (int j2 = 0; j2 < matrix.length; j2++) {
				System.out.print(matrix[j1][j2]+" ");
			}
			System.out.println();
		}
		
		workLoad wMatrix[] = null;//= new workLoad[2];
		for (int n = 0; n < 5; n++) {
			wMatrix[n] = new workLoad();
			
		}
		
		for (workLoad workLoad : wMatrix) {
			System.out.println(workLoad);
		}*/
		
		int []arr = {1,2,3,4,5,6,7,8,9,10};
		
		int [] three = Arrays.copyOf(arr, 3);
		System.out.println(Arrays.toString(three));
		
		int [] four = Arrays.copyOfRange(arr, 3, 7);
		System.out.println(Arrays.toString(four));
	}
}