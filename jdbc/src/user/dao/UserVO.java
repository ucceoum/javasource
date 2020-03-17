package user.dao;

public class UserVO {	
	//VO(Value Object) : 값을 담는 객체
	//					 DB 결과값을 담는 용도로 사용
	private int no;
	private String userName;
	private int birthYear;
	private String addr;
	private String mobile;
	
	
	public UserVO() {
		super();
		// TODO Auto-generated constructor stub
	}
	public UserVO(int no, String userName, int birthYear, String addr, String mobile) {
		super();
		this.no = no;
		this.userName = userName;
		this.birthYear = birthYear;
		this.addr = addr;
		this.mobile = mobile;
	}
	public int getNo() {
		return no;
	}
	public void setNo(int no) {
		this.no = no;
	}
	public String getUserName() {
		return userName;
	}
	public void setUserName(String userName) {
		this.userName = userName;
	}
	public int getBirthYear() {
		return birthYear;
	}
	public void setBirthYear(int birthYear) {
		this.birthYear = birthYear;
	}
	public String getAddr() {
		return addr;
	}
	public void setAddr(String addr) {
		this.addr = addr;
	}
	public String getMobile() {
		return mobile;
	}
	public void setMobile(String mobile) {
		this.mobile = mobile;
	}
	@Override
	public String toString() {
		return "UserVO [no=" + no + ", userName=" + userName + ", birthYear=" + birthYear + ", addr=" + addr
				+ ", mobile=" + mobile + "]";
	}
	
	
}
