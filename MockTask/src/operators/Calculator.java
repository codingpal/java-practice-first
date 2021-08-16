package operators;

import java.util.Scanner;

public class Calculator {

	
	public static void main(String[] args) {
		
		System.out.println("Calculator App");
		System.out.println("Enter two digits");
		
		Scanner p = new Scanner(System.in);
		int digit1 = p.nextInt();
		int digit2 = p.nextInt();
		
		System.out.println("1. Addition");
		System.out.println("2. Multiplication"); 
		System.out.println("3. Substraction");
		System.out.println("Plz enter your choice");
		int a = p.nextInt();
		
		switch(a) {
		
		case 1: 
			System.out.println("Addition is:  " +(digit1 + digit2));
			break;
		
		case 2:
			System.out.println("Multiplication is:  " +(digit1 * digit2));
			break;
		
		case 3:
			System.out.println("Substraction is:  " +(digit1 - digit2));
			break;
		
		default:
		System.out.println("Default");
		
		}
	}
}

