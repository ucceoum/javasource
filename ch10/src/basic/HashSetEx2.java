package basic;

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class HashSetEx2 {

	public static void main(String[] args) {
		Set<Integer> set = new HashSet<Integer>();
		
		List<Integer> list = new ArrayList<Integer>();
		
		
		
		
		for(int i = 0; i < 6; i++) {
			int num = (int)(Math.random()*45)+1;
			list.add(num);
			set.add(num);
		}
		
		Collections.sort(list);
		
		for(Integer i : list) {
			System.out.print(i+" ");
		}
		System.out.println();
		for(Integer i : set) {
			System.out.print(i+" ");
		}
		
		
	}

}
