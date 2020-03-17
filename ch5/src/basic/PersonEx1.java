package basic;

public class PersonEx1 {

	public static void main(String[] args) {
		
		Person person = new Person("891226","홍길동");
		
		System.out.println("nation : "+person.nation +"ssn : "+person.ssn+"name : "+person.name);
		
		
		
		
				
		//final 필드의 값 변경 시도	=> 한번 초기화 후에는 변경 불가
//		person.ssn = "901206";
		
		
		
		
		
		
		
	}

}
