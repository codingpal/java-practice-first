package variablesMethods;

public class Student1 {
	
	int sid;
	String sname;
	int sub1;
	int sub2;
    int sub3;
    
    public void getStuData(int id, String name) {
    	
    	sid = id;
    	sname = name;
    	
    	System.out.println("sid - " +id);
    	System.out.println("sname - " +name);

    	    }
    
    public void getStuMarks(int s1, int s2, int s3) {
    	
        System.out.println();
        
       sub1 = s1;
       sub2 = s2;
       sub3 = s3;
        
        System.out.println("Student Marks:   ");
        System.out.println("Sub1 -  "  +s1);
    	System.out.println("Sub1 -  "  +s2);
    	System.out.println("Sub1 -  "  +s3);
    	    }
    
    public void totalMarks() {
    	
    	System.out.println();
    // 	System.out.println("Total Marks");
    	
      int totalMarks = sub1 + sub2 + sub3;
      System.out.println("Total Marks - " +totalMarks);
    	
    } 
    
    public static void main(String[] args) {
    	
    	Student1 x = new Student1();
    	
    	x.getStuData(01, "Anvi Patil");
    	x.getStuMarks(10,20,30);
    	 x.totalMarks();
	}


}
