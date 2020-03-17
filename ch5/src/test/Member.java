package test;

public class Member {
	//외부에서 직접 접근 불가의 형태로 선언
		
	//name		이름  문자열
	//id		아이디 문자열
	//password	비밀번호 문자열
	//age		나이 정수
	private String name;
	private String id;
	private String password;
	private int age;
	
	//생성자
	public Member() {
		super();
		// TODO Auto-generated constructor stub
	}
	public Member(String name) {
		super();
		this.name = name;
	}
	public Member(String name, String id) {
		super();
		this.name = name;
		this.id = id;
	}
	public Member(String name, String id, String password) {
		super();
		this.name = name;
		this.id = id;
		this.password = password;
	}
	public Member(String name, String id, String password, int age) {
		super();
		this.name = name;
		this.id = id;
		this.password = password;
		this.age = age;
	}
	
	
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getId() {
		return id;
	}
	public void setId(String id) {
		this.id = id;
	}
	public String getPassword() {
		return password;
	}
	public void setPassword(String password) {
		this.password = password;
	}
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}
	
	//메소드 
	//login() : 리턴타입은 boolean, 매개변수 id, password 받는 형태
	//			아이디는 hong, 비밀번호는 12345 인 경우만 true 리턴
	//			아닌 경우는 false 리턴
	public boolean login(String id, String password) {
		
		if(id.equals("hong") && password.equals("12345")) {
			return true;
		}
		return false;
	}
	
	//logout() : 로그아웃 되었습니다. 메세지 출력
	public void logout() {
		System.out.println("로그아웃 되었습니다.");
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
}
