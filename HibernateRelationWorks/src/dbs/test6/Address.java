package dbs.test6;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToOne;
import javax.persistence.Table;

import org.hibernate.annotations.Cascade;

@Entity
@Table(name="address")
public class Address {
	
	@Id
	@Column(name="id")
	@GeneratedValue(strategy=GenerationType.AUTO)
	private Integer id;
	
	@Column(name="street")
	String street;
	
	@Column(name="dno")
	String dno;

	
	@OneToOne(targetEntity=Person.class,cascade=CascadeType.ALL)
	@JoinColumn(name="mine",referencedColumnName="id")
	private Person p;
	//private Person parent;
	
	public Address() {
	
	}
	
	public Address(String street, String dno, Person p) {
	
		this.street = street;
		this.dno = dno;
		this.p = p;
	}

	public String getStreet() {
		return street;
	}

	public void setStreet(String street) {
		this.street = street;
	}

	public String getDno() {
		return dno;
	}

	public void setDno(String dno) {
		this.dno = dno;
	}

	@Override
	public String toString() {
		return "Address [street=" + street + ", dno=" + dno + "]";
	}
	
	

}
