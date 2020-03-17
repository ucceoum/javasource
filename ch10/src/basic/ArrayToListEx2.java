package basic;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class ArrayToListEx2 {

	public static void main(String[] args) {
		
		//배열을 리스트로 만들고 싶다면
		String fruits[] = {"사과","포도","수박","참외","바나나","자두"};
		
		List<String> list = new ArrayList<>(Arrays.asList(fruits));
		list.add("망고");
		
		
		for(String str : list) {
			System.out.println(str);
		}
		
		
		
		
		
	}

}
