package Basic;

public class StringEx2 {

	public static void main(String[] args) {
		String str1 = new String("JDK");
		String str2 = new String("Oracle");
		String str3 = new String("JDK");
		
		System.out.println(str1==str2);			//f
		System.out.println(str1==str3);			//f
		
		//문자열의 값이 같은지 비교할 땐 무조건 equals~
		System.out.println(str1.equals(str3));	//t
		
		
		//equals : 대소문자를 구별하여 비교해줌
		//equalsignorecase : 대소문자를 무시하교 비교해줌
		String str4 = new String("jdk");		//JDK == jdk
		System.out.println(str1.equalsIgnoreCase(str4));	//f
		
		
	}

}
