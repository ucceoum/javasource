package basic;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class ArrayToListEx3 {

	public static void main(String[] args) {
		
		//리스트를 배열로 만들고 싶다면?
		List<String> list = new ArrayList<>();
		list.add("사과");
		list.add("포도");
		list.add("수박");
		list.add("참외");
		list.add("바나나");
		list.add("자두");
		
		Object[] arr1 = list.toArray();
		
		for(Object str : arr1) {
			System.out.println(str);
		}
		
		
		
		
		
	}

}
