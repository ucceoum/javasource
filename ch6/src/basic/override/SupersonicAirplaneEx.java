package basic.override;

public class SupersonicAirplaneEx {

	public static void main(String[] args) {
		SupersonicAirplane obj1 = new SupersonicAirplane();
		
		obj1.takeOff();
		obj1.fly();		//자식
		obj1.flyMode = SupersonicAirplane.SUPERSONIC;
		obj1.fly();
		obj1.flyMode = SupersonicAirplane.NORMAL;
		obj1.fly();
		obj1.land();
	}

}
