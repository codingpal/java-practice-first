package overriding;

public class Test1 {
	
	int x=111; 
	
	public void m1() {
		System.out.println("Parent M1 method running");
	}
	
	public void m1(int x) {
		System.out.println("Parent M1 method with argument is running");
	}
	
	public void marry() {
		System.out.println("MArry to Aalia");
	}

	public static void m3() {
		System.out.println("Parent M3 method with argument is running");
	}

}
