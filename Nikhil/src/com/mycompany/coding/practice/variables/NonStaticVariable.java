package src.com.mycompany.coding.practice.variables;

public class NonStaticVariable {

	int a = 10;
	int b = 5;
	
	static int c = 60;
	
	public void m1() {
		System.out.println(a);
	}
		public static void main(String[] args) {
			
			NonStaticVariable abc = new NonStaticVariable();
			System.out.println(abc.a);
			System.out.println("Value of c from abc ref is : " +abc.c);
			abc.b = 20;
			System.out.println("Value of b from abc ref is :"+abc.b);
			
			
			NonStaticVariable xyz = new NonStaticVariable();
			System.out.println(xyz.b);
			System.out.println("Value of b from xyz ref is :"+xyz.b);
			xyz.c= 40;
			System.out.println("Value of c from abc ref "+abc.c);
			System.out.println("Value of c from xyz ref "+xyz.c);  

			
			NonStaticVariable pqr = new NonStaticVariable();
			System.out.println("Value of c from pqr ref "+pqr.c);
			pqr.a= 50;
			System.out.println(pqr.a);
				
			pqr.m1();
			}
	
}
