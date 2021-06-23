package inheritanceMultipleLevel;

	public class Child extends Parent {
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
			
			Child c = new Child();
			c.home();
			c.car();
			c.bike();
			c.collage();
			
			//System.out.println(c.a);
					
		}

}
