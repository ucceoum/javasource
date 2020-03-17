package basic;

import java.util.HashSet;
import java.util.Set;

public class HashSetEx3 {

	public static void main(String[] args) {
		// Set : 중복된 값 저장 안함(hashCode값, equals 값)
		//	   : Person2 객체의 아이디가 같으면 저장을 안하기
		
		
		Set<Person2> set = new HashSet<Person2>();
		
		Person2 p1 = new Person2(1234, "홍길동");
		Person2 p2 = new Person2(1234, "홍길동");
		
		
		
		set.add(p1);
		set.add(p2);
		
		
		System.out.println("p1.hashCode() : "+p1.hashCode());
		System.out.println("p2.hashCode() : "+p2.hashCode());
		System.out.println(p1.equals(p2));
		
		for(Person2 p : set) {
			System.out.println(p);
		}
		
	}

}
