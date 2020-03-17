package basic;

import java.util.ArrayList;
import java.util.List;

public class ArrayListEx1 {

	public static void main(String[] args) {
		
		//List : 배열의 개념과 같음
		//	   : 순서대로 저장, 중복값 허용
		
		
		//List를 구현하는 클래스 : ArrayList, Vector, Stack, LinkedList...
		List<String> list = new ArrayList<String>();
		System.out.println("list isEmpty : "+list.isEmpty());	//true
		//객체 삽입
		list.add("apple");
		list.add("java");
		list.add("jdbc");
		list.add(2,"mysql");
		list.add("mybatis");
		list.add("apple");
		
		
		// 길이 출력 : 배열의 length와 같은 역할
		System.out.println("list size : "+list.size());
		
		
		System.out.println("list isEmpty : "+list.isEmpty());	//false
		
		//삭제
		list.remove("java");	//list.remove(1);
		
		//가지고 있는지 확인
		System.out.println("list contains : "+list.contains("mybatis"));
		System.out.println("list indexOf : "+list.indexOf("mybatis"));
		
		
		
		
		//출력
		for(String str : list) {
			System.out.println(str);
		}
		
		
		
		
		
		
		
		
		
		
		
		
	}

}
