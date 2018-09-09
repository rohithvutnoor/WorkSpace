package customerPack;

import java.io.Serializable;

public class customer extends Address implements Serializable{
	private int customerId;
	static int counter=0;
	String fname;
	String lname;
	
	public customer(String fname,String lname, String streetno, String street, String city, String state){
		super(streetno,street,city,state);
		this.fname = fname;
		this.lname = lname;
		this.customerId = ++counter;
	}
}
