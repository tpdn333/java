package p10.lecture;

public class IZeroException extends Exception {  // RuntimeException아 아니네 CheckedException
	public IZeroException() {
		
	}
	public IZeroException(String message) {
		super(message);
	}
}
