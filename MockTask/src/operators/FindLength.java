package operators;

/* Write a logical program to count the length of no.? */

public class FindLength {

	public void length() {
		
		int x= 1234;
		int count = 0;
		
		System.out.println("Given Word: " +x);
		while(x!=0) {
			
			x= x/10;
			count++;	
		}
		
		System.out.println("Length of given word: " +count);		
	}
	
	
	public static void main(String[] args) {
		
		FindLength s = new FindLength();
		s.length();
	}
}
