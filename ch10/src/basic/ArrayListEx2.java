package basic;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class ArrayListEx2 {

	public static void main(String[] args) {
		//int 타입
		List<Integer> list = new ArrayList<Integer>();
		
		list.add(15);
		list.add(25);
		list.add(45);
		list.add(9);
		list.add(0);
		list.add(34);
		
		System.out.println(list.get(3));
		
		
		//배열 -> Arrays.sort();
		//List -> Collections.sort(), list.sort()
		list.sort(Comparator.naturalOrder());		//오름차순 정렬
		list.sort(Comparator.reverseOrder());		//내림차순 정렬
		
		
		Collections.sort(list);								//오름차순 정렬
		Collections.sort(list,Comparator.reverseOrder());	//내림차순 정렬
		
		for(Integer i : list) {
			System.out.println(i);
		}
		
		
		
		
		
		
	}

}
