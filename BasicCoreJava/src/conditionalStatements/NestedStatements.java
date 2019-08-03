package conditionalStatements;

public class NestedStatements {

	public static void main(String[] args) {
		int a=10;
		int b=20;
		int c=30;
		if(a>b)
		{
		   if(a>c)
		   {
		    System.out.println("a is greates");
		   }
		   else
		   {
		     System.out.println("a is greater than b but less than c");
		   }
		}//end of if
		else
		{
			System.out.println("a is less than b");
		}
	}

}
