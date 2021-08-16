package variablesMethods;

import java.util.Scanner;

public class AreaOfRectangle1 {
		
	int l,b;
		
		
	public static void main(String[] args) {
		
		AreaOfRectangle d = new AreaOfRectangle();
		
		Scanner sc = new Scanner(System.in);
		
       	System.out.println("Enter value of l");
		d.l = sc.nextInt();
		
		System.out.println("Enter value of b");
		d.b = sc.nextInt();
		
		int area = d.l * d.b;
		System.out.println("Area of Rectangle - " +area);
		
		
	}

}
