package basic;

public class Member {
	
	private Integer id;
	private String name;
	private String password;
	
	
	
	
	public Member() {
		super();
		// TODO Auto-generated constructor stub
	}
	
	
	
	public Member(Integer id, String name, String password) {
		super();
		this.id = id;
		this.name = name;
		this.password = password;
	}



	public Integer getId() {
		return id;
	}
	public void setId(Integer id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getPassword() {
		return password;
	}
	public void setPassword(String password) {
		this.password = password;
	}
	@Override
	public String toString() {
		return "Member [id=" + id + ", name=" + name + ", password=" + password + "]";
	}
	
	
	
	
	
}
