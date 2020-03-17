package basic;

public class Person2 {
	private Integer id;
	private String name;
	public Person2(Integer id, String name) {
		super();
		this.id = id;
		this.name = name;
	}
	@Override
	public String toString() {
		return "Person2 [id=" + id + ", name=" + name + "]";
	}
	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((id == null) ? 0 : id.hashCode());
		result = prime * result + ((name == null) ? 0 : name.hashCode());
		return result;
	}
	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Person2 other = (Person2) obj;
		if (id == null) {
			if (other.id != null)
				return false;
		} else if (!id.equals(other.id))
			return false;
		if (name == null) {
			if (other.name != null)
				return false;
		} else if (!name.equals(other.name))
			return false;
		return true;
	}
	
	
//	@Override
//	public boolean equals(Object obj) {
//		if(obj instanceof Person2) {
//			Person2 p = (Person2)obj;
//			return p.id.equals(this.id);
//		}
//		return false;
//	}
//	
//	@Override
//	public int hashCode() {
//		return id.hashCode();
//	}
	
	
	
	
	
	
	
	
	
	
}
