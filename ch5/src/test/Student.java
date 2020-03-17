package test;

public class Student {
	//속성(특징, 멤버변수, 필드, 프로퍼티...)
	// 접근제한자 타입 변수명
	// 이름, 학번, 전화번호, 주소, 전공, ... => 변수의 형태로 구현
	
	private String name;	//이름
	private String id;		//학번
	private String mobile;	//전화번호
	private String addr;	//주소
	private String dept;	//전공
	private int deptNo;		//학과번호
	
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
	
	public Student(String name, String id, String mobile, String addr, String dept, int deptNo) {
		super();
		this.name = name;
		this.id = id;
		this.mobile = mobile;
		this.addr = addr;
		this.dept = dept;
		this.deptNo = deptNo;
	}
	
	
	
	
	
	
	

	

	public void setName(String name) {
		this.name = name;
	}
	public void setId(String id) {
		this.id = id;
	}
	public void setMobile(String mobile) {
		this.mobile = mobile;
	}
	public void setAddr(String addr) {
		this.addr = addr;
	}
	public void setDept(String dept) {
		this.dept = dept;
	}
	public void setDeptNo(int deptNo) {
		this.deptNo = deptNo;
	}





	public String getName() {
		return name;
	}
	public String getId() {
		return id;
	}
	public String getMobile() {
		return mobile;
	}
	public String getAddr() {
		return addr;
	}
	public String getDept() {
		return dept;
	}
	public int getDeptNo() {
		return deptNo;
	}










	public Student() {
		super();
		// TODO Auto-generated constructor stub
	}


	
	
	
	
	
	
	
	










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
