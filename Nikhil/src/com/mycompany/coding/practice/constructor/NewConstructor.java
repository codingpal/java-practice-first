package src.com.mycompany.coding.practice.constructor;

public class NewConstructor {
	public NewConstructor()
	{
		this("hh");
		System.out.println(" Hello");
	}
	
	public NewConstructor(int a, int b) {
		this();
		int d=a+10;
		int e=b+5;
		System.out.println("Good Evening");
		System.out.println(d);
		System.out.println(e);
	}
	
	public NewConstructor(String s)
	{
		System.out.println(" String is Running");
	}
	
    public static void main(String[] args) {
	
    	NewConstructor c = new NewConstructor(7,3);
    	NewConstructor v = new NewConstructor();
    }
}
