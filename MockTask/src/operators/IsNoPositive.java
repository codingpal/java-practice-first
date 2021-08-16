package operators;

import java.util.Scanner;

public class IsNoPositive {

	// to check the no is positive, negative or zero
	public static void main(String[] args) {
		
		int a=10;
		
		Scanner s = new Scanner(System.in);
		
		System.out.println("Enter a no:");

				a = s.nextInt();
		
			if(a>=0) {
			System.out.println("The no is Positive");}
		
			else if (a<0) {
				System.out.println("The no is negative"); }
		
			else if (a==0) {
				System.out.println("The no is Zero");
				
						}
		}
		
		
	}

