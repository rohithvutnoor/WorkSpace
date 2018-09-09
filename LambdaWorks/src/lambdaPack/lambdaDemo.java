package lambdaPack;

import java.util.function.BinaryOperator;

public class lambdaDemo {
	static int a, b;

	public static void main(String[] args) {

		BinaryOperator<Integer> addI = (a, b) -> a * b;
		BinaryOperator<String> addS = (s, t) -> s + t;

		lambdaDemo d = new lambdaDemo();

		stringConcat stc = (String s, String t) -> {
			return s.concat(t);
		};
		stringConcat stc2 = (String s, String t) -> {
			return s.concat(t).concat(" Prakash");
		};

		System.out.println(d.operate("Hai ","Rohith",stc));
		System.out.println(d.operate("Hai ","Rohith",stc2));

		int i = addI.apply(10, 15);
		String s = addS.apply("c", "d");

		System.out.println("Result: " + i);
		System.out.println(s);
	}

	interface stringConcat{
		String operation(String a, String b);
	}
	
	public String operate(String a, String b, stringConcat st) {
			return st.operation(a, b);
		}
}
