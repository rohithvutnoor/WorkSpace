import java.util.ArrayList;
import java.util.Collections;

public class Employee implements Comparable<Employee> {
	private int empNo ;
	private String name;

	Employee(int id, String name) {
		this.empNo = id;
		this.name = name;
	}

	@Override
	public int compareTo(Employee other) {
		if (empNo > other.empNo)
			return -1;
		else if (empNo == other.empNo)
			return 0;
		else
			return 1;
	}

	public static void main(String[] args) {
		Employee e1 = new Employee(11, "Rohith");
		Employee e2 = new Employee(2, "Prakash");
		Employee e3 = new Employee(13, "Nitin");
		Employee e4 = new Employee(1, "Hello");
		ArrayList<Employee> li = new ArrayList<Employee>();
		li.add(e1);
		li.add(e2);
		li.add(e3);
		li.add(e4);
		Collections.sort(li);	//obj.compareTo(obj2);
		for (Employee st : li) {
			System.out.println(st.name + " " + st.empNo);
		}
	}
}
