package net.java_school.bank;

public class DuplicateAccountNoException extends RuntimeException {

	private static final long serialVersionUID = -322839855082785410L;

	public DuplicateAccountNoException() {
		super();
	}

	public DuplicateAccountNoException(String message, Throwable cause) {
		super(message, cause);
	}

	public DuplicateAccountNoException(String message) {
		super(message);
	}

	public DuplicateAccountNoException(Throwable cause) {
		super(cause);
	}
	
}