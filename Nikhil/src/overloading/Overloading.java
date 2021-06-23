package overloading;

public class Overloading {
	int a=10;
	int b=5;
	
	public void m() {
	
		System.out.println("M is Running");	
	}
	
     public void m(int a) {
		
		System.out.println("int is Running");
	}
     public void m(String s) {
    		
 		System.out.println("String is Running");
 	}
 	
     public int m(int a, int b ) {
 		
    	//this.a;
    	 System.out.println("int a and int b is Running");
     return a;
    
     }	

          public static void main(String[] args) {
		
        Overloading p= new Overloading();
    	 p.m();
    	 p.m(5);
    	 p.m("hello");
    	 p.m(5,2);
    	 
    	System.out.println(p.a);
    	   	 
	}
 	}
