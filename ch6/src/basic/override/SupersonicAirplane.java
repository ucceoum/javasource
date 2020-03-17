package basic.override;

public class SupersonicAirplane extends Airplane {
	
	public static final int NORMAL = 1;
	public static final int SUPERSONIC = 2;
	
	
	public int flyMode = NORMAL;
	
	
	@Override
	public void fly() {
		
		if(flyMode == SUPERSONIC) {
			
			System.out.println("초음속 비행중!!");
			
			
		}else {
			super.fly();
		}
	}
	
	
	
	
	
	
}
