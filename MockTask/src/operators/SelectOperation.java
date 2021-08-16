package operators;

import java.util.Scanner;

public class SelectOperation {
	
	public void m1(int a,int b) {
		
	Scanner v = new Scanner(System.in);
		
		System.out.println("Enter case no:");

		int userinput = v.nextInt();

		switch(userinput) {
		
		default: System.out.println("Default"); break;
		
		case 1: System.out.println("addition:" +(a+b));  break;
		
		case 2: System.out.println("substration:" +(a-b)); break;
			
		case 3: System.out.println("multiplication:" +(a*b)); break;
			
		case 4: System.out.println("division:" +(a/b)); break;
			
		}
	
	}
	
	public static void main(String[] args) {
		
		SelectOperation s = new SelectOperation();
		
		s.m1(12,6);	
	}

}
