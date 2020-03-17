package basic.poly;

public class HanKookTire extends Tire {

	public HanKookTire(int maxRotation, String location) {
		super(maxRotation, location);
	}
	
	
	@Override
	public boolean roll() {
		++accumulatedRotation;
		if(accumulatedRotation < maxRotation) {
			System.out.println(location + "Hankook Tire 수명 "+(maxRotation-accumulatedRotation)+"회");
			return true;
		}else {
			System.out.println("*** "+location+" Hankoon Tire 펑크 ***");
			return false;
		}
		
	}
	
	
	
}
