package basic;
//클래스 상속 금지
public final class FinalTest {
	//값을 변경할 수 없는 상수로 사용
	final static int MIN_SIZE = 0;
	final int MAX_SIZE = 10;
	
	
	//메소드 오버라이딩 금지
	final int getMaxSize() {
		//상수(지역변수)
		final int LV = MAX_SIZE;
		return MAX_SIZE;
	}
	
	
	
}
