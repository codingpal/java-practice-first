package src.com.mycompany.coding.practice.protectedClass;


public class Test2 extends Test1 {
	
	public static void main(String[] args) {
		
		Test1 j = new Test1();
		j.m1();                // Accessible
		 
		Test2 k = new Test2();
		k.m1();                // Accessible
	}

}
