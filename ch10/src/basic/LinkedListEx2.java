package basic;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

public class LinkedListEx2 {

	public static void main(String[] args) {
		 
		ArrayList<String> list1 = new ArrayList<String>(2000000);
		LinkedList<String> list2 = new LinkedList<String>();
		
		
		System.out.println("순차 추가");
		System.out.println("ArrayList : "+add1(list1));
		System.out.println("LinkedList : "+add1(list2));
		
		System.out.println("중간 추가");
		System.out.println("ArrayList : "+add2(list1));
		System.out.println("LinkedList : "+add2(list2));
		
		System.out.println(list1.get(550));
		System.out.println(list1.get(10501));
		
	}

	public static long add1(List<String> list) {
		long start = System.currentTimeMillis();
		for(int i = 0; i < 1000000; i++) {
			list.add(i+"");
		}
		long end = System.currentTimeMillis();
		return end-start;
		
	}
	
	
	public static long add2(List<String> list) {
		long start = System.currentTimeMillis();
		for(int i = 0; i < 10000; i++) {
			list.add(500,i+"");
		}
		long end = System.currentTimeMillis();
		return end-start;
		
	}
	
}
