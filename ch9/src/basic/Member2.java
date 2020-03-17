package basic;

public class Member2 implements Comparable<Member2>{
		
	private String name;

	public Member2(String name) {
		super();
		this.name = name;
	}

	public String getName() {
		return name;
	}

	@Override
	public String toString() {
		return name+" ";
	}

	@Override
	public int compareTo(Member2 o) {
		//자기자신이 매개값보다 낮을 경우 음수 리턴
		// 같으면 0
		// 높으면 양수 리턴
		return this.name.compareTo(o.name);
	}
	
	
	
	
	
	
	
	
	
	
}
