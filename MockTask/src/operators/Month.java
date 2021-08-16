package operators;

public class Month {
	
	public void m1() {
		char a= 'C';
		switch(a) {
		case 'A':  System.out.println("January");  break;
		
		case 'B': System.out.println("February");  break;
			
		case 'C': System.out.println("March"); break;
			
		case 'D': System.out.println("April");  break;
			
		case 'E': System.out.println("May");   break;
			
		case 'F': System.out.println("June");  break;
			
		case 'G': System.out.println("July"); break;
		
		case 'H': System.out.println("August"); break;
		
		case 'I': System.out.println("September"); break;
		
		case 'J': System.out.println("Octomber"); break;
		
		case 'K': System.out.println("November"); break;
		
		case 'L': System.out.println("December"); break;
		
		default: System.out.println("Default");
			 
		}
	}

public static void main(String[] args) {
		
	Month v = new Month();
	
	v.m1();
	
		}
}
