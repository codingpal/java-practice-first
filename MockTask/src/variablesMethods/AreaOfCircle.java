package variablesMethods;

public class AreaOfCircle {
	static float pi = 3.14f;
	
	public void area() {
		
		float r = 5.0f;
		
		float area = pi * r * r;
		System.out.println("Radius - " +r);
		System.out.println("Area of Circle  -" +area+"cm2");
			
	}
	
		public static void main(String[] args) {
	
		AreaOfCircle p = new AreaOfCircle();
		
		p.area();
		
	}

}
