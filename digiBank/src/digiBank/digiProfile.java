package digiBank;

public class digiProfile extends digiBank{
	
	private int pinCode;
	private String city = null;
	
	digiProfile(String name, String cityName, int pin){
		super(name);
		this.city = cityName;
		this.pinCode = pin;
	}
	
/*	private void setCity(String cityName) {
		this.city = cityName;
	}
	private void setpinCode(int pin) {
		this.pinCode = pin;
	}
*/
	
	protected String getCity() {
		return this.city;
	}
	protected int getpinCode() {
		return this.pinCode;
	}

	@Override
	public void nameOfBranch() {

			this.nameOfBranch  = "Waverock";
			System.out.println("Branch Name: "+ this.nameOfBranch);
	}
	
}
