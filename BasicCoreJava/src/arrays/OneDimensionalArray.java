package arrays;

public class OneDimensionalArray {

	public static void main(String[] args) {
		try
		{
		String [] str =new String[6];
		str[0]="shirin";
		str[1]="afreen";
		str[2]="rutuja";
		str[3]="shital";
		str[4]="sanjeet";
		for(String i: str)
		{
			System.out.println(i);
		}
		System.out.println(str[6]);
		
		
	}//end of try
		catch(ArrayIndexOutOfBoundsException ex)
		{
		 System.out.println("inside array index outof bound");
		}
		catch(Exception ex)
		{
		 System.out.println(ex.getLocalizedMessage());
		}
		finally {
			
			System.out.println("inside finally");
		}
		studentPrint();
	}
	
	@SuppressWarnings("finally")
	public static int studentPrint()
	{
		try
		{
		String [] str =new String[6];
		str[0]="shirin";
		str[1]="afreen";
		str[2]="rutuja";
		str[3]="shital";
		str[4]="sanjeet";
		for(String i: str)
		{
			System.out.println(i);
		}
		System.out.println(str[6]);
		return 0;
		
	}
		finally
		{
			System.out.println("shirin ");
			return 0;
			//System.out.println("after return");  unreachable code
		}
	}

}
