package callingmethods;

public class NonStaticMethod {
	
	public void call1() {
		System.out.println("Hello Neha");
		call2();
	}
	
	public void call2() {
		System.out.println("Good Morning");
		call1();
	}
	
	
	public static void main(String[] args) {
		
		NonStaticMethodInStaticArea s = new NonStaticMethodInNonStaticArea();
		s.call2();
		
	}

}
