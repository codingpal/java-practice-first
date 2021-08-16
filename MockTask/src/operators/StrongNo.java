package operators;

/* Strong no- 
 * 6= 1,2,3
 * 28= 1,2,4,7,14
 * 496= 1, 2, 4, 8, 16, 31, 62, 124, 248 */
public class StrongNo {
	
	public static void main(String[] args) {
		
		int no=6;
		
     //           1 ;  6 	
		for(int i=1 ; i<no; i++) {
			
			if(no%i==0) {
				System.out.print(" " +i);
			}
			
		}
		
	}

}
