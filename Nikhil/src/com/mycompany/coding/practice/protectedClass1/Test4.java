package src.com.mycompany.coding.practice.protectedClass1;

public class Test4 extends Test3 {
	
	public static void main(String[] args) {
		
		Test3 a = new Test3();
	//	a.m1();          //Not Accessible
		
		Test4 b = new Test4();
		b.m1();          // Accessible
	}

}
