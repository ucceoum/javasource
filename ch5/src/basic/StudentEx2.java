package basic;

public class StudentEx2 {

	public static void main(String[] args) {
		//타입 객체변수 = new 타입();
		
		//Student 객체 생성
		Student2 obj = new Student2();
		Student2 obj1 = new Student2("홍길동","20191010");
		Student2 obj2 = new Student2("성춘향","20192020","서울");
		
		
		//초기화
//		obj.name = "홍길동";
//		obj.id = "2019010101";
//		obj.addr = "노원구 공릉동";
//		obj.mobile = "010-7890-1234";
//		obj.dept = "소프트웨어";
//		obj.deptNo = 3;
		

		
		print(obj);
		
		
		
		
		//두번째 객체 생성
		
//		obj1.name = "성춘향";
//		obj1.addr = "강남구 신사동";
//		obj1.id = "2019456789";
//		obj1.mobile = "010-1111-2222";
//		obj1.dept = "통계학과";
//		obj1.deptNo = 5;
		
		
		System.out.println();

		
		print(obj1);
		
		
		
		
		System.out.println();
		
		
		
		
		
		
		
		
		
		
		
		print(obj2);
		
		
		
		
		
		
		
		
		
		
		
		
		
	}
	
	
	static void print(Student2 obj) {
		
		System.out.println("이름 : "+obj.name);
		System.out.println("학번 : "+obj.id);
		System.out.println("주소 : "+obj.addr);
		System.out.println("전화번호 : "+obj.mobile);
		System.out.println("학과 : "+obj.dept);
		System.out.println("학과번호 : "+obj.deptNo);
		
		
		
		
		
	}
	
	
	
	
	
	
	

}
