package custom_exception;

public class AuthorizationException extends Exception {
	public AuthorizationException(String mesg) {
		super(mesg);
	}
}
