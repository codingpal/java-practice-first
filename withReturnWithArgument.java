package nikhil;

public class withReturnWithArgument {

static int a=10;
	
	
	public int m1(int a, int b, boolean d)
	{
	
	int e= a+b;

		System.out.println(a);
		System.out.println(b);
		System.out.println(d);
		System.out.println(e +(e));
		return a;
	}
			
	public static void main(String[] args) {
		
		withReturnWithArgument varz = new withReturnWithArgument();
        System.out.println(varz.m1(5,2, false));
	 
		}
	
	
}
