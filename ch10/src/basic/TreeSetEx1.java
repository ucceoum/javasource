package basic;


import java.util.Set;
import java.util.TreeSet;

public class TreeSetEx1 {
	
	
	public static void main(String[] args) {
		// 이진검색트리 구현
		
		
		Set<Integer> set = new TreeSet<Integer>();
		
		for(int i = 0; set.size() < 6; i++) {
			int num = (int)(Math.random()*45)+1;
			set.add(num);
		}
		System.out.println(set);
		
		
		
		
		
		
		
		
	}
}
