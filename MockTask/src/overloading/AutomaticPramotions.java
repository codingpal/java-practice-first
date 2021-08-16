package overloading;

public class AutomaticPramotions {
	
	public void m1(float a) {
		System.out.println("Float Argument M1 Running");
	}

	public void m1(int x) {
		System.out.println("Int Argument M1 Running");
	}
	
	public void m1(float a, int x) {
		System.out.println("Float-int argument m1");	
	}
	
	public void m1(int x, float a) {
		System.out.println("Int-float argument m1");	
	}
	
	AutomaticPramotions(){
		this(2);
		System.out.println("No- argument constr");
	}
	AutomaticPramotions(int x){
		System.out.println("Int argument constr");
	}
	
	public static void main(String[] args) {
		
		AutomaticPramotions d = new AutomaticPramotions();
		
		d.m1(10.2f);
		d.m1(5);
		d.m1('c');   // char to int (automatic pramotions)
		d.m1(10l);   // long to float (automatic pramotions)
		d.m1('c',10l); // (char to int) and (long to float)
		d.m1(5,10.4f);
	}
}
