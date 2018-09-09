package dbsSample;

import java.util.Scanner;

//import java.util.Scanner;

public class assessmentCalculator {
	int add(int val1, int val2) {
		return val1 + val2;
	}

	int subtract(int val1, int val2) {
		return val1 - val2;
	}

	int division(int val1, int val2) {
		int c = 0;
		try {
			//if (val2 == 0) {
			c= val1 / val2;
			return c;
			//} else {
			//	throw new ArithmeticException();
			//}
		} catch (ArithmeticException ae) {
			System.out.println("Please enter a valid denominator Thankyou");
			return -1;
		} catch (Exception e) {
			System.out.println("Caught Exception while Calculating Division");
			return -1;
		}
		
	//	return c;
	}

	int multiply(int val1, int val2) {
		return val1 * val2;
	}

	double add(double val1, double val2) {
		return val1 + val2;
	}

	double subtract(double val1, double val2) {
		return val1 - val2;
	}

	double division(double val1, double val2) {
		double c=0.0;
		try {
			//if (val2 == 0) {
				c = val1 / val2;
				return c;
			//} else {
			//	throw new ArithmeticException();
			//}
		} catch (ArithmeticException ae) {
			System.out.println("Please enter a valid denominator Thankyou"+ae);
			return -1;
		} catch (Exception e) {
			System.out.println("Caught Exception while Calculating Division"+e);
			return -1;
		}

		//return -1;
	}

	double multiply(double val1, double val2) {
		return val1 * val2;
	}

	public static void main(String[] args)throws Exception  {
		/*
		 * String s1="hia"; String s2="hia"; int a=10; int b=10;
		 * System.out.println(s1.equals(s2));
		 * System.out.println(s1.hashCode()+"\n"+s2.hashCode());
		 * 
		 * //System.out.println(s1.equals(s2)); System.out.println(new
		 * Integer(a).hashCode()+"\n"+new Integer(b).hashCode());
		 */

		assessmentCalculator calculate = new assessmentCalculator();

		double val1 = 0.0, val2 = 0.0;

		@SuppressWarnings("resource")
		Scanner scan = new Scanner(System.in);

		while (true) {
			System.out.println("Enter two values: ");

			val1 = scan.nextDouble();
			// String s = ;
			val2 = scan.nextDouble();
			int option = 0;

			System.out.println("1. Addition  2. Subtraction 3.Division 4. Multiplication \n");
			option = scan.nextInt();
			switch (option) {
			case 1: {
				if (!(new Double(val1).toString()).contains("."))
					System.out.println("Addition Result: " + calculate.add((int) val1, (int) val2));
				else
					System.out.println("Addition Result: " + calculate.add(val1, val2));
				break;
			}
			case 2: {
				if (!(new Double(val1).toString()).contains("."))
					System.out.println("Subtraction Result: " + calculate.subtract((int) val1, (int) val2));
				else
					System.out.println("Subtraction Result: " + calculate.subtract(val1, val2));
				break;
			}
			case 3: {
				if (!(new Double(val1).toString()).contains(".")) {
					int x = calculate.division((int) val1, (int) val2);
					if(x==-1) 
						System.out.println("Please enter a valid denominator Thankyou");
					else
						System.out.println("Division Result: " + x);

				} else {
					double x = calculate.division(val1, val2);
					if(x==-1) 
						System.out.println("Please enter a valid denominator Thankyou");
					else
						System.out.println("Division Result: " + x);
				}
				break;
			}
			case 4: {
				if (!(new Double(val1).toString()).contains("."))
					System.out.println("Multiply Result: " + calculate.multiply((int) val1, (int) val2));
				else
					System.out.println("Multiply Result: " + calculate.multiply(val1, val2));
				break;
			}
			default: {
				System.out.println("ThankYou");
			}
			}
			
		}
	}//scan.close();
}
