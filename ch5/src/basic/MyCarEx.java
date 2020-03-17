package basic;

public class MyCarEx {

	public static void main(String[] args) {
		// MyCar instance 생성
		MyCar car = new MyCar();
		
		//car 메소드 호출
		car.setGas(5);
		
		boolean gasState = car.isLeftGas();
		
		
		if(gasState) {
			System.out.println("출발합니다.");
			car.run();
		}
			
	
		if(car.isLeftGas()) {
			System.out.println("gas 주입 필요 없음");
		}else {
			System.out.println("gas 주입 필요함");
		}
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
	}

}
