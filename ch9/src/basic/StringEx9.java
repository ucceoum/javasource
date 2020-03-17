package basic;

public class StringEx9 {

	public static void main(String[] args) {
		//공백제거 trim : 좌우 공백만 제거
		
		String str1 = "     abc";
		System.out.println("공백제거 전 : "+str1);
		System.out.println("공백제거 후 : "+str1.trim());

		
		
		String str2 = "     abc         def         ";
		System.out.println("공백제거 전 : "+str2);
		System.out.println("공백제거 후 : "+str2.trim());
		
		//~로 시작하는
		//~로 끝나는
		
		String str3 = "java.lang.Object";
		System.out.println(str3.startsWith("java"));
		System.out.println(str3.startsWith("Java"));
		System.out.println(str3.endsWith("java"));
		System.out.println(str3.endsWith("ct"));
		
	}

}
