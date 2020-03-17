package basic;

public class Car {
	
	//생성자 : 모든 클래스 마다 하나
	
	
	
	
	
	
	//제조회사
	String company;
	//모델명
	String model;
	//색상
	String color;
	//최대속도
	int maxSpeed;
	
	
	//생성자
	// 생성자 오버로딩  (생성자를 2개 이상 만드는 것)
	Car(){}				// 기본생성자
	Car(String company, String model){
		this.company = company;
		this.model = model;
	}
	Car(String company, String model, String color){
//		this.company = company;
//		this.model = model;
		this(company, model); //같은 클래스의 다른 생성자 호출
		this.color = color;
	}
	Car(String company, String model, String color, int maxSpeed){
//		this.company = company;
//		this.model = model;
//		this.color = color;
		this(company, model, color);
		this.maxSpeed = maxSpeed;
	}
	
	//전진한다
	
	void forward() {}
	
	
	//후진한다
	void backward() {}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
}
