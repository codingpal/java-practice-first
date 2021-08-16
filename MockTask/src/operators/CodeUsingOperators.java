package operators;

public class CodeUsingOperators {

	int a= 10;
	int b= 5;
	
	public void m1() {
		
		System.out.println("Addition: "  +(a+b));
		System.out.println("Substraction: "  +(a-b));
		System.out.println("Multiplication: "  +(a*b));
		System.out.println("Division: "  +(a/b));
		System.out.println("Modulos: "  +(a%b));
		
		int c= 5;
		System.out.println("Unary plus: " +(c+=5));
		System.out.println("Unary minus: " +(c-=2));
		System.out.println("Unary multiplication: " +(c*=5));
		System.out.println("Unary Division: " +(c/=5));
		System.out.println("Unary Modulos: " +(c%=5));
	}
	
		public void m2() {
		int d= 10;
		int p= d++;
		System.out.println("Post Incremental: " +d);
		System.out.println("Post Incremental: " +p);
	}
		
		public void m3() {
			int d= 10;
			int p= ++d;
			System.out.println("Pre Incremental: " +d);
			System.out.println("Pre Incremental: " +p);
		}
		
		public void m4() {
			int d= 10;
			int p= d--;
			System.out.println("Post Decremental: " +d);
			System.out.println("Post Decremental: " +p);
		}
		
		public void m5() {
			int d= 10;
			int p= --d;
			System.out.println("Pre Decremental: " +d);
			System.out.println("Pre Decremental: " +p);
		}
	public static void main(String[] args) {
		
		CodeUsingOperators s = new CodeUsingOperators();
		
		s.m1();
		System.out.println();
		s.m2();
		System.out.println();
		s.m3();
		System.out.println();
		s.m4();
		System.out.println();
		s.m5();
	}
}


