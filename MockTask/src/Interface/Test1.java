package Interface;


public class Test1 implements Interface1, Interface2 {

	public static void main(String[] args) {
		
		Test1 s = new Test1();
		
		s.m1();
		
	}

	@Override
	public void m2() {
		System.out.println("M2 method from interface2");
	
	}

	@Override
	public void m1() {
			System.out.println("M1 method from interface1");
		
	}

	
}
