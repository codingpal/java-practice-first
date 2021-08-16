package operators;

/* Take the no from user and Find the no is even or odd?*/
import java.util.Scanner;

public class FindEvenOdd {

	public void evenodd() {
		
		Scanner p = new Scanner(System.in);
		System.out.println("Enter a value: ");
		int value = p.nextInt();
		
		if(value % 2 ==0) {
			
			System.out.println("even");
			value ++;
		}
		else {
			System.out.println("odd");
		}
	}
		
	public static void main(String[] args) {
			
		FindEvenOdd s = new FindEvenOdd();
		s.evenodd();
	}
}
