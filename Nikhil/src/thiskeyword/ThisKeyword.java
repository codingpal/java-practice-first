package thiskeyword;

	public class ThisKeyword {
		
		String t = "abc";
		String s = "pqr";
		
		public void m2() {
				String s = "def";
				
				System.out.println("The value of local var is "+s);
				
				System.out.println("the value of nonstatic variable s is: "+this.s); 
				
		}
		
		public static void main(String[] args) {
			
			ThisKeyword h = new ThisKeyword();
			h.m2();
		
		}


}
