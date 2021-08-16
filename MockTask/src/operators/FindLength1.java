package operators;

public class FindLength1 {

	public static void main(String[] args) {
	
		int x= 1234;
		int count=0;
		
		System.out.println("Give No:" +x);
		while(x>0) {
			
			x=x/10;
			count++;
		}
		
		System.out.println("Lenth of No:" +count);

	}

}
