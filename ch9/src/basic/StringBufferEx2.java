package basic;

public class StringBufferEx2 {

	public static void main(String[] args) {
		
		StringBuffer sb1 = new StringBuffer();
		System.out.println("sb1.capacity : "+sb1.capacity()); //16
		sb1.append("Java ");
		sb1.append("Programming");
		System.out.println(sb1);
		
		
		
		
		System.out.println(sb1.insert(5, "Great"));
		
		System.out.println(sb1.deleteCharAt(0));
		System.out.println("sb1.length : "+sb1.length());
		System.out.println("sb1.capacity : "+sb1.capacity()); //34
		
		
		
		
		
		
		System.out.println();
		String str1 = new String();
		str1 += "Java ";
		str1 += "Programming";
		System.out.println(str1);
		
		
		
		
	}

}
