package src.com.mycompany.coding.practice.callingmethods;

public class NonStaticMethod {
	
	public void call1() {
		System.out.println("Hello Neha");
		StaticMethod.function1();
			}
	
	public void call2() {
		System.out.println("Good Morning");
			call1();
			
	}
	
		public static void main(String[] args) {
		
		NonStaticMethod p = new NonStaticMethod();
		p.call1();
		
		NonStaticMethod s = new NonStaticMethod();
		s.call2();
		
	}

}
