package basic;

public class StringEx3 {

	public static void main(String[] args) {
		String str1 = "자바 프로그래밍";
		
		//문자열에 '프'가 있는지 확인하기
		//프가 있다면 해당 위치 출력하기
		
		for(int i = 0; i < str1.length(); i++) {
			if(str1.charAt(i) == '프') {
				System.out.println((i+1)+"번째에 있음");
				break;
			}
						
		}
		
		System.out.println();
		System.out.println(str1.indexOf("프라자")); // -1 (못찾는 경우)
		System.out.println(str1.indexOf("프로")); // 3 (찾은경우 시작위치)
		
		
		System.out.println();
		String str2 = "Hello";
		System.out.println(str2.indexOf('o'));
		System.out.println(str2.indexOf('f'));
		
		//문자열 내에서 시작위치를 지정하여 찾기
		System.out.println(str2.indexOf("el",2));
		
		System.out.println();
		String str3 = "HelloHelloHelloHello World";
		System.out.println(str3.lastIndexOf('o'));
		
		
		
		
		
		
		
		
		
		
		
	}

}
