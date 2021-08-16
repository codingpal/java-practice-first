package overriding;

public class Test2 extends Test1 {

	int x=222; 
	
	public void m1() {
		System.out.println("child M1 method running");
	}
	
	public void m1(int x) {
		System.out.println("child M1 method with argument is running");
	}
		
	public void marry() {
		System.out.println("MArry to Disha");
	}
	
	public static void m3() {
		System.out.println("child M1 method with argument is running");
	}
	public static void main(String[] args) {
	
		Test1 s = new Test2();
	
//	s.m1();
//	s.m1(10);
//	s.marry();
	s.m3(); 
	
	System.out.println(s.x);
	}

	
}
