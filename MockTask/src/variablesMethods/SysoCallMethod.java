package variablesMethods;

public class SysoCallMethod {
	
	public void m1() {
		System.out.println("Hello");
		
	}
	
	public int m2() {
		
		return 10;
	
	}
	public static void main(String[] args) {
		
		SysoCallMethod a = new SysoCallMethod();
		
		a.m1();
		//System.out.println(a.m1());
		System.out.println(a.m2());
		
	}

}
