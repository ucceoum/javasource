package basic;

public class CarEx {

	public static void main(String[] args) {
		//Car 인스턴스 생성
		
		Car car1 = new Car();
		Car car2 = new Car("기아","모닝");
		Car car3 = new Car("현대","투싼","white");
		Car car4 = new Car("현대","그랜저","black",200);
		
		System.out.println("첫번째");
		System.out.println("company : "+car1.company);
		System.out.println("mdel : "+car1.model);
		System.out.println("color : "+car1.color);
		System.out.println("maxSpeed : "+car1.maxSpeed);
		
		System.out.println();
		
		System.out.println("두번째");
		System.out.println("company : "+car2.company);
		System.out.println("mdel : "+car2.model);
		System.out.println("color : "+car2.color);
		System.out.println("maxSpeed : "+car2.maxSpeed);
		
		System.out.println();
		
		System.out.println("세번째");
		System.out.println("company : "+car3.company);
		System.out.println("mdel : "+car3.model);
		System.out.println("color : "+car3.color);
		System.out.println("maxSpeed : "+car3.maxSpeed);
		
		System.out.println();
		
		System.out.println("네번째");
		System.out.println("company : "+car4.company);
		System.out.println("mdel : "+car4.model);
		System.out.println("color : "+car4.color);
		System.out.println("maxSpeed : "+car4.maxSpeed);
		
		
		
		
		
		
		
		
	}

}
