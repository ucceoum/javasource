package test;

public class StudentEx {

	public static void main(String[] args) {
		//타입 객체변수 = new 타입();
		
		//Student 객체 생성
		Student obj = new Student("홍길동","2019010101","010-7890-1234","노원구 공릉동","소프트웨어",3);
		
		
		
		
		//초기화					직접할당/ 생성자
		
		
		//직접 할당 => private 변수라면 불가
//		obj.name = "홍길동";
//		obj.id = "2019010101";
//		obj.addr = "노원구 공릉동";
//		obj.mobile = "010-7890-1234";
//		obj.dept = "소프트웨어";
//		obj.deptNo = 3;
//		
//		
		System.out.println("이름 : "+obj.getName());
		System.out.println("학번 : "+obj.getId());
		System.out.println("주소 : "+obj.getAddr());
		System.out.println("전화번호 : "+obj.getMobile());
		System.out.println("학과 : "+obj.getDept());
		System.out.println("학과번호 : "+obj.getDeptNo());
//		
//		
		
		//전화번호 변경
		//메소드 호출
		obj.changeMobile("010-3233-4568");
//		System.out.println("홍길동 바뀐 전화번호 : "+obj.mobile);
		//주소변경
//		String addr = obj.changeAddr("경기도 성남시");
//		System.out.println("홍길동 바뀐 주소 : "+addr);
		
		System.out.println("홍길동의 바뀐 주소 : "+obj.changeAddr("경기도 성남시"));
		
		//두번째 객체 생성
		
		Student obj1 = new Student();
		//초기화 + 값 변경 => set~
		obj1.setName("성춘향");
		obj1.setAddr("강남구 신사동");
		obj1.setId("2019456789");
		obj1.setMobile("010-1111-2222");
		obj1.setDept("통계학과");
		obj1.setDeptNo(5);
		
		
//		obj1.name = "성춘향";
//		obj1.addr = "강남구 신사동";
//		obj1.id = "2019456789";
//		obj1.mobile = "010-1111-2222";
//		obj1.dept = "통계학과";
//		obj1.deptNo = 5;
//		
//		
//		System.out.println();
//		
		System.out.println("이름 : "+obj1.getName());
		System.out.println("학번 : "+obj1.getId());
		System.out.println("주소 : "+obj1.getAddr());
		System.out.println("전화번호 : "+obj1.getMobile());
		System.out.println("학과 : "+obj1.getDept());
		System.out.println("학과번호 : "+obj1.getDeptNo());
//		
		
		System.out.println();
		
		
		
		
		
		
		
		
	}

}
