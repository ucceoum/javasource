package basic;
//부모(super, 상위) 클래스
public class CellPhone2 {
	String model;
	String color;
	 
	
	
	
	
	public CellPhone2(String model, String color) {
		super();			// 안써줘도 기본적으로 실행되는 코드
		this.model = model;
		this.color = color;
	}
	
	
	
	
	
	
//	public CellPhone2() {
//		super();
//	}
//	
	void powerOn() {
		System.out.println("전원을 켠다.");
	}
	void powerOff() {
		System.out.println("전원을 끈다.");
	}
	
	void bell() {
		System.out.println("벨이 울린다.");
	}
	void sendVoice(String msg) {
		System.out.println("본인 : "+msg);
	}
	void receiveVoice(String msg) {
		System.out.println("상대방 : "+msg);
	}
	void hangUp() {
		System.out.println("전화를 끊는다");
	}
}
