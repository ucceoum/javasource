package basic;
//부모(super, 상위) 클래스
public class CellPhone {
	String model;
	String color;
	 
	
	
	
	
	
	
	
	
	
	
	public CellPhone() {
		super();
	}
	
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
