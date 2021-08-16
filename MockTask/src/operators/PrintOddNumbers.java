package operators;

public class PrintOddNumbers {
	
public void oddno() {
		
		int count = 0;
		int value = 1;
		
		System.out.println("1st 10 Odd Nos:");
		while (count<=20) {
			
			if (value%2 == 1) {
				System.out.println(value);
			}
			count++;
			value++;
		}
	}
	
	public static void main(String[] args) {
					
		PrintOddNumbers s = new PrintOddNumbers();
		s.oddno();
				
	}
}
