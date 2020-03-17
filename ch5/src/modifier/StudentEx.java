package modifier;

import test.Student;		//같은 패키지에 있는 클래스라면 필요없음
 
public class StudentEx {

	public static void main(String[] args) {
		
		Student student = new Student();
		
		
		
		student.setId("20191210");
		student.setName("김호진");
		
		System.out.println(student.getName());
		System.out.println(student.getId());
		
		
		
	}

}
