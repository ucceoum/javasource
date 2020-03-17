package basic;

public class StringBufferEx3 {

	public static void main(String[] args) {
		
		String str1 = "ABCDEabcdzky";
				
		//거꾸로 출력하기		
		for(int i = str1.length()-1; i >= 0; i--) {
			System.out.print(str1.charAt(i));
		}
		
		System.out.println();
		StringBuilder builder = new StringBuilder(str1);
		
		System.out.println(builder.reverse());
		
		System.out.println(builder);
		
		StringBuilder builder2 = new StringBuilder("abcd");
		String str2 = new String(builder2);
		
		String str3 = builder2.toString();
		
		StringBuilder builder3 = new StringBuilder("abcd");
		System.out.println(builder2 == builder3);
		System.out.println(builder2.equals(builder3));
		
		String str4 = builder3.toString();
		
		System.out.println(builder2.equals(builder3));
		System.out.println(str2.equals(str4));
				
		
		
	}

}
