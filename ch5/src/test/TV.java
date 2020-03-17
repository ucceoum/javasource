package test;

public class TV {
	
	//속성 - 색상, 전원상태, 채널
	private String color;
	private boolean power;
	private int channel;
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	public String getColor() {
		return color;
	}

	public void setColor(String color) {
		this.color = color;
	}

	public boolean isPower() {
		return power;
	}

	public void setPower(boolean power) {
		this.power = power;
	}

	public int getChannel() {
		return channel;
	}

	public void setChannel(int channel) {
		this.channel = channel;
	}

	public TV(String color, boolean power, int channel) {
		super();
		this.color = color;
		this.power = power;
		this.channel = channel;
	}

	//기능 - 전원을 켠다/끈다, 채널을 올린다/내린다,
	
	
	public TV() {
		super();
		// TODO Auto-generated constructor stub
	}

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
