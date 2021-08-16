package operators;

import java.util.Scanner;

// write a program for 1st 10 Even Numbers
public class PrintEvenNumbers {
	
	public void evenno() {
		
		int count = 0;
		int value = 1;
		
		System.out.println("1st 10 Even Nos:");
		while (count<=20) {
			
			if (value%2 ==0) {
				System.out.println(value);
			}
			count++;
			value++;
		}
	}
	
	public static void main(String[] args) {
					
		PrintEvenNumbers s = new PrintEvenNumbers();
		s.evenno();
				
	}

}
