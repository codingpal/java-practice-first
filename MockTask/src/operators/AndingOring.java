package operators;

public class AndingOring {

	public void and() {
		
	int x= 5;
	if (x<=10 && x<=8)
		
	 System.out.println("Anding: " +x);
	}
	
	public void or() {
		int x= 7 ;
		if (x<=10 || x<=8)
			
			System.out.println("Oring: " +x);
				
	}
		
	public static void main(String[] args) {
		
		AndingOring s  = new AndingOring();
		
		s.and();
		s.or();
		
		
	}
}
