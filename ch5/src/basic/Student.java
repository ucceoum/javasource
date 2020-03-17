package basic;

public class Student {
	//속성(특징, 멤버변수, 필드, 프로퍼티...)
	// 접근제한자 타입 변수명
	// 이름, 학번, 전화번호, 주소, 전공, ... => 변수의 형태로 구현
	
	String name;	//이름
	String id;		//학번
	String mobile;	//전화번호
	String addr;	//주소
	String dept;	//전공
	int deptNo;		//학과번호
	
	/*
	 * 메소드 생성
	 * 접근제한자 리턴타입 메소드 명(){
	 * 		메소드 기능 정의
	 * }
	 * 
	 * 
	 * 리턴타입 : 기본타입, 레퍼런스 타입(배열, enum, 클래스, 인터페이스), void(리턴타입 없음)
	 * 인자(인수) 타입 : 기본타입, 레퍼런스 타입(배열, enum, 클래스, 인터페이스)
	 */
	
	//동작 (기능, 메소드, 함수...)
	//전화번호를 변경한다.
	void changeMobile(String mobile) {
		//전화번호 변경
		this.mobile = mobile;
		
	}
	
	//주소를 변경한다.
	
	String changeAddr(String addr) {
		this.addr=addr;
		
		
		
		return this.addr;
	}
	
	
	
	
	
	
	
	
	
	
	
}
