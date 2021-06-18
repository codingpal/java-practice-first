package nikhil;

public class nonstatic2 {
	
	public void call1() {
		System.out.println("Hello Neha");
		call2();
	}
	
	public void call2() {
		System.out.println("Good Morning");
		call1();
	}
	
	
	public static void main(String[] args) {
		
		nonstatic2 s = new nonstatic2();
		s.call2();
		
	}

}
