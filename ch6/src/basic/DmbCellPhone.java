package basic;

public class DmbCellPhone extends CellPhone{
	int channel;
	
	void turnOnDmb() {
		System.out.println("채널 "+channel+"번 DMB 방송 시작");
	}
	void changeChannelDmb(int channel) {
		this.channel = channel;
		System.out.println("DMB 채널 "+channel+" 번 변경");
	}
	void turnOffDmb() {
		System.out.println("DMB 방송 종료");
	}
	
	
	public DmbCellPhone() {
		super();		//부모 클래스의 default 생성자 호출
	} 
	
	
	
	
	
	
	
	
	
	
	
	
}
