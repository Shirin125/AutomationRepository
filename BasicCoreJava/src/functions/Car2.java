package functions;

public class Car2 {
 int cc=900;
 String FuelType;
 int steering;
 
 //default constructor
 public Car2(int cc,String fueltype,int steering)// to intialize instnce vriable
 {
	 this.cc=cc;
	 this.FuelType=fueltype;
	 this.steering=steering;
	 
 }
 public void Acceleration()
 {
	 System.out.println("CC"+cc+" FuelType"+FuelType+" steering"+steering);
	 System.out.println("sterring is "+steering+" is fueltype is"+FuelType+"and CCis"+cc);
 }
 
 
}
