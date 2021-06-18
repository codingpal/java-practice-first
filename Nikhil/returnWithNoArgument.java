package nikhil;

public class returnWithNoArgument {

static int a=10;
	
	
	public boolean m1()
	{
	
	System.out.println(a);
	return true;
	
}

	
	public static void main(String[] args) {
		
		returnWithNoArgument varz = new returnWithNoArgument();
		boolean boolp=varz.m1();
		
		System.out.println(boolp);

}

	
}
