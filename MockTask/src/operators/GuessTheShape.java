package operators;

import java.util.Scanner;

/* Write a program using if-else for identifying the given object is reactangle or Square. */

public class GuessTheShape {
	
	public static void main(String[] args) {
		
		int l,b;
		
		Scanner a = new Scanner(System.in);
		
		System.out.println("Enter value of l: ");
		l = a.nextInt();
		
		System.out.println();
		
		System.out.println("Enter value of b");
		b = a.nextInt();
		
		if(l==b) 
			System.out.println("The shape is Square");
		else
			System.out.println("The shape is Rectangle");
		
	}

}
