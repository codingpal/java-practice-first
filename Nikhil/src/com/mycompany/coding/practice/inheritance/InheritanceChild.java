package src.com.mycompany.coding.practice.inheritance;

public class InheritanceChild extends InheritanceParent  {
	
	int a= 100;
	public void collage()
	{
		int a=50;
		System.out.println("collage is running");
		System.out.println(a);
	    System.out.println(super.a);
		System.out.println(this.a);
	}
	
	public static void main(String[] args) {
		
		InheritanceChild c = new InheritanceChild();
		c.home();
		c.car();
		c.bike();
		c.collage();
	}
}
