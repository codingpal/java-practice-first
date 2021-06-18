package nikhil;

public class staticobject2 {
	
	public static void call1() {
		System.out.println("Hello Neha");
		call2();
	}
	
	public static void call2() {
		System.out.println("Good Morning");
		call1();
	}
	
	
	public static void main(String[] args) {
		call2();
		
	}	
}
