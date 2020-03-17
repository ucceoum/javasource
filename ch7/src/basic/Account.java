package basic;


// 인터페이스 : 완전추상화
// 추상클래스 : 반 추상화

public interface Account {
	
	
	
	//final 을 붙이지 않아도 무조건 상수로 인식됨
	public final String NAME = "hong";
	
	
	
	//인터페이스에서 허용되는 메소드 형태
	// JDK8 버전부터 default, static 허용됨
	public default void deposit() {}
	public static void withdraw() {}
	
	//abstract를 붙이지 않아도 추상메소드로 인식됨
	public void getBalance();
	
	
	
	
	
	
}
