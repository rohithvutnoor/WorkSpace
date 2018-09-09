package lambdaPack;

import java.util.List;
import java.util.function.Predicate;
import java.util.Arrays;
import java.util.Iterator;

public class funInt {
	public static void eval(List<Integer> l, Predicate<Integer> p) {
		for (Integer i : l) {
			if (p.test(i))
					System.out.print(i + " ");

		}
		System.out.println();
	}

	public static void main(String[] args) {
		List<Integer> l = Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8, 9);
		System.out.println("Print All Numbers");
		eval(l, n -> true);
		System.out.println("Print Even Numbers");
		eval(l, n -> n %2==0);
	}
}
