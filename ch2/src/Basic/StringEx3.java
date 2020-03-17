package Basic;

public class StringEx3 {

	public static void main(String[] args) {
		String str1 = "JDK";
		String str2 = new String("JDK");
		String str3 = "JDK";
		
		
		
		System.out.println("str1==str2 : "+(str1==str2));
		System.out.println("str1.equals(str2) : "+str1.equals(str2));
		System.out.println("str1==str3 : "+(str1==str3));
	}

}
