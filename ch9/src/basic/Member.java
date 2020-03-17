package basic;

public class Member {
	
	private String id;

	public Member(String id) {
		super();
		this.id = new String(id);
	}
	
	
	@Override
	public String toString() {
		return id;
	}
	
	
	@Override
	public boolean equals(Object obj) {
	
		Member other = (Member)obj;
		if(id != other.id) {
			return false;
		}
		
		
		return true;
	}
	
	
	
	
	
	
	
}
