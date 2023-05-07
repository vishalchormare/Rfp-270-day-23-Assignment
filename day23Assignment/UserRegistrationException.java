package day23Assignment;

public class UserRegistrationException extends RuntimeException {
	public enum ExceptionType {
		INVALID_FIRST_NAME, INVALID_LAST_NAME, INVALID_EMAIL, INVALID_PHONE_NUMBER, INVALID_PASSWORD
	}

	public ExceptionType exceptionType;

	public UserRegistrationException(String message, ExceptionType exceptionType) {
		super(message);
		this.exceptionType = exceptionType;
	}

}
