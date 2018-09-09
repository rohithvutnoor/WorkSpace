package hello;
import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToOne;
import javax.persistence.Table;

@Entity
@Table(name="address")
public class Address {

	@Id
	@Column(name="id")
	@GeneratedValue(strategy=GenerationType.AUTO)
	private Integer id;
	
	@Column(name="line1")
	private String lineOne;
	
	@Column(name="line2")
	private String lineTwo;
	
	@Column(name="street")
	private String street;
	
	@Column(name="city")
	private String city;
	
	@Column(name="state")
	private String state;
	
	@Column(name="country")
	private String country;
	
	@OneToOne(targetEntity=Customer.class, cascade=CascadeType.ALL)
	@JoinColumn(name="customer_id", referencedColumnName="id")
	private Customer Customer;

	public Address() {
		
	}

	public Address(Integer id, String lineOne, String lineTwo, String street, String city, String state, String country,
			Customer customer) {
		this.id = id;
		this.lineOne = lineOne;
		this.lineTwo = lineTwo;
		this.street = street;
		this.city = city;
		this.state = state;
		this.country = country;
		this.Customer = customer;
	}

	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public String getLineOne() {
		return lineOne;
	}

	public void setLineOne(String lineOne) {
		this.lineOne = lineOne;
	}

	public String getLineTwo() {
		return lineTwo;
	}

	public void setLineTwo(String lineTwo) {
		this.lineTwo = lineTwo;
	}

	public String getStreet() {
		return street;
	}

	public void setStreet(String street) {
		this.street = street;
	}

	public String getCity() {
		return city;
	}

	public void setCity(String city) {
		this.city = city;
	}

	public String getState() {
		return state;
	}

	public void setState(String state) {
		this.state = state;
	}

	public String getCountry() {
		return country;
	}

	public void setCountry(String country) {
		this.country = country;
	}

	public Customer getCustomer() {
		return Customer;
	}

	public void setCustomer(Customer customer) {
		this.Customer = customer;
	}

	@Override
	public String toString() {
		return "Address [id=" + id + ", lineOne=" + lineOne + ", lineTwo=" + lineTwo + ", street=" + street + ", city="
				+ city + ", state=" + state + ", country=" + country + ", customer=" + Customer + "]";
	}
	
}
