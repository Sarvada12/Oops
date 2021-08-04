package oopsdemo2;

public class Vehicle 
{
 void drive ()
 {
	 System.out.println("Driving vehicle");
 }
	
	
}

class Car1 extends Vehicle
{

	@Override
	void drive() {
		System.out.println("Driving car");
		
	}

	
}
 class Truck extends Vehicle
 {

	@Override
	void drive() {
		System.out.println("Driving Truck");
		
	}
	
	
	void load()
	{
		System.out.println("Loading Truck");
	}
	 
 }