package functions;

public class Car {
	
	static int wheels=4;
	String colors="Blue";
	String model;
	public void  Specificatiosn()
	{
		System.out.println("specifications:"+wheels+" colors:"+colors+" model:"+model);
	}

	public static void testderive()		
	{
		System.out.println("test Drive");
		Car c=new Car();
		c.Specificatiosn();
	}
	public static void main(String[] args) {
		
		//static variales and static functions
		testderive();
		System.out.println(wheels);
		
		//non static varables and functions
		
		Car c=new Car();
		c.Specificatiosn();
		
	} 
}
