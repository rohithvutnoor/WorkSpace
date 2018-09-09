package com;

public class Drugs {
	
	int id ;
	
	String name , quantity;
	
	public Drugs(String name , String quantity) {
		
		this.name = name;
		this.quantity = quantity;
		
		
	}
	
	public Drugs() {
		
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getQuantity() {
		return quantity;
	}

	public void setQuantity(String quantity) {
		this.quantity = quantity;
	}
	
	

}
