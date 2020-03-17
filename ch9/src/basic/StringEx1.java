package basic;

public class StringEx1 {

	public static void main(String[] args) {
		char ch[] = {'H','e','l','l','o'};
		String str1 = new String(ch);
		System.out.println(str1);	//str1.toString()
		
		
		
		byte bytes[] = {72,101,108,108,111,32,74,97,118,97};
		String str2 = new String(bytes);
		System.out.println(str2);
		
		
		
		//String 객체 생성시 String pool 을 이용함
		String str3 = "Hello!";
		System.out.println(str3);
		
		//new ~ : 새롭게 메모리 할당해서 생성됨
		String str4 = new String("Hello!!! Java");
		System.out.println(str4);
		
		
		//문자열 다루기 위한 객체 : String, StringBuffer, StringBuilder
		//String : 변경되지 않음
		//StringBuffer(thread-safe : multi thread),
		//StringBuilder(single thread) 						: 변경가능함
		StringBuffer buf = new StringBuffer("안녕하세요");
		String str5 = new String(buf);
		System.out.println(str5);
		
		StringBuilder sb = new StringBuilder("안녕하세요!!!");
		String str6 = new String(sb);
		System.out.println(str6);
		
		
		
		
		
		
		
		
		
		
		
	}

}
