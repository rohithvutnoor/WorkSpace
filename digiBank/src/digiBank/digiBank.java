package digiBank;

//import java.util.HashSet;

public abstract class digiBank {
	
	protected int account_id;
	private String accountHolderName;
	public String nameOfBank = "Digi Bank";
	public String nameOfBranch;

	abstract void nameOfBranch();//{
		//this.nameOfBranch =  = "Waverock";
	//}
	
	digiBank(String name){
		this.setAccountHolderName(name);
		this.nameOfBank = "Digi Bank";
	}
//
	public String getAccountHolderName() {
		return accountHolderName;
	}

	public void setAccountHolderName(String accountHolderName) {
		this.accountHolderName = accountHolderName;
	}
//	
}
