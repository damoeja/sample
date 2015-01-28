package net.java_school.bank;

public class LackOfBalanceException extends Exception {

	private static final long serialVersionUID = 6384843121829820665L;

	public LackOfBalanceException() {
		super();
	}

	public LackOfBalanceException(String message, Throwable cause) {
		super(message, cause);
	}

	public LackOfBalanceException(String message) {
		super(message);
	}

	public LackOfBalanceException(Throwable cause) {
		super(cause);
	}

}