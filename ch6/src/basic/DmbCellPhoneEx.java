package basic;

public class DmbCellPhoneEx {

	public static void main(String[] args) {
		
		DmbCellPhone phone = new DmbCellPhone();
		
		phone.powerOn();
		phone.channel = 7;
		
		phone.bell();
		phone.sendVoice("안녕하세요");
		phone.receiveVoice("오늘 약속 잊지 않았지?");
		phone.sendVoice("네!");
		phone.hangUp();
		
		phone.changeChannelDmb(8);
		System.out.println("현재 수신하고 있는 DMB 채널 : "+phone.channel);
		phone.powerOff();
		
		
		
		
	}

}
