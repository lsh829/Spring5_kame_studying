package chap02;

public class Greeter {
	private String format;
	
	//greet() 메소드 
	public String greet(String guest) {
		return String.format(format, guest);
	}
	
	//setFormat() 메소드 
	public void setFormat(String format) {
		this.format = format;
	}

}
