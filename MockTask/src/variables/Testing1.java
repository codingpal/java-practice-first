package variables;


public class Testing1 {
 static int b=10;
	
	public void neha() {
		int b=5;
		System.out.println(b);
		
		System.out.println(this.b);
		
		
	}
	
		
	public static void main(String[] args) {
		
		Testing1 c = new Testing1();
		int b=20;
		
			System.out.println("value of b:" +b);
			System.out.println("Value of ibstnce variable b:" +c.b);
			
			c.neha();
		
	}

}




