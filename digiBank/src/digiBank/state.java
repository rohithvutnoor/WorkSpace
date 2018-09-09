package digiBank;

public interface state {
	String stateName = "Telangana";
	default void showState() {
		System.out.println("State: "+stateName); 
	}
}
