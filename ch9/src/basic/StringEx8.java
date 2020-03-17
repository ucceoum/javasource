package basic;

public class StringEx8 {

	public static void main(String[] args) {
		
		//구분자를 이용한 문자열 연결
		String str1 = String.join("-","java","Recipe","is","great");
		System.out.println(str1);
		
		
		//비교
		String str2 = "aaa";
		String str3 = "abb";
		String str4 = "ccc";
		System.out.println("str2.compareTo(str3) : "+str2.compareTo(str3)); //str2(a) - str3(b) : 97-98
		System.out.println("str3.compareTo(str2) : "+str3.compareTo(str2)); //str3(b) - str2(a) : 98-97
		System.out.println("str3.compareTo(str4) : "+str3.compareTo(str4));
		System.out.println("str4.compareTo(str3) : "+str4.compareTo(str3));
		
		System.out.println();
		//영문자 대소문자 변경
		String str5 = "abcdefg";
		System.out.println(str5.toUpperCase());
		System.out.println(str5);
		String str6 = "ACEDEGG";
		System.out.println(str6.toLowerCase());
		
		
		
		
		
		
	}

}
