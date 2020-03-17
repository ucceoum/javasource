package basic;

public class DmbCellPhone2 extends CellPhone2{
	int channel;
	
	
	/*자식 클래스의 생성자 안에는 무조건 부모의 default 생성자를 호출하는
	 * 코드가 들어있음. => 부모의 클래스에 default생성자가 없다면
	 * 인자를 받는 생성자로 호출 하면됨
	 * 
	 * 
	 */
	
	public DmbCellPhone2(String model, String color) {
		super(model, color);		//부모 클래스의 default 생성자 호출
	} 
	public DmbCellPhone2(String model, String color, int channel) {
		this(model, color);		//부모 클래스의 default 생성자 호출
//		this.model = model;
//		this.color = color;
		this.channel = channel;
	} 
	
	
	
	
	
	
	
	
	
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
	
	
	
	
	
	
	
	
	
	
	
	
	
}
