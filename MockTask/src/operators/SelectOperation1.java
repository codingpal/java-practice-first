package operators;

import java.util.Scanner;

public class SelectOperation1 {

	public String m1(int a, int b, int c) {
		
		String x = "invalid choice";
		
			switch(c) {
			case 1: x = "addition:" +(a+b); return x;             //x="addition:18"
			case 2: x = "substration:" +(a-b); return x;
			case 3: x = "multiplication:" +(a*b); return x ;
			case 4: x = "division:" +(a/b); return x;
			default: return x;
			
			}
		} 
		
		public static void main(String[] args) {
			
			Scanner v = new Scanner(System.in);
			System.out.println("Enter value of a :");
			int a = v.nextInt();			
			System.out.println("Enter value of b  :");
			int b = v.nextInt();
			System.out.println("Enter userchoice:");	
			int c = v.nextInt(); 
			
			SelectOperation1 s = new SelectOperation1();
			
			System.out.println(s.m1(a,b,c));
		    
		}

	}

	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	

