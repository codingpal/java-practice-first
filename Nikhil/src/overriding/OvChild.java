package overriding;

public class OvChild extends OvParent {

		public void m1()
	{
		System.out.println("Child is running");
		}
	
     public void m2(int a, int b) {
		
		System.out.println("A and B is Running");
		
     }
				
		public static void main(String[] args) {
		
		OvChild c = new OvChild();
		c.home();
		c.bike();
		c.car();
		c.m1();
		c.m2(1,2);
		
		System.out.println("******************************");
		
		OvParent p= new OvParent();
		p.home();
		p.bike();
		p.car();
		p.m1();
		p.m2(3,4);
				
		System.out.println("******************************");

		OvParent pp = new OvChild();
		pp.m1();
		pp.m2(5,6);
		
		}
	}
