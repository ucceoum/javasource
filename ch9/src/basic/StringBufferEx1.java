package basic;

public class StringBufferEx1 {

	public static void main(String[] args) {
		// StringBuffer sb2 = "Hello"; (X)
		
		
		//멀티 스레드 지원
		StringBuffer sb1 = new StringBuffer("Hello");
		sb1.replace(0, sb1.length()-1, "J");
		System.out.println(sb1);
		
		//싱글 스레드 지원
		StringBuilder sb2 = new StringBuilder("Hello");
		sb2.replace(0, 1, "J");
		System.out.println(sb2);
		
		
	}

}
