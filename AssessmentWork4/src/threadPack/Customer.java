package threadPack;

import java.util.ArrayList;
import java.util.Collections;

public class Customer extends Thread implements Comparable<Customer> {
	int id;
	String name, address;
	Customer() {
	}
	Customer(int i, String s, String addr) {
		this.id = i;
		this.name = s;
		this.address = addr;
	}

	@Override
	public int compareTo(Customer o) {
		if (id > o.id)
			return 1;
		else if (id == o.id)
			return 0;
		else
			return -1;
	}

	public void run() {
		System.out.println("Thread Created");
		Customer 	c1 = new Customer(1, "rohith", "Hyderabad"), 
					c2 = new Customer(5, "prakash", "Amaravati"),
					c3 = new Customer(2, "nitin", "Mumbai"), 
					c4 = new Customer(3, "shiva", "Delhi"),
					c5 = new Customer(4, "bro", "Hyderabad");

		ArrayList<Customer> l = new ArrayList<Customer>();

		l.add(c1); l.add(c2); l.add(c3); l.add(c4); l.add(c5);
		
		Collections.sort(l);
		
		for (Customer c : l) {
			System.out.println("Id: " + c.id + " Name: " + c.name + " City: " + c.address);
		}
	}

	public static void main(String[] args) {
		Customer c = new Customer();
		Thread t1 = new Thread(c);
		t1.start();
	}
}
