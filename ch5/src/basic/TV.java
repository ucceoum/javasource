package basic;

public class TV {
	
	//속성 - 색상, 전원상태, 채널
	String color;
	boolean power;
	int channel;
	
	
	//기능 - 전원을 켠다/끈다, 채널을 올린다/내린다,
	
	
	void power() {
		power = !power;
	}
	
	void channelUp() {
		channel++;
	}
	 
	void channelDown() {
		channel--;
	}
	
	
	
	
	
	
	
	
	
	

}
