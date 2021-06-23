package overloading;

public class OvLoading {
	public void m1()
	{
		System.out.println("Null");
	}
	
	public void m1(int d)
	{
			System.out.println("One argument is Running");
	}
	public int m1(int a, int b)
	{
		System.out.println("Two argument is Running      "  +(a+b));
		return a;
		}
		
	public void m1(String s)
	{
		String ss = "Neha";
		System.out.println("String s is running    "    +ss);
	}
	
	public static void m1(String s, int k)
	{
		String pp = "Pramod";
		System.out.println("String s  and  int k are running    "    +pp);
	}
		
			
	public static void main(String[] args) {
		
		OvLoading h = new OvLoading();
		h.m1();
		h.m1(5);
		h.m1("n");
		h.m1(10,20);
		m1("p", 69);
 
}
}
