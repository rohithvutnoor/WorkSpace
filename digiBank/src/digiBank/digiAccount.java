package digiBank;
import digiBank.digiProfile;
public class digiAccount extends digiProfile implements state{
	
	private static int id = 0;
	private int balance;
	
	public digiAccount(String name, String city, int bal, int pin) {
		super(name, city, pin);
		//this.pinCode
		this.balance = bal;
		this.account_id = id+1;
	}
	
	protected int balanceEnquiry() {
			return balance;
	}
	
	protected void  withDrawl(int amount) {
		
		if(this.balance>=amount) {
			this.balance -= amount;
			System.out.println("Withdrawl Amount: "+amount+" Final Balance: "+this.balance);
			System.out.println("\nThankyou visit Again");
		}else {
			System.out.println("You donot have enough balance for withdrawl");
			return;
		}
	}
	//Interface Implement
	public void showState() {
		System.out.println("Hello");
	}
	


}
