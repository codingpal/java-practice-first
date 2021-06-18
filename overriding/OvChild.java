package overriding;

public class OvChild extends OvParent {

	
	public void m1()
	{
		System.out.println("Child is running");
	}
	
	public static void main(String[] args) {
		
		OvChild c = new OvChild();
		c.home();
		c.bike();
		c.car();
		c.m1();
		
		OvParent p= new OvParent();
		p.home();
		p.bike();
		p.car();
		p.m1();
		
		System.out.println("******************************");

		OvParent pp = new OvChild();
		pp.m1();
		
	}
	
}
