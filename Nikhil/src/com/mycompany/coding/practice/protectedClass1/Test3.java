package src.com.mycompany.coding.practice.protectedClass1;

import src.com.mycompany.coding.practice.protectedClass.Test1;

public class Test3 extends Test1 {

	public static void main(String[] args) {
		
		Test1 s = new Test1();
	//	s.m1();            // Not Accessible
		
		
		Test3 p = new Test3();
		p.m1();           // Accessible
	}
	
}
