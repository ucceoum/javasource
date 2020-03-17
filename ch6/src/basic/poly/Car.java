package basic.poly;

/* 관계
 * ① 상속관계(is-a) : ~은 ~이다.
 * ② 포함관게(has-a) : ~은 ~을 가지고 있다.
 */


public class Car {
	
	//속성, 필드, 인스턴스 변수
	//자동차는 타이어를 가지고 있다
	
	Tire frontLeftTire = new Tire(6,"앞 왼쪽");
	Tire frontRightTire = new Tire(3,"앞 오른쪽");
	Tire backLeftTire = new Tire(4,"뒤 왼쪽");
	Tire backRightTire = new Tire(2,"뒤 오른쪽");
	
	
	public int run() {
		System.out.println("자동차가 달립니다.");
		if(!frontLeftTire.roll()) {
			stop();
			return 1;
		}
		if(!frontRightTire.roll()) {
			stop();
			return 2;
		}
		if(!backLeftTire.roll()) {
			stop();
			return 3;
		}
		if(!backRightTire.roll()) {
			stop();
			return 4;
		}
		return 0;
	}
	
	public void stop() {
		System.out.println("자동차가 멈춥니다.");
	}
	
	
	
}
