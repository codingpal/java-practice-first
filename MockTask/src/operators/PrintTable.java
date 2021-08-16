package operators;

import java.util.Scanner;

public class PrintTable {
	
	public void table(int value) {
		
		int count =1;
			
		System.out.println("Table:");
		
		while(count<=10) {
				
			System.out.println(value*count);
			count++;
			}
		}
		
	public static void main(String[] args) {
		
		PrintTable s = new PrintTable();
		Scanner a = new Scanner(System.in);
		System.out.println("Enter a no");
		int value = a.nextInt();
		s.table(value);
		
		}
}
