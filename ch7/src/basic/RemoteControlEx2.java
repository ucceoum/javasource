package basic;

public class RemoteControlEx2 {

	public static void main(String[] args) {
		
		
		//익명구현개체(Television, Audio 객체를 직접 만들지 않고 사용하기 위한 방식)
		RemoteControl rc = new RemoteControl() {
			
			@Override
			public void turnOn() {
				System.out.println("Radio 를 켭니다.");
			}
			
			@Override
			public void turnOff() {
				System.out.println("Radio 를 끕니다.");
			}
			
			@Override
			public void setVolume(int volume) {
				System.out.println("Radio 의 볼륨을 조절합니다.");
				
			}
		};
		
		
		rc.turnOn();
		rc.setVolume(10);
		rc.turnOff();
		
		
		
		
	}

}
