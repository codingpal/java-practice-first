package variablesMethods;

public class AreaOfRectangle {

	int l = 8;
	int b = 5;
	
	public void rectangle() {
		
		int area = l * b;
		
		System.out.println("Length of Rectangle -" +l);
		System.out.println("Breadth of Rectangle -" +b);
		System.out.println("Area of Rectangle - " +area);
		
	}
	
	public static void main(String[] args) {
		
		AreaOfRectangle d = new AreaOfRectangle();
		
		d.rectangle();
		
	}
}
