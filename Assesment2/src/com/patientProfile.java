package com;

public class patientProfile {
	
	
	int id;
	
	String fname , lname , age ,phone , address;
	
	
	public patientProfile(String fname , String lname ,String age , String phone , String address) {
		
		
		this.fname = fname;
		this.lname = lname;
		this.age = age;
		this.phone = phone;
		this.address = address;
		
	}
	
	public patientProfile() {
		
		
		
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getFname() {
		return fname;
	}

	public void setFname(String fname) {
		this.fname = fname;
	}

	public String getLname() {
		return lname;
	}

	public void setLname(String lname) {
		this.lname = lname;
	}
	
	public String getAge() {
		return age;
	}
	
	public void setAge(String age) {
		
		this.age = age;
	}

	public String getPhone() {
		return phone;
	}

	public void setPhone(String phone) {
		this.phone = phone;
	}

	public String getAddress() {
		return address;
	}

	public void setAddress(String address) {
		this.address = address;
	}

	

}
