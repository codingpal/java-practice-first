package overloading;

public class Test1 {

	
	public void m1() {
		System.out.println("M1 method running");
	}
	
	public void m1(int x) {
		System.out.println("M1 method with argument is running");
	}
	
	public static void main(String[] args) {
		
		Test1 a = new Test1();
		
		a.m1();
		a.m1(10);
		
	}
}
