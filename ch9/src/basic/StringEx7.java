package basic;

public class StringEx7 {

	public static void main(String[] args) {
		
		String str1 = new String(10+"");
		String str2 = new String(10.5+"");
		String str3 = new String(true+"");
		
		String str4 =String.valueOf(10+"");
		String str5 =String.valueOf(10.5+"");
		String str6 =String.valueOf(true+"");

		//toString()
		
		System.out.println(str1);
		System.out.println(str2);
		System.out.println(str3);
		
		
	}

}
