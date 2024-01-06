package custom_exception;

public class AuthenticationException extends Exception {
	public AuthenticationException(String mesg) {
		super(mesg);
	}
}
