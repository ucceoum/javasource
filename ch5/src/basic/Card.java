package basic;

public class Card {
	//인스턴스 변수(필드..)
	String kind;
	int number;
	
	//클래스 변수 : 객체 생성 없이 사용할 수 있는 필드
	static int width;
	static int height = 200;
	
	
	static {			//정적 초기화 블럭
		width = height*10;
	}
	
	
}
