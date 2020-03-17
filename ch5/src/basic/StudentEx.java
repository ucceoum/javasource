package basic;

public class StudentEx {

	public static void main(String[] args) {
		//타입 객체변수 = new 타입();
		
		//Student 객체 생성
		Student obj = new Student();
		
		
		//초기화
		obj.name = "홍길동";
		obj.id = "2019010101";
		obj.addr = "노원구 공릉동";
		obj.mobile = "010-7890-1234";
		obj.dept = "소프트웨어";
		obj.deptNo = 3;
		
		
		System.out.println("이름 : "+obj.name);
		System.out.println("학번 : "+obj.id);
		System.out.println("주소 : "+obj.addr);
		System.out.println("전화번호 : "+obj.mobile);
		System.out.println("학과 : "+obj.dept);
		System.out.println("학과번호 : "+obj.deptNo);
		
		
		
		//전화번호 변경
		//메소드 호출
		obj.changeMobile("010-3233-4568");
		System.out.println("홍길동 바뀐 전화번호 : "+obj.mobile);
		//주소변경
//		String addr = obj.changeAddr("경기도 성남시");
//		System.out.println("홍길동 바뀐 주소 : "+addr);
		
		System.out.println("홍길동의 바뀐 주소 : "+obj.changeAddr("경기도 성남시"));
		
		//두번째 객체 생성
		
		Student obj1 = new Student();
		obj1.name = "성춘향";
		obj1.addr = "강남구 신사동";
		obj1.id = "2019456789";
		obj1.mobile = "010-1111-2222";
		obj1.dept = "통계학과";
		obj1.deptNo = 5;
		
		
		System.out.println();
		
		System.out.println("이름 : "+obj1.name);
		System.out.println("학번 : "+obj1.id);
		System.out.println("주소 : "+obj1.addr);
		System.out.println("전화번호 : "+obj1.mobile);
		System.out.println("학과 : "+obj1.dept);
		System.out.println("학과번호 : "+obj1.deptNo);
		
		
		System.out.println();
		
		
		
		
		
		
		
		
	}

}
