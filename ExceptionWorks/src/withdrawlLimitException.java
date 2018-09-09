
public class withdrawlLimitException extends Exception {
	
	int statusCode;
	
	public withdrawlLimitException(String message) {
		super(message);
	}
	
	public withdrawlLimitException(String message, int statusCode) {
		super(message);
		this.statusCode = 420;
	}
	
	public withdrawlLimitException(String message, Throwable cause, int code) {
		super(message, cause);
		this.statusCode = code;
	}
}
