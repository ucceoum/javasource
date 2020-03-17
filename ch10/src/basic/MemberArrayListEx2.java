package basic;

import java.util.ArrayList;
import java.util.List;

public class MemberArrayListEx2 {

	public static void main(String[] args) {
		
		List<Member> list = new ArrayList<Member>();
		System.out.println(list.isEmpty());
		
		
		Member member1 = new Member();
		member1.setId(1);
		member1.setName("홍길동");
		member1.setPassword("hong123");
		list.add(member1);
		
		
		
		
//		list.add(new Member(1,"홍길동","hong123"));
//		list.add(new Member(2,"박길동","park123"));
//		list.add(new Member(3,"최길동","choi123"));
//		list.add(new Member(4,"김길동","kim123"));
//		list.add(new Member(5,"이길동","lee123"));
//		list.add(new Member(6,"남길동","nam123"));
		
		for(Member member : list) {
			//member => member.toString();
			System.out.println(member);
		}
		
		
		
		
		
		
	}

}
