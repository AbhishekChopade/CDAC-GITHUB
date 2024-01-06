package custom_exception;

public class OutOfStockException extends Exception {
	public OutOfStockException(String mesg) {
		super(mesg);
	}
}
