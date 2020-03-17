package basic;

public class ReferenceType {

	public static void main(String[] args) {
		//참조타입 : 배열, 열거, 클래스, 인터페이스
																	//참조타입의 특징 - ① null값으로 초기화 가능
		//
		
//		int i=null;				//기본타입은 null을 줄 수 없음
//		System.out.println(i);
		
		String str=null;
		System.out.println(str);
		// NullPointerException
//		System.out.println(str.length());
		
																	//참조타입의 특징 - ② ==, != : 동일한 객체의 참조 여부
		String str1 = new String("홍길동");
		String str2 = new String("홍길동");
		System.out.println(str1 == str2 ? true : false);
		
		
		
		
		
		
		
		
		
		
		
		
		
		
	}

}
