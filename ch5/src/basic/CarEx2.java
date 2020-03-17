package basic;

public class CarEx2 {

	public static void main(String[] args) {
		//Car 인스턴스 생성
		
		Car car1 = new Car();
		Car car2 = new Car("기아","모닝");
		Car car3 = new Car("현대","투싼","white");
		Car car4 = new Car("현대","그랜저","black",200);
		
		System.out.println("첫번째");
		print(car1);
		
		System.out.println();
		
		System.out.println("두번째");
		print(car2);
		
		System.out.println();
		
		System.out.println("세번째");
		print(car3);
		
		System.out.println();
		
		System.out.println("네번째");
		
		print(car4);
		
		
		


		
		
	}

	static void print(Car car) {
		
		
		System.out.println("company : "+car.company);
		System.out.println("mdel : "+car.model);
		System.out.println("color : "+car.color);
		System.out.println("maxSpeed : "+car.maxSpeed);
		
		
		
		
		
		
		
		
		
		
	}
	
	
	
	
	
	
	
	
}
