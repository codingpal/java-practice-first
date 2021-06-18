package nikhil;

public class Constructors {
	
	public Constructors()
	{
		System.out.println(" Hello");
	}
	
	public Constructors(int a, int b) {
		this();
		int d=a+10;
		int e=b+5;
		System.out.println("Good Evening");
		System.out.println(d);
		System.out.println(e);
	}
	
    public static void main(String[] args) {
	
    	Constructors cp=new Constructors(7,3);
    	//cp.Constructors(5,2);
    
    
    }
}
