package variables;

public class Addition {

	int a=10;
	static int b=5;
	
	public static void main(String[] args) {
		int c=20;
		
		Addition p = new Addition();
		System.out.println("First Variable - "  +p.a);
		System.out.println("Second Variable - "  +b);
		System.out.println("Third Variable - "  +c);
		
		int k = p.a + b;
		System.out.println("Addition of a and b   - "  +k);
		
		int s = b + c;
		System.out.println("Addition of b and c   - "  +s);
		
		int x = p.a + c;
		System.out.println("Addition of a and c   - "  +x);
		
		
		int m = p.a + b + c;
		System.out.println("Addition of a, b and c   - "  +m);
		
	}

}
