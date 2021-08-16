package operators;

import java.util.Scanner;

public class GuessShape1 {
	
	/* Write a program using if-else for identifying the given object is reactangle or Square. */
	public String m1(int l, int b) {
			
	if(l==b) 
		{ return "Square"; }
	else
		{ return "Rectangle"; }
	}
	
	public static void main(String[] args) {
		
		Scanner a = new Scanner(System.in);
		
		System.out.println("Enter value of length: ");
		int l = a.nextInt();
		
		System.out.println();
		
		System.out.println("Enter value of breadth");
		int b = a.nextInt();
		
		GuessShape1 s = new GuessShape1();
		
		System.out.println(s.m1(l,b));
		
		
	}

}
