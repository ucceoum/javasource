package basic;

public class StringEx2 {

	public static void main(String[] args) {
		
		String str1 = "Hello! Java";
		
		//문자열을 하나씩 가져와서 출력하기
		
		
		
		char[] chArr = new char[str1.length()];
		for(int i = 0; i < str1.length(); i++) {
			chArr[i] = str1.charAt(i);
		}
		
		
//		char[] chArr = str1.toCharArray();
		
		for(char ch : chArr) {
			System.out.println(ch);
		}
		
		
		
		
	}

}
