package operators;

public class FinalVariable
{

	final int a=10;
	
	public static void main(String[] args) {
		FinalVariable p = new FinalVariable();
		
		final int b;
		b=10;
//		b=15;
		System.out.println(p.a);
	}
}
