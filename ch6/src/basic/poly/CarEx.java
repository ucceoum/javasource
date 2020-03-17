package basic.poly;

public class CarEx {

	public static void main(String[] args) {
		Car car = new Car();
		
		for(int i = 1; i <= 5; i++) {
			int problemLocation = car.run();
			switch(problemLocation) {
			case 1:
				System.out.println("앞 왼쪽 Hankook Tire로 교체");
				car.frontLeftTire = new HanKookTire(15,"앞 왼쪽");
				break;
			case 2:
				System.out.println("앞 오른쪽 Kumho Tire로 교체");
				car.frontRightTire = new KumhoTire(10,"앞 오른쪽");
				break;
			case 3:
				System.out.println("뒤 왼쪽 Hankook Tire로 교체");
				car.backLeftTire = new HanKookTire(5,"앞 오른쪽");
				break;
			case 4:
				System.out.println("뒤 오른쪽 Kumho Tire로 교체");
				car.backRightTire = new KumhoTire(15,"앞 오른쪽");
				break;
			}
			System.out.println("\n------------------------------\n");
			
		}
		
		
		
		
		
		
		
		
	}

}
