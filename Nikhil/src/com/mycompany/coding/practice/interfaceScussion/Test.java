package src.com.mycompany.coding.practice.interfaceScussion;

public class Test implements Interface1, Interface2 {
		
	public void m1() {
		System.out.println("Hi");
	}
	
		public void m2() {
		System.out.println("Neha");
	} 

		public static void main(String[] args) {
			
			Test p = new Test();
			p.m1();
			p.m2();
	}
		
		
		
}

