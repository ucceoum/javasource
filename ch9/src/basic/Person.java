package basic;

public class Person {
	private String name;
	private String addr;
	
	public Person(String name, String addr) {
		super();
		this.name = name;
		this.addr = addr;
	}
	
	
	@Override
	public String toString() {
	
		
		return this.name+" "+this.addr  ;
	}
	
	
	@Override
	public boolean equals(Object obj) {
		Person other = (Person)obj;
		if(this.name == other.name && this.addr == other.addr) {
			return true;
		}
		return false;
	}
	
	
	
}
