package operators;

import java.util.Scanner;

public class ConditionalIfElse {
	
		public static void main(String[] args) {
			
			float a;
		
		  Scanner sc = new Scanner(System.in);
		   
		   System.out.println("Enter value of a");
		   a = sc.nextFloat();
			
		   if (a % 2 == 0)
		   {
			   System.out.println("Even");
		   }
		   else {
			   System.out.println("Odd");
		   }  

}


}
