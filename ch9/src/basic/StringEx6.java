package basic;

public class StringEx6 {

	public static void main(String[] args) {
		
		//문자열 잘라내기 : substring
		String ssn = "880516-1001234";
		
		System.out.println(ssn.substring(8));
		System.out.println(ssn.substring(7,10));//100
		
		
		
		//split
		String strArr[] = ssn.split("-");
		for(String s : strArr) {
			System.out.println(s);
		}
		
		String animals = "dog,cat,bear";
		String aniArr[] = animals.split(",",2);
		for(String s:aniArr) {
			System.out.println(s);
		}
		
		
		String fruits = "apple mellon banana";
		
		String fruArr[] = fruits.split(" ");
		for(String s : fruArr) {
			System.out.println(s);
		}
		
		
		
	}

}
