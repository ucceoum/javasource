package basic.modifier;

public class TV {
	
	//속성 - 색상, 전원상태, 채널
	private String color;
	private boolean power;
	private int channel;
	
	
	public TV(String color, boolean power, int channel) {
		super();
		this.color = color;
		this.power = power;
		this.channel = channel;
	}
	
	
	
	
	
	
	
	
	
	
	
	//기능 - 전원을 켠다/끈다, 채널을 올린다/내린다,
	
	

	public String getColor() {
		return color;
	}

	public boolean isPower() {
		return power;
	}
	public int getChannel() {
		return channel;
	}











	public void power() {
		power = !power;
	}
	
	public void channelUp() {
		channel++;
	}
	 
	public void channelDown() {
		channel--;
	}
	
	
	
	
	
	
	
	
	
	

}
