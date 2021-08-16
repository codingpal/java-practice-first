package variablesMethods;

public class Student {
  
	int SID;
	String Sname;
	int Sub1 = 50;
	int Sub2 = 60;
    int Sub3 = 70;
    
    public void getStuData() {
    	int a= SID = 01;
    	String b = Sname = "Anvi Patil";
    	
    	System.out.println("SID -  "  +a);
    	System.out.println("Sname -  "  +b);
    	    }
    
    public void getStuMarks() {
    	int c = Sub1;
    	int d = Sub2;
        int e = Sub3;
        
        System.out.println();
        System.out.println("Student Marks:   ");
        System.out.println("Sub1 -  "  +c);
    	System.out.println("Sub1 -  "  +d);
    	System.out.println("Sub1 -  "  +e);
    	    }
    
    public void totalMarks() {
    	
    	System.out.println();
    	System.out.println("Total Marks");
    	Student x = new Student();
    	int f = Sub1 + Sub2 + Sub3;
    	System.out.println("Total Marks - " +f);
    	
    } 
    
    public static void main(String[] args) {
    	
    	Student x = new Student();
    	
    	x.getStuData();
    	x.getStuMarks();
    	x.totalMarks();
	}
    
}
