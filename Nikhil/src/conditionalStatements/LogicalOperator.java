package conditionalStatements;

public class LogicalOperator {
	
public static void main(String[] args) {
		
		int i = 10;
		int j= 20;
		int k = 10;
		int l= 10;

	if(i!=j)
	{ System.out.println("I is not equal to J");}
	
	else
	{ System.out.println("I is equal to J"); }
	
	if(!(i==j))
	{ System.out.println("I is not equal to J"); }
	
	else
	{ System.out.println("I is equal to J"); }

if((i==j)&&(k<l))
	
	System.out.println("if is running");

else {
	System.out.println("else is running");
}

if((i==j)||(k>l))
	
	System.out.println("if is running");

else {
	System.out.println("else is running");
}


if((i!=j)||(k<l))
	
	System.out.println("if is running");

else if ((i==j)||(k<l)){
	System.out.println("else if  is running");
}

else
{
	System.out.println("else   is running");	
}
}


}
