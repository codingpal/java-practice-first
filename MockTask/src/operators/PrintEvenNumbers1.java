package operators;

import variablesMethods.SysoCallMethod;

//write a program for 1st 10 Even Numbers

public class PrintEvenNumbers1 {
		
public void evenno() {
		
		int count = 1;
			
		System.out.println("1st 10 Even Nos:");
		for (int value=1; value<=20; value++) {
				if (value % 2 == 0) {
					
					System.out.println(value);
				}
				count++;
		}
	}
		
	public static void main(String[] args) {
					
		PrintEvenNumbers1 s = new PrintEvenNumbers1();
	    s.evenno();
				
	}

}
