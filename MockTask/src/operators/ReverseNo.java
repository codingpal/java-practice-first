package operators;

public class ReverseNo {
	
public void length() {
		
		int x = 1234;   // 4321
		int rem = 0;
		int rev = 0;
		int sum = 0;
		
		System.out.println("Given No: " +x);
		
		while(x!=0) {
			
		rem = x%10;       //123
		rev = rev*10+rem;  //123
		x=x/10;            //12
				
		sum = sum+rem;
		}
		
		
		System.out.println("Reverse No: " +rev); 
		System.out.println("Sum:" +sum);

}
	
		public static void main(String[] args) {
		
		ReverseNo s = new ReverseNo();
		s.length();
			
	}

}
