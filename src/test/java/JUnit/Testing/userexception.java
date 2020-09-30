package JUnit.Testing;

public class userexception extends Exception{

	ExceptionType exceptiontype;
	enum ExceptionType{
		ENTERED_NULL,ENTERED_EMPTY;
	}
	public userexception(ExceptionType exceptiontype, String message) {
		super(message);
		this.exceptiontype=exceptiontype;
		System.out.println(message);
	}
}
