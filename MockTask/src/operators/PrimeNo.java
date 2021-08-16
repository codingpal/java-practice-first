package operators;

public class PrimeNo {

	// Write  a program to finding out given no is prime or not.
	// 12 = 2*2*3
	// 85 = 5*17 
	public static void main(String[] args) {
		int no=7;
	    int count=0;
	    
//		for (int i=2; i<no; i++) {
//			if(no%i ==0) {
//				count++;
//			}
//		}
//			if(count>0) { 
//				System.out.println("Not Prime");
//			}
//			else {
//				System.out.println("Prime");
//			}
//***************************************************************************************************************	    
	    
//	    for (int i=1; i<=no; i++) {
//	    	
//	    	if (no%i==0) {
//	    		count++;
//	    	}
//	    }
//	    
//	    if (count==2) {
//	    	System.out.println("Prime");
//	    }
//	    else {
//	    	System.out.println("Not Prime");
//	    	}
//********************************************************************************************************************	    
	
	//      2    ; 7
	for(int i=2; i<no; i++) {
		
		if(no%i ==0) {
			//count=1;
			System.out.println("Not Prime");
			break;	
		}
		else {
			System.out.println("Prime");
		}
		
	}
	
	
	
	
	//if (count==1) {
	//	System.out.println("Not Prime");
	//}
	
	}
	
}
	    



