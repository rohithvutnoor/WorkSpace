package digiBank;

import java.util.Scanner;

public class digiDriver {
 
	public static void main(String[] args) {
		
		String name, city;
		int pin, bal;
		Scanner scan = new Scanner(System.in);
		
		name = scan.nextLine();
		city = scan.nextLine();
		pin = scan.nextInt();
		bal = scan.nextInt();
		
		digiAccount digiUser1 = new digiAccount(name,city,pin,bal);
		
		//digiUser1.setCity();
		//digiUser1.setpinCode();
		
		System.out.println("Current Balance: "+digiUser1.balanceEnquiry());
		
		digiUser1.withDrawl(200);
		
		System.out.println("Pin Code: "+digiUser1.getpinCode());
		System.out.println("City: "+digiUser1.getCity());
		
		System.out.println("Bank Name: "+digiUser1.nameOfBank);
		
		scan.close();
	}
	

}
