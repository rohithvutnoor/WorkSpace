package lambdaPack;

public interface stringConcat {
	default String concates(String a, String b, stringConcat st) {
		return st.operation(a,b);
	}

	String operation(String a, String b);
}