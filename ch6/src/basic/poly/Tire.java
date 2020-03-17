package basic.poly;

public class Tire {
	
	int maxRotation;
	int accumulatedRotation;
	String location;
	
	public Tire(int maxRotation, String location) {
		super();
		this.maxRotation = maxRotation;
		this.location = location;
	}
	
	
	public boolean roll() {
		++accumulatedRotation;
		if(accumulatedRotation < maxRotation) {
			System.out.println(location + "Tire 수명 "+(maxRotation-accumulatedRotation)+"회");
			return true;
		}else {
			System.out.println("*** "+location+" Tire 펑크 ***");
			return false;
		}
	}
	
	
	
	
	
	
	
}
