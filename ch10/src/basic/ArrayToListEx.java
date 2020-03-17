package basic;

import java.util.Arrays;
import java.util.List;

public class ArrayToListEx {

	public static void main(String[] args) {
		
		//배열을 리스트로 만들고 싶다면
		String fruits[] = {"사과","포도","수박","참외","바나나","자두"};
		
		List<String> list = Arrays.asList(fruits);
//		java.lang.UnsupportedOperationException
//		abstractList
//		list.add("망고");   -> 추가 안됨
		
		
		for(String str : list) {
			System.out.println(str);
		}
		
		
		
		
		
	}

}
