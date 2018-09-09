import java.util.HashSet;

public class SetWorks {
	public static void main(String[] args) {
		HashSet<Integer> hSet = new HashSet<Integer>();

		for (int i = 0; i < 10; i++) {
			hSet.add(new Integer(i));
		}

		System.out.println(hSet.contains(8));
		System.out.println(hSet.size());
	}
}
