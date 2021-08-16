package operators;

import java.util.Scanner;

/* Consider the following student monitoring system-
-Writ program to categorise the student base on range of percentage
F- Less than 35
D-35 to 40
C- 41 to 60	
B-61 to 80B-61 to 80
A-Above 81 */

public class StudentMonitorSystem {
	
	public static void main(String[] args) {
		
		int marks;
	
	Scanner a = new Scanner(System.in);
	
	System.out.println("Enter the marks: ");
	marks = a.nextInt();
		
	if (marks <35)
		System.out.println("Grade is F");
	
	else if (marks >=35 && marks<=40)
	    System.out.println("Grade is D");
	
	else if (marks >=41 && marks<=60)
	    System.out.println("Grade is C");
	
	else if (marks >=61 && marks<=80)
	    System.out.println("Grade is B");
	
	else 
		System.out.println("Grade is A");
	
	}
}
