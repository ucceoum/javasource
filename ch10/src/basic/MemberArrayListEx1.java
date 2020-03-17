package basic;

import java.util.ArrayList;
import java.util.List;

public class MemberArrayListEx1 {

	public static void main(String[] args) {
		
		List<Member> list = new ArrayList<Member>();
		System.out.println(list.isEmpty());
		
		list.add(new Member(1,"홍길동","hong123"));
		list.add(new Member(2,"박길동","park123"));
		list.add(new Member(3,"최길동","choi123"));
		list.add(new Member(4,"김길동","kim123"));
		list.add(new Member(5,"이길동","lee123"));
		list.add(new Member(6,"남길동","nam123"));
		
		for(Member member : list) {
			//member => member.toString();
			System.out.println(member);
		}
		
		
		
		
		
		
	}

}
