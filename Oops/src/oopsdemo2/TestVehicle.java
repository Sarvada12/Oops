package oopsdemo2;

//Dynamic polymorphism
public class TestVehicle {

	public static void main(String[] args) {
		
		Vehicle vObj=new Vehicle();//upcasting
		vObj.drive();
		
		Vehicle vCar=new Car1();//upcasting
	vCar.drive();//invoke overriding drive mtd
	
	Vehicle vTruck=new Truck();
	vTruck.drive();
	//vTruck.load();
	
	Truck t1=new Truck();
	t1.load();
	}

}
