package categoriesMethods;

public class noReturnWithArgument {

static int a=10;
	
	
	public void m1(int a, int b, boolean d)
	{
	
	int e= a+b;

		System.out.println(a);
		System.out.println(b);
	//	System.out.println(c);
		System.out.println(d);
		System.out.println(e +(e));
		
	
}
	
		public static void main(String[] args) {
		
		
		noReturnWithArgument varz = new noReturnWithArgument();
 varz.m1(5,2, false);		
	}

}
