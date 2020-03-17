package student;

public class Student {
	
	private int student_no;
	private String student_name;
	private int student_year;
	private String student_addr;
	private String student_birth;
	public Student(int student_no, String student_name, int student_year, String student_addr, String student_birth) {
		super();
		this.student_no = student_no;
		this.student_name = student_name;
		this.student_year = student_year;
		this.student_addr = student_addr;
		this.student_birth = student_birth;
	}
	public int getStudent_no() {
		return student_no;
	}
	public void setStudent_no(int student_no) {
		this.student_no = student_no;
	}
	public String getStudent_name() {
		return student_name;
	}
	public void setStudent_name(String student_name) {
		this.student_name = student_name;
	}
	public int getStudent_year() {
		return student_year;
	}
	public void setStudent_year(int student_year) {
		this.student_year = student_year;
	}
	public String getStudent_addr() {
		return student_addr;
	}
	public void setStudent_addr(String student_addr) {
		this.student_addr = student_addr;
	}
	public String getStudent_birth() {
		return student_birth;
	}
	public void setStudent_birth(String student_birth) {
		this.student_birth = student_birth;
	}
	@Override
	public String toString() {
		return student_no+"\t"+student_name+"\t"+student_year;
	}
	
	
	
	
}
