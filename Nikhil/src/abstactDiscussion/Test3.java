package abstactDiscussion;

public class Test3 extends Test2 {

	public void m4() {
	
		System.out.println("M4 is Running From Test3");
	}
	
	public static void main(String[] args) {
		
		Test3 u = new Test3();
		u.m1();
		u.m2();
		u.m3();
		u.m4();
	}

}
