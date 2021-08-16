package operators;

import java.util.Scanner;

public class FindEvenOdd1 {
	
public void evenodd() {
		
		int value = 1;
		while (value<=10) {
					
		if(value % 2 == 0) {
			
			System.out.println("Number is even:" +value);
		}
		else {
			System.out.println("Number is odd:" +value);
		}
		 value++;
		}
	}
		
	public static void main(String[] args) {
			
		FindEvenOdd1 s = new FindEvenOdd1();
		s.evenodd();
	}
	
	

}
