package operators;

/* Write a program to Reverse the Given Number? Also Find their addition. */

public class ReverseAddition {

	public static void main(String[] args) {
		int n= 12345, rev=0, rem=0, sum=0;
		
		System.out.println("Given No:" +n);
		while(n!=0) {
			rem= n%10;
			rev= rev*10+rem;
			n=n/10;
			sum=sum+rem;
		}
		System.out.println("Reverse No:" +rev);
		System.out.print("Sum:"+sum);
		
	}
	
	
}
