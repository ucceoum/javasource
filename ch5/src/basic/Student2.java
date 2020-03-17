package basic;

public class Student2 {
	
	//		클래스 :	설계도
//					속성(멤버 변수, 필드, 프로퍼티...)
//					기능(메소드,동작,멤버메소드..)
//					생성자 - 객체 생성시 초기화 역할 담당
//			객체 :	유형,무형,클래스를 사용할 수 있는 상태
//			인스턴스: 	어떤 클래스로부터 만들어진 객체
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	String name;	//이름
	String id;		//학번
	String mobile;	//전화번호
	String addr;	//주소
	String dept;	//전공
	int deptNo;		//학과번호
	
	
	
	
	//생성자(Constructor) - 객체 생성시 초기화 역할 담당
	// 접근제한자  클래스명(){}		- 접근제한자는 필수요소는 아님
	Student2(){}		//괄호안에 아무것도 없는 것 : default생성자
	Student2(String name, String id){
		this.name = name;
		this.id = id;
	}
	Student2(String name, String id, String addr){
		this.name = name;
		this.id = id;
		this.addr = addr;
		
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
	void changeMobile() {
		//전화번호 변경
		
		
	}
	
	//주소를 변경한다.
	
	String changeAddr() {
		
		return null;
	}
	
	
	
	
	
	
	
	
	
	
	
}
