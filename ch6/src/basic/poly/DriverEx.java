package basic.poly;

public class DriverEx {

	public static void main(String[] args) {
		
		
		
		Taxi taxi = new Taxi();
		drive(taxi);
		Bus bus = new Bus();
		drive(bus);
		Vehicle vehicle = new Vehicle();
		drive(vehicle);
		
		
		
		
		
		
		
}

//	public static void drive(Taxi taxi) {
//		// 각 객체가 가지고 있는 run 호출
//		taxi.run();
//	}
//	public static void drive(Bus bus) {
//		// 각 객체가 가지고 있는 run 호출
//		bus.run();
//	}
	public static void drive(Vehicle vehicle) {
		// 각 객체가 가지고 있는 run 호출
		vehicle.run();
	}
	
	
	
	
}
