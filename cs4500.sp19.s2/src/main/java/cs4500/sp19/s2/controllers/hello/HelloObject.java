package cs4500.sp19.s2.controllers.hello;

public class HelloObject {
	private String message;
	public String getMessage() {
		return message;
	}
	public void setMessage(String message) {
		this.message = message;
	}
	public HelloObject(String message) {
		this.message = message;
	}
	public HelloObject() {
	}
}

