package functions;

public class User {

	public static void main(String[] args) {
		System.out.println(Car.wheels);
		
		//non static functions and variables
		
		Car Renault=new Car();
		
		Car.wheels=8;
		Renault.colors="Black";
		Renault.model="xyz";
		Renault.Specificatiosn();
		//Renault.wheels=7; not recommended
		
		
		Car BMW=new Car();
		//BMW.colors="white";
		BMW.model="X1";
		BMW.Specificatiosn();
		
		Car maruti =new Car();
		maruti.colors="red";
		maruti.model="y1";
		maruti.Specificatiosn();

	}

}
