package test;

public class MemberEx {

	public static void main(String[] args) {

		Member mem1 = new Member("홍길동","Hong","12345",10);
		
		System.out.println("이름 : "+mem1.getName());
		System.out.println("아이디 : "+mem1.getId());
		System.out.println("비밀번호 : "+mem1.getPassword());
		System.out.println("나이 : "+mem1.getAge());
		
		boolean result = mem1.login("hong", "12345");
		
		if(result) {
			System.out.println("로그인 되었습니다.");
		}else {
			System.out.println("아이디와 비밀번호를 확인해 주세요");
		}
		
		mem1.logout();
		
		
		
		
		
	}

}
